# Java RESTful API Exercise: IOU Service

## Description

Build a RESTful API service that allows users to `create`, `read`, `update`, and `delete` IOUs (I Owe You) using Java and Spring Boot.

## Getting Started

### Clone Repository
1. Fork this repository in your GitHub account
2. Clone your fork locally or open in CodeSpaces.

```sh
git clone [REPO_URL]
cd [REPO_NAME]
```

> :bulb: **Note:** Replace [REPO_URL] with the link to your GitHub repository and [REPO_NAME] with the repository's name.

### Create Database
1. Login to MySQL:

```sh
mysql -u root -p
```
> :bulb: **Note:** If your root user doesn't have a password set, omit the `-p` flag.

2. Create a new database:

```sh
CREATE DATABASE IF NOT EXISTS restapiexercise;
exit;
```

### Initialise Project
1. Open this [pre-configured Initializr project](https://start.spring.io/#!type=maven-project&language=java&packaging=jar&jvmVersion=21&groupId=com.cbfacademy&artifactId=restapiexercise&name=REST%20API%20Exercise&description=RESTful%20API%20exercise%20using%20Spring%20Boot&packageName=com.cbfacademy.restapiexercise&dependencies=web,data-jpa,mysql,devtools). Review the configured settings, but do not make any changes. Click "Generate" to download a zipped project.
2. Ensure that your local repository is the current working directory in the terminal, then extract the downloaded zip file. **IMPORTANT:** Do NOT unzip the archive in (macOS) Finder or (Windows) Explorer as the extracted files won't be correctly positioned.
   - macOS / Git Bash: `tar -xvf [download directory]/restapiexercise.zip --strip=1 -C .`, e.g. `tar -xvf ~/Downloads/restapiexercise.zip --strip=1 -C .`
   - Windows Command Prompt: `tar -xvf [download directory]\restapiexercise.zip --strip=1 -C %cd%`, e.g. `tar -xvf %USERPROFILE%\Downloads\restapiexercise.zip --strip=1 -C %cd%`
3. Open your repository in VS Code
4. Add the following values to src/main/resources/application.properties:

```properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.open-in-view=true
spring.config.import=optional:./local.properties
```
5. In order to prevent sensitive values from being committed to version control, add a new entry to the .gitignore file:

```
local.properties
```

6. Create a new file at src/main/resources/local.properties and paste in the following: 

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/restapiexercise

# Replace "root" with your database user, if applicable
spring.datasource.username=root

# Specify your database user's password, if applicable. If your database user doesn't have a password set, delete the line below
spring.datasource.password=YOUR_MYSQL_PASSWORD
```

7. Replace the username and password values with your MySQL credentials. **IMPORTANT:** Ensure there are no spaces before or after the password.

### Run Application

To start the API, run the following command:

#### macOS / Git Bash

```sh
./mvnw spring-boot:run
```

#### Windows Command Prompt

```cmd
mvnw spring-boot:run
```

If successful, you should see output that ends similarly to the following:

```
2024-04-12T11:49:59.055-04:00  INFO 39975 --- [REST API Exercise] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2024-04-12T11:49:59.059-04:00  INFO 39975 --- [REST API Exercise] [           main] c.c.r.RestApiExerciseApplication         : Started RestApiExerciseApplication in 1.493 seconds (process running for 1.638)
```

**IMPORTANT**: If everything is working correctly, the output will appear "stuck" and the command prompt won't return until you stop the application, which should now be running at http://localhost:8080/api/ious.

### Stop Application
Stop the application by pressing `Ctrl + C`

## Exercise 1

1. Create an ious package in the main restapiexercise package
2. Create an `IOU` entity class that maps to the "ious" table and has the following fields:
    - `UUID id`
    - `String borrower`
    - `String lender`
    - `BigDecimal amount`
    - `Instant dateTime`
3. Ensure the `id` field is set as the primary key and values are generated using the appropriate strategy
4. Create getters and setters for each field, except `id`, which should only have a getter
5. Create an `IOURepository` interface that extends `ListCrudRepository<IOU, UUID>`
6. Ensure local.properties is correctly configured with your database details
7. Start your API with `./mvnw clean spring-boot:run` (if it's already running, restart it) and confirm there are no errors
8. Check your database contains an "ious" table with the correct columns and data types

## Exercise 2

1. Create an IOUService class that accepts an IOURepository as a dependency and implements the following methods:
    - `List<IOU> getAllIOUs()`
    - `IOU getIOU(UUID id) throws NoSuchElementException`
    - `IOU createIOU(IOU iou) throws IllegalArgumentException, OptimisticLockingFailureException`
    - `IOU updateIOU(UUID id, IOU updatedIOU) throws NoSuchElementException`
    - `void deleteIOU(UUID id)`
2. Create an `IOUController` class that implements the endpoints below. Ensure your service class is injected as a dependency and apply the appropriate annotations
3. Start your API and confirm there are no errors

| Method | Endpoint | Description |
| --- | --- | --- |
| GET | /api/ious | Retrieve a list of (optionally filtered) IOUs |
| GET | /api/ious/{id} | Retrieve a specific IOU by its ID |
| POST | /api/ious | Create a new IOU |
| PUT | /api/ious/{id} | Update an existing IOU by ID |
| DELETE | /api/ious/{id} | Delete an IOU by ID |

## Exercise 3

1. Create an `ious` package inside the test/java/com/cbfacademy/restapiexercise package
2. Download the [test suite](https://gist.github.com/cbfacademy-admin/be990e8da45fca196513f35f86ed3f52) and copy to the test ious package as IOUControllerTest.java
3. Run the tests with `./mvnw test`
4. Examine the results. Which tests fail? What reasons are given?

## Exercise 4

1. Create a new API endpoint to return IOUs for a specific borrower:
   1. Create a method in your repository interface called `findByBorrower` that accepts a string `borrower` parameter.
   2. Create a method in your service class called `getIOUsByBorrower`.
   3. Extend the `getIOUS` method of your controller to accept an optional query string parameter, e.g.: `getIOUs(@RequestParam(required = false) String borrower)`
   4. Check the value of the `borrower` parameter to determine whether to call the existing service method or the new, filtered, one
2. Test the modified endpoint
3. Commit your changes

## Exercise 5

1. Create a new API endpoint to return IOUs with above-average value:
   1. Create a method in your repository interface called `findHighValueIOUs`.
   2. Define a native `@Query` annotation that will return all IOUs with an above average value. Hint: create a subquery using the `AVG` function
   3. Create a method in your service class called `getHighValueIOUs`.
   4. Create a `getHighValueIOUS` method in your controller, mapped to the `/high` path.
2. Test the new endpoint
3. Commit your changes
4. Create a new endpoint at `/low` to return IOUs that are below or equal to the average value. Implement the repository method using JPQL instead of SQL


## Testing the API

You can test your endpoints using [Postman](https://www.postman.com) or your preferred REST client at http://localhost:8080/api/ious

The JSON representation of an IOU that you'll get in responses or provide in the request body for `POST` and `PUT` requests will resemble the following:

```json
{
  "id": "d1415cfc-dbd9-4474-94fc-52e194e384fa",
  "borrower": "John Doe",
  "lender": "Alice Smith",
  "amount": 100.0,
  "dateTime": "2023-11-02T14:30:00Z"
}
```

> :bulb: **Note:** Remember that the `id` property may not be needed for all request types.

## Top Tips

- :camera_flash: Commit frequently and use meaningful commit messages. A granular, well-labelled history becomes an increasingly valuable asset over time.
- :cactus: Use feature branches. Build the habit of isolating your changes for specific tasks and merging them into your default branch when complete.
- :vertical_traffic_light: Use consistent naming conventions. Choose easily understandable names and naming patterns for your classes, functions and variables.
- :triangular_ruler: Keep your code tidy. Using the built-in formatting of VS Code or other IDEs makes your code easier to read and mistakes easier to spot.
- :books: Read the docs. Whether via Intellisense in your IDE, or browsing online documentation, build a clear understanding of the libraries your code leverages.
- :calendar: Don't wait until the last minute. Plan your work early and make the most of the time available to complete the assessment and avoid pre-deadline palpitations.
- :sos: Ask. :clap: For. :clap: Help! :clap: Your mentors, instructors and assistants are literally here to support you, so *make use of them* - don't sit and struggle in silence.

Best of luck! Remember, it's not just about the destination; it's the journey. Happy coding! 🚀
