# Employee Management System Test Exam

This repository contains the Java implementation of an Employee Management System, developed as part of an assignment exam for my degree module Software Engineering with test. The exam required not only the development of the system but also its documentation and upload to GitHub.

## Purpose

The project showcases effective Java coding practices, object-oriented design principles, and rigorous data validation. It was designed to demonstrate my ability to implement software solutions that meet specified functional and non-functional requirements, including unit testing and version control integration as part of my academic coursework.

## Technologies and Packages Used

- **Java**: The primary programming language used for developing the employee management system.
- **JUnit**: Utilized for unit testing to validate the functionality and robustness of the system.
- **Maven**: Manages project dependencies and builds, ensuring that all components are correctly compiled and tested.
- **JaCoCo**: Integrated to provide code coverage analysis during the testing phase, helping ensure comprehensive test coverage.

## Project Structure

- `Employee.java`: This class defines the Employee entity with comprehensive validation checks to ensure that all employee attributes adhere to the required standards.
- `EmployeeTest.java`: Includes a suite of unit tests for the Employee class, testing both expected and edge case behaviors.
- `pom.xml`: Configures Maven for dependency management and sets up the testing framework along with the JaCoCo plugin for coverage analysis.

## Running the Project

To compile and test the project, ensure that Java and Maven are installed on your machine and follow these steps:

1. Clone this repository.
2. Navigate to the project directory.
3. Execute the following Maven command to compile the source files, run the tests, and generate a test coverage report:
   ```bash
   mvn clean test
   ```

This setup will not only test the application but also provide a detailed report on test coverage, ensuring that all parts of the code are thoroughly tested as per the requirements of the assignment.
