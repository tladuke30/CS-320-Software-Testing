# CS 320 – Software Testing, Automation, and Quality Assurance

## Portfolio Overview

This repository contains selected coursework from CS 320, demonstrating my experience with Java development, JUnit unit testing, software automation, and quality assurance. The included projects demonstrate how I use customer requirements to develop and test software, identify errors, and improve software reliability.

## Project One: Contact Service

For Project One, I developed a Contact Service application in Java and created automated unit tests using JUnit. The application manages contact information and validates requirements involving contact IDs, names, phone numbers, and addresses. The repository includes Contact.java, ContactService.java, ContactTest.java, and ContactServiceTest.java. These files demonstrate my ability to develop software components and verify their behavior through automated testing.

## Project Two: Summary and Reflections Report

For Project Two, I evaluated my testing practices across the Contact, Task, and Appointment Services. I developed 49 JUnit test methods across six test files, including tests for valid and invalid inputs, service operations, and exception handling. My report discusses code coverage, testing strategies, limitations, and the importance of maintaining reliable software.

## Portfolio Reflections

### How can I ensure that my code, program, or software is functional and secure?

I ensure that software is functional and secure by reviewing requirements, validating inputs, and creating automated tests to verify expected behavior. During CS 320, I used JUnit to test the Contact, Task, and Appointment Services. My tests included valid inputs, invalid inputs, boundary conditions, and exception handling. For example, I verified that duplicate IDs were rejected and that appointments could not be created with past dates. I also evaluated code coverage, including 86.4% coverage for the Task Service. This experience taught me that testing must go beyond checking whether a program runs. It should also identify weaknesses and reduce the risk of unexpected behavior. Unit testing supports software reliability, although additional security testing is needed to evaluate broader security risks.

### How do I interpret user needs and incorporate them into a program?

I interpret user needs by carefully reviewing customer requirements and translating them into specific software rules. In the Contact Service project, these requirements included unique contact IDs, appropriate field lengths, and valid phone numbers. I incorporated these rules into my Java classes and created JUnit tests to verify that they were enforced. Testing both acceptable and unacceptable inputs helped me confirm that the software behaved according to the requirements. This approach reinforced the importance of clear communication, attention to detail, and validating functionality throughout development.

### How do I approach designing software?

I approach software design by identifying the required functionality, separating responsibilities into manageable classes, and considering how each component can be tested. During CS 320, I developed data classes and service classes for managing contacts, tasks, and appointments. I then created unit tests to evaluate individual methods, input validation, and service operations. I also used JUnit assertions and setup methods to make testing more organized and efficient. These projects strengthened my understanding of maintainable software design, early defect detection, and the importance of minimizing technical debt through consistent testing.

## Skills Demonstrated

- Java programming and object-oriented design
- JUnit automated unit testing
- Input validation and exception handling
- Boundary and negative testing
- Software requirements analysis
- Code coverage evaluation
- Software quality assurance and documentation
