package com.cbfacademy.restapiexercise.ious;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Description;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.util.UriComponentsBuilder;

import com.cbfacademy.restapiexercise.RestApiExerciseApplication;

@SpringBootTest(classes = RestApiExerciseApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IOUControllerTest {

	@LocalServerPort
	private int port;

	private URI baseURI;

	@Autowired
	private TestRestTemplate restTemplate;

	private List<IOU> defaultIOUs = new ArrayList<>() {
		{
			add(new IOU("John", "Alice", new BigDecimal("100.00"), getInstant(24)));
			add(new IOU("Bob", "Eve", new BigDecimal("50.00"), getInstant(48)));
			add(new IOU("Charlie", "Grace", new BigDecimal("200.00"), getInstant(72)));
		}
	};

	@MockBean
	private IOUService iouService;

	@BeforeEach
	void setUp() throws RuntimeException {
		this.baseURI = UriComponentsBuilder.newInstance()
				.scheme("http")
				.host("localhost")
				.port(port)
				.path("api/ious")
				.build()
				.toUri();

		when(iouService.getAllIOUs()).thenReturn(defaultIOUs);
	}

	@Test
	@Description("POST /api/ious creates new IOU")
	void createIOU() {
		// Arrange
		IOU iou = createNewIOU();

		when(iouService.createIOU(any(IOU.class))).thenAnswer(invocation -> setId(invocation.getArgument(0)));

		// Act
		ResponseEntity<IOU> response = restTemplate.postForEntity(baseURI.toString(), iou, IOU.class);

		// Assert
		assertEquals(HttpStatus.CREATED, response.getStatusCode());
		assertNotNull(response.getBody());
		assertNotNull(response.getBody().getId());
		verify(iouService).createIOU(any(IOU.class));
	}

	@Test
	@Description("GET /api/ious returns all IOUs")
	void getAllIOUs() throws URISyntaxException {
		// Act
		ResponseEntity<List<IOU>> response = restTemplate.exchange(baseURI, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<IOU>>() {
				});
		List<IOU> responseIOUs = response.getBody();

		// Assert
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(responseIOUs);
		assertEquals(defaultIOUs.size(), responseIOUs.size());
		verify(iouService).getAllIOUs();
	}

	@Test
	@Description("GET /api/ious/{id} returns matching IOU")
	void getIOUById() {
		// Arrange
		IOU iou = selectRandomIOU();
		URI endpoint = getEndpoint(iou);

		when(iouService.getIOU(any(UUID.class))).thenReturn(iou);

		// Act
		ResponseEntity<IOU> response = restTemplate.getForEntity(endpoint, IOU.class);

		// Assert
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		assertEquals(iou.getId(), response.getBody().getId());
		verify(iouService).getIOU(iou.getId());
	}

	@Test
	@Description("GET /api/ious/{id} returns 404 for invalid IOU")
	void getInvalidIOU() {
		// Arrange
		IOU iou = createNewIOU();
		URI endpoint = getEndpoint(iou);

		when(iouService.getIOU(any(UUID.class))).thenThrow(NoSuchElementException.class);

		// Act
		ResponseEntity<IOU> response = restTemplate.getForEntity(endpoint, IOU.class);

		// Assert
		assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
		verify(iouService).getIOU(iou.getId());
	}

	@Test
	@Description("PUT /api/ious/{id} updates matching IOU")
	void updateIOU() {
		// Arrange
		IOU iou = selectRandomIOU();
		URI endpoint = getEndpoint(iou);

		when(iouService.getIOU(any(UUID.class))).thenReturn(iou);
		when(iouService.updateIOU(any(UUID.class), any(IOU.class))).thenReturn(iou);

		// Act
		iou.setLender("UpdatedLender");
		restTemplate.put(endpoint, iou);

		ResponseEntity<IOU> response = restTemplate.getForEntity(endpoint, IOU.class);
		IOU updatedIOU = response.getBody();

		// Assert
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(iou.getId(), updatedIOU.getId());
		assertEquals("UpdatedLender", updatedIOU.getLender());
		verify(iouService).getIOU(iou.getId());
		verify(iouService).updateIOU(any(UUID.class), any(IOU.class));
	}

	@Test
	@Description("PUT /api/ious/{id} returns 404 for invalid IOU")
	void updateInvalidIOU() {
		// Arrange
		IOU iou = createNewIOU();
		URI endpoint = getEndpoint(iou);

		when(iouService.updateIOU(any(UUID.class), any(IOU.class)))
				.thenThrow(new NoSuchElementException("IOU not found"));

		// Act
		RequestEntity<IOU> request = RequestEntity.put(endpoint).accept(MediaType.APPLICATION_JSON).body(iou);
		ResponseEntity<IOU> response = restTemplate.exchange(request, IOU.class);

		// Assert
		assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
		verify(iouService).updateIOU(any(UUID.class), any(IOU.class));
	}

	@Test
	@Description("DELETE /api/ious/{id} deletes matching IOU")
	void deleteIOU() {
		// Arrange
		IOU iou = selectRandomIOU();
		URI endpoint = getEndpoint(iou);

		when(iouService.getIOU(any(UUID.class))).thenReturn(iou);

		ResponseEntity<IOU> foundResponse = restTemplate.getForEntity(endpoint, IOU.class);

		doAnswer(invocation -> {
			return null;
		}).when(iouService).deleteIOU(any(UUID.class));
		when(iouService.getIOU(any(UUID.class))).thenThrow(NoSuchElementException.class);

		// Act
		RequestEntity<?> request = RequestEntity.delete(endpoint).accept(MediaType.APPLICATION_JSON).build();
		ResponseEntity<?> deletionResponse = restTemplate.exchange(request, Object.class);
		ResponseEntity<IOU> deletedResponse = restTemplate.getForEntity(endpoint, IOU.class);

		// Assert
		assertEquals(HttpStatus.OK, foundResponse.getStatusCode());
		assertTrue(deletionResponse.getStatusCode() == HttpStatus.OK
				|| deletionResponse.getStatusCode() == HttpStatus.NO_CONTENT);
		assertEquals(HttpStatus.NOT_FOUND, deletedResponse.getStatusCode());
		verify(iouService).deleteIOU(iou.getId());
	}

	@Test
	@Description("DELETE /api/ious/{id} returns 404 for invalid IOU")
	void deleteInvalidIOU() {
		// Arrange
		IOU iou = createNewIOU();
		URI endpoint = getEndpoint(iou);

		doThrow(new NoSuchElementException("IOU not found")).when(iouService).deleteIOU(any(UUID.class));

		// Act
		RequestEntity<?> request = RequestEntity.delete(endpoint).accept(MediaType.APPLICATION_JSON).build();
		ResponseEntity<IOU> response = restTemplate.exchange(request, IOU.class);

		// Assert
		assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
		verify(iouService).deleteIOU(iou.getId());
	}

	private IOU selectRandomIOU() {
		int randomIndex = new Random().nextInt(defaultIOUs.size());

		return setId(defaultIOUs.get(randomIndex));
	}

	private IOU createNewIOU() {
		return setId(new IOU("John", "Alice", new BigDecimal("100.00"), getInstant(0)));
	}

	private URI getEndpoint(IOU iou) {
		return appendPath(baseURI, iou.getId().toString());
	}

	private Instant getInstant(int hoursToSubtract) {
		// Get the current date and time in the system's default time zone
		ZoneId systemTimeZone = ZoneId.systemDefault();
		ZonedDateTime currentDateTime = ZonedDateTime.now(systemTimeZone);

		// Subtract the specified number of hours using Duration
		Duration duration = Duration.ofHours(hoursToSubtract);
		ZonedDateTime resultDateTime = currentDateTime.minus(duration);

		// Convert to Instant
		Instant instant = resultDateTime.toInstant();

		return instant;
	}

	private URI appendPath(URI uri, String path) {
		return UriComponentsBuilder.fromUri(uri).pathSegment(path).build().encode().toUri();
	}

	private static IOU setId(IOU iou) {
		ReflectionTestUtils.setField(iou, "id", UUID.randomUUID());
		return iou;
	}
}
