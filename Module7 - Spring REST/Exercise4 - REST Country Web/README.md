# Module 7 - Spring REST using Spring Boot 3

## Exercise 4: REST - Country Web Service

### Objective

The objective of this hands-on is to develop a RESTful web service using Spring Boot that returns the details of a country in JSON format. This exercise demonstrates how to create REST controllers, map HTTP requests, and convert Java objects into JSON responses.

### Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring XML Configuration
- Maven
- SLF4J Logging

### Features Implemented

- Created a REST controller named `CountryController`.
- Configured the `/country` endpoint using `@RequestMapping`.
- Loaded the India bean from the Spring XML configuration file.
- Returned the `Country` object as a JSON response.
- Implemented logging using SLF4J.
- Successfully tested the REST endpoint in the browser/Postman.

### Output

The application successfully returned the following JSON response when accessing the `/country` endpoint:

```json
{
  "code": "IN",
  "name": "India"
}
```

### Learning Outcome

After completing this hands-on, I learned:

- How to create RESTful web services using Spring Boot.
- How to use `@RestController` and `@RequestMapping`.
- How Spring automatically converts Java objects into JSON.
- How to load beans from Spring XML configuration.
- How to test REST APIs using a browser or Postman.

### Screenshot

The `Output.png` file shows the successful execution of the application, including the JSON response returned by the `/country` endpoint and the application running successfully.

---

**Status:** ✅ Completed Successfully
