# Spring Boot

## Description

The goal of these exercises is to build a RESTful API service that allows users to manage IOUs (I Owe You agreements) using Spring Boot.

## Getting Started

### Create Database
1. Login to MySQL:

```sh
mysql -u root -p
```
> :bulb: **Note:** If your root user doesn't have a password set, omit the `-p` flag.

2. Create a new database:

```sh
CREATE DATABASE IF NOT EXISTS springbootexercise;
exit;
```

### Initialise Project
1. Open this [pre-configured Initializr project](https://start.spring.io/#!type=maven-project&language=java&packaging=jar&jvmVersion=21&groupId=com.cbfacademy&artifactId=springbootexercise&name=Spring%20Boot%20Exercise&description=Build%20a%20RESTful%20API%20using%20Spring%20Boot&packageName=com.cbfacademy.springbootexercise&dependencies=web,data-jpa,mysql,devtools). Review the configured settings, but do not make any changes. Click "Generate" to download a zipped project
2. Extract the downloaded zip file
3. Ensure that the `spring-boot` directory is the current working directory in the terminal, then copy the contents of the extracted directory to your local repository.  **IMPORTANT:** Do NOT copy the extracted files using (macOS) Finder or (Windows) Explorer as not all extracted files may be correctly moved:
   - macOS (zsh): `cp -r [extracted directory]/* [extracted directory]/.[^.]* .`, e.g. `cp -r ~/Downloads/springbootexercise/* ~/Downloads/springbootexercise/.[^.]* .`
   - Windows (Git Bash): `cp -r [extracted directory]/* [extracted directory]/.* .`, e.g. `cp -r ~/Downloads/springbootexercise/* ~/Downloads/springbootexercise/.* .`
   - Windows (Command Prompt): `xcopy /e /h /i /k /r /y "[extracted directory]" %cd%`, e.g. `xcopy /e /h /i /k /r /y "%USERPROFILE%\Downloads\springbootexercise" %cd%`
4. Delete the extracted directory and the downloaded zip file
5. Open your repository in VS Code
6. Add the following values to src/main/resources/application.properties:

```properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.open-in-view=true
spring.config.import=optional:./local.properties
```
7. In order to prevent sensitive values from being committed to version control, add a new entry to the .gitignore file:

```
local.properties
```

8. Create a new file at src/main/resources/local.properties and paste in the following: 

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/springbootexercise

# Replace "root" with your database user, if applicable
spring.datasource.username=root

# Specify your database user's password, if applicable. If your database user doesn't have a password set, delete the line below
spring.datasource.password=YOUR_MYSQL_PASSWORD
```

9. Replace the username and password values with your MySQL credentials. **IMPORTANT:** Ensure there are no spaces before or after the password.

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
2024-04-12T11:49:59.055-04:00  INFO 39975 --- [Spring Boot Exercise] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2024-04-12T11:49:59.059-04:00  INFO 39975 --- [Spring Boot Exercise] [           main] c.c.r.SpringBootExerciseApplication         : Started SpringBootExerciseApplication in 1.493 seconds (process running for 1.638)
```

**IMPORTANT**: If everything is working correctly, the output will appear "stuck" and the command prompt won't return until you stop the application, which should now be running at http://localhost:8080/api/ious.

### Stop Application
Stop the application by pressing `Ctrl + C`

## Exercise 1

1. Create an ious package in the main springbootexercise package
2. Create an `IOU` entity class that maps to the "ious" table and has the following fields:
    - `UUID id`
    - `String borrower`
    - `String lender`
    - `BigDecimal amount`
    - `Instant dateTime`
3. Ensure the `id` field is set as the primary key and values are generated using the appropriate strategy for a `UUID` field
4. Define a constructor that accepts the following parameters: `IOU(String borrower, String lender, BigDecimal amount, Instant createdAt)`
5. Define a default (parameterless) constructor that calls the parameterised constructor internally. Consider what appropriate default values should be passed to the parameters
6. Create getter and setter methods for each field, except `id`, which should only have a getter
7. Create an `IOURepository` interface that extends `ListCrudRepository<IOU, UUID>`
8. If it's not already running, start your API with `./mvnw clean spring-boot:run`. Check the output and confirm there are no errors
9. Check your database contains an "ious" table with the correct columns and data types
10. Commit your changes

## Exercise 2

1. Create an IOUService class that accepts an IOURepository as a dependency and implements the following methods:
    - `List<IOU> getAllIOUs()`
    - `IOU getIOU(UUID id) throws NoSuchElementException`
    - `IOU createIOU(IOU iou) throws IllegalArgumentException, OptimisticLockingFailureException`
    - `IOU updateIOU(UUID id, IOU updatedIOU) throws NoSuchElementException`
    - `void deleteIOU(UUID id)`
2. Create an `IOUController` class that implements the endpoints below. Ensure your service class is injected as a dependency and apply the appropriate annotations
3. Start your API and confirm there are no errors
4. Commit your changes

| Method | Endpoint | Description |
| --- | --- | --- |
| GET | /api/ious | Retrieve a list of (optionally filtered) IOUs |
| GET | /api/ious/{id} | Retrieve a specific IOU by its ID |
| POST | /api/ious | Create a new IOU |
| PUT | /api/ious/{id} | Update an existing IOU by ID |
| DELETE | /api/ious/{id} | Delete an IOU by ID |

You can now test your endpoints using [Postman](https://www.postman.com) or your preferred REST client at http://localhost:8080/api/ious

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

## Exercise 3

1. Create an `ious` package inside the test/java/com/cbfacademy/springbootexercise package
2. Download the [test suite](https://gist.github.com/cbfacademy-admin/be990e8da45fca196513f35f86ed3f52) and copy to the test ious package as IOUControllerTest.java
3. Run the tests with `./mvnw clean test`
4. Examine the results. Do any tests fail? If so, what reasons are given? Modify your code so all tests pass
5. Commit your changes

## Exercise 4

1. Create a new API endpoint to return IOUs for a specific borrower:
   1. Create a method in your repository interface called `findByBorrower` that accepts a string `borrower` parameter.
   2. Create a method in your service class called `getIOUsByBorrower`.
   3. Extend the `getIOUS` method of your controller to accept an optional query string parameter, e.g.: `getIOUs(@RequestParam(required = false) String borrower)`
   4. Check the value of the `borrower` parameter to determine whether to call the existing service method or the new, filtered, one
2. Test the modified endpoint
3. Commit your changes

#### :chart_with_upwards_trend: Stretch Goal

Modify the `/api/ious` endpoint to filter IOUs for a specific lender, defined as an optional query string parameter.

## Exercise 5

1. Create a new API endpoint to return IOUs with above-average value:
   1. Create a method in your repository interface called `findHighValueIOUs`.
   2. Define a native `@Query` annotation that will return all IOUs with an above average value. Hint: create a subquery using the `AVG` function
   3. Create a method in your service class called `getHighValueIOUs`.
   4. Create a `getHighValueIOUS` method in your controller, mapped to the `/high` path.
2. Test the new endpoint
3. Commit your changes
4. Create a new endpoint at `/low` to return IOUs that are below or equal to the average value. Implement the repository method using JPQL instead of SQL
5. Commit your changes

## Top Tips

- :camera_flash: Commit frequently and use meaningful commit messages. A granular, well-labelled history becomes an increasingly valuable asset over time.
- :cactus: Use feature branches. Build the habit of isolating your changes for specific tasks and merging them into your default branch when complete.
- :vertical_traffic_light: Use consistent naming conventions. Choose easily understandable names and naming patterns for your classes, functions and variables.
- :triangular_ruler: Keep your code tidy. Using the built-in formatting of VS Code or other IDEs makes your code easier to read and mistakes easier to spot.
- :books: Read the docs. Whether via Intellisense in your IDE, or browsing online documentation, build a clear understanding of the libraries your code leverages.
- :calendar: Don't wait until the last minute. Plan your work early and make the most of the time available to complete the assessment and avoid pre-deadline palpitations.
- :sos: Ask. :clap: For. :clap: Help! :clap: Your mentors, instructors and assistants are literally here to support you, so *make use of them* - don't sit and struggle in silence.

Best of luck! Remember, it's not just about the destination; it's the journey. Happy coding! 🚀
