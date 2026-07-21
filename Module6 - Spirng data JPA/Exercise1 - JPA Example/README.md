# Module 6 - Spring Data JPA

## Mandatory Hands-on 1: Spring Data JPA - Quick Example

### Objective

The objective of this hands-on is to understand the basics of Spring Data JPA and Object-Relational Mapping (ORM). It demonstrates how Spring Boot simplifies database operations using JPA and Hibernate.

### Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 In-Memory Database
- Maven

### Features Implemented

- Created an `Employee` entity using JPA annotations.
- Created an `EmployeeRepository` by extending `JpaRepository`.
- Configured the H2 in-memory database.
- Implemented database operations using:
  - `save()`
  - `findById()`
- Displayed the saved and retrieved employee details in the console.

### Output

The application successfully:

- Started the Spring Boot application.
- Saved an employee record to the H2 database.
- Retrieved the employee record using `findById()`.
- Displayed the employee details in the console.

### Learning Outcome

After completing this hands-on, I learned:

- The concept of Object-Relational Mapping (ORM).
- The benefits of using Spring Data JPA.
- How Hibernate works as the JPA implementation.
- How to create an entity and repository using JPA.
- How to perform basic database operations using `JpaRepository`.

### Screenshot

The `Output.png` file contains the successful execution of the application, showing the employee record being saved and retrieved from the H2 database.

---

**Status:** ✅ Completed Successfully
