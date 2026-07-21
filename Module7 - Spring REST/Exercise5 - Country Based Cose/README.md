# Module 7 - Spring REST using Spring Boot 3

## Exercise 5: REST - Get All Countries

### Objective

The objective of this hands-on is to develop a RESTful web service that returns a list of all countries in JSON format. This exercise demonstrates how to expose collection resources using Spring Boot and automatically convert Java objects into JSON responses.

### Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring XML Configuration
- Maven
- SLF4J Logging

### Features Implemented

- Extended the existing `CountryController`.
- Created the `/countries` REST endpoint using `@GetMapping`.
- Loaded the list of countries from the `country.xml` configuration file.
- Returned the complete list of `Country` objects.
- Implemented logging using SLF4J.
- Successfully tested the REST endpoint using a browser/Postman.

### Output

The application successfully returned the list of countries in JSON format when accessing the `/countries` endpoint.

Example Response:

```json
[
  {
    "code": "IN",
    "name": "India"
  },
  {
    "code": "US",
    "name": "United States"
  },
  {
    "code": "JP",
    "name": "Japan"
  },
  {
    "code": "DE",
    "name": "Germany"
  }
]
```

### Learning Outcome

After completing this hands-on, I learned:

- How to create REST APIs that return collections.
- How to use the `@GetMapping` annotation.
- How Spring Boot automatically converts Java collections into JSON.
- How to retrieve multiple beans from a Spring XML configuration file.
- How to test REST endpoints using a browser and Postman.

### Screenshot

The `Output.png` file shows the successful execution of the application, including the JSON response from the `/countries` endpoint and the application running successfully.

---

**Status:** ✅ Completed Successfully
