
# Module 7 - Spring REST using Spring Boot 3

## Exercise 2: Spring Core - Load SimpleDateFormat from Spring Configuration XML

### Objective

The objective of this hands-on is to understand how to define and retrieve Spring beans using an XML configuration file. It demonstrates the use of the Spring IoC Container to manage objects and reuse common components across the application.

### Technologies Used

- Java 17
- Spring Boot 3
- Spring Framework
- Spring XML Configuration
- Maven
- SLF4J Logging

### Features Implemented

- Created a Spring configuration file named `date-format.xml`.
- Configured a `SimpleDateFormat` bean using Spring XML.
- Loaded the XML configuration using `ClassPathXmlApplicationContext`.
- Retrieved the bean using the `getBean()` method.
- Parsed the date string `31/12/2018` into a `Date` object.
- Logged the parsed date using SLF4J.

### Output

The application successfully:

- Loaded the Spring XML configuration file.
- Created the `SimpleDateFormat` bean.
- Retrieved the bean from the Spring IoC Container.
- Parsed the input date successfully.
- Displayed the parsed date in the application logs.

### Learning Outcome

After completing this hands-on, I learned:

- How to create and configure Spring XML files.
- How to define beans using the `<bean>` element.
- How the Spring IoC Container manages application objects.
- How to retrieve beans using `ApplicationContext`.
- How to use `ClassPathXmlApplicationContext` to load XML configuration files.
- How to incorporate logging using SLF4J.

### Screenshot

The `Output.png` file contains the successful execution of the application, showing the XML configuration being loaded and the parsed date displayed in the logs.

---

**Status:** ✅ Completed Successfully
