# 💼 Interview Preparation Quiz for TenantTrack

Welcome to the **Interview Prep Quiz** section of **TenantTrack**. This document contains categorized quiz questions to help you revise key concepts quickly.

---

##  Docker and Containerization 🐳

**Q1: What is the purpose of Docker Desktop in TenantTrack?**  
👉 **A:** Docker Desktop runs and manages containers, allowing TenantTrack to use MongoDB in a containerized environment for consistent development and deployment.

**Q2: Why did you move Docker disk images to the D: drive?**  
👉 **A:** To reduce load on the C: drive (limited to 18.4GB free) and leverage D:’s larger capacity (149GB free), ensuring smoother operation.

**Q3. What is the difference between a container and a virtual machine (VM)?**
👉 **A:** Containers share the host OS kernel and isolate applications on the OS level, making them lightweight and faster to start. VMs run a full OS with virtualized hardware, making them heavier and slower to boot.

**Q4. How do you check if the Docker Engine is running?**
👉 **A:** Run docker info or docker --version in the terminal. If the engine is running, you will see the server details.

**Q5. What does docker-compose up -d do?**
👉 **A:** It starts all services defined in the docker-compose.yml file in detached mode (in the background).

**Q6. What is the role of the Dockerfile?**
👉 **A:** A Dockerfile contains a set of instructions to create a Docker image including base image, commands to install dependencies, copy files, set working directory, and define the entry point.

---

##  Backend Technologies ⚙️

**Q1: How does Spring Boot benefit TenantTrack’s backend?**  
👉 **A:**  Spring Boot simplifies Java development with auto-configuration, embedded servers, and easy integration with MongoDB for managing tenant data.

**Q2: What role does Maven play in the project?**  
👉 **A:**  Maven manages dependencies (e.g., Spring Boot, MongoDB driver) and automates the build process for TenantTrack.

**Q3. What is the purpose of @SpringBootApplication in a Spring Boot app?**
👉 **A:** It is a convenience annotation that combines @Configuration, @EnableAutoConfiguration, and @ComponentScan. It sets up the application context automatically.

**Q4. How is dependency injection implemented in Spring?**
👉 **A:** Spring uses annotations like @Autowired, @Component, @Service, and @Repository to inject dependencies through constructors, setters, or fields.

**Q5. Explain the difference between @Component, @Service, and @Repository?**
👉 **A:** All three are stereotype annotations and Spring-managed components:

@Component: Generic component

@Service: Marks a service class

@Repository: Marks a DAO class and handles exceptions related to data access

**Q6. What is a RESTful web service and how does Spring Boot help build it?**
👉 **A:** RESTful services use HTTP methods to perform CRUD operations. Spring Boot simplifies it using annotations like @RestController, @GetMapping, @PostMapping, etc.


---

## Frontend Technologies 🌐

**Q1: Why choose React for TenantTrack’s frontend?**  
👉 **A:**  React enables a dynamic, component-based UI, making it easier to display and manage tenant data interactively.

**Q2. What is the Virtual DOM in React?**
👉 **A:** Virtual DOM is a lightweight copy of the real DOM. React updates the virtual DOM first, then efficiently updates the real DOM based on differences.

**Q3. How does JSX differ from HTML?**
👉 **A:** JSX is a syntax extension for JavaScript, allowing HTML-like code within JavaScript. Unlike HTML, JSX requires className instead of class and all tags must be properly closed.

**Q4. What are props and state in React?**
👉 **A:** Props are read-only and passed from parent to child components. State is mutable and local to the component, used to manage dynamic data.

**Q5. How would you handle user input in a React form?**
👉 **A:** By binding input values to component state using useState() and updating state with onChange handlers.


---

## Tools and Testing 🛠️

**Q1: How does Postman support TenantTrack’s development?**  
👉 **A:** Postman is used to test REST APIs, ensuring the backend endpoints for tenant data work correctly before frontend integration.

**Q2: What’s the benefit of using Git in this project?**  
👉 **A:**  Git enables version control, allowing tracking of code changes and collaboration, essential for maintaining TenantTrack’s codebase.

**Q3. What is the purpose of Postman in API testing?**
👉 **A:** Postman is used to test REST APIs by sending requests (GET, POST, etc.) and validating responses.

**Q4. How do you run unit tests in a Spring Boot project using JUnit?**
👉 **A:** Use @SpringBootTest annotation and run test classes using Maven (mvn test) or from the IDE.

**Q5. How can you use Swagger for documenting APIs?**
👉 **A:** By adding the springdoc-openapi or swagger-ui dependency, Spring Boot auto-generates interactive API documentation.

**Q6. What does the @Test annotation do in JUnit?**
👉 **A:** It marks a method as a test method to be executed by the test runner.


---

## General Concepts💡

**Q1: What is the difference between JDK, JRE, and JVM?**  
👉 **A:**  
- **JDK**: Java Development Kit — contains tools needed to develop Java programs.  
- **JRE**: Java Runtime Environment — provides libraries to run Java programs.  
- **JVM**: Java Virtual Machine — part of JRE that actually runs the bytecode.

**Q2: What is Spring Boot?**  
👉 **A:** Spring Boot is a framework that simplifies building production-ready Spring applications with minimal configuration.

**Q3: What’s the advantage of using MongoDB for tenant data?**  
👉 **A:** MongoDB’s NoSQL structure offers flexibility for storing unstructured tenant data and scales well for future growth.

Q4. What are microservices, and how do they differ from monolithic architecture?**
👉 **A:** Microservices are small, independently deployable services. In contrast, monoliths are large applications where all functionalities are tightly coupled.

Q5. What is version control and why is Git important?**
👉 **A:** Version control tracks changes in code over time. Git is a distributed version control system that helps in collaboration and managing code history.

Q6. What is the role of an IDE like VS Code in software development?**
👉 **A:** It provides tools like syntax highlighting, debugging, extensions, and Git integration to improve developer productivity.

Q7. How would you explain CI/CD in simple terms?**
👉 **A:** CI (Continuous Integration) means automatically testing code on every commit. CD (Continuous Deployment/Delivery) means deploying code automatically after successful tests.


---
