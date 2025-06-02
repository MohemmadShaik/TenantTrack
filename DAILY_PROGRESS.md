
# TenantTrack Daily Tasks & Progress Overview 📈

## Day 1 Task: Install Java17, Maven and Visual Studio Code Editor (IDE)

Note : Switched from JDK22 to JDK17 (LTS)

- OpenJDK 17: Installed JDK17, verified with java -version.✅

**Q: Why switch to JDK 17 from JDK 22?**
A: JDK 17 is a Long-Term Support (LTS) version, widely used and officially supported by Spring Boot 3.x. JDK 22 is newer and may cause compatibility issues with dependencies.

            ```Java

                C:\Users\Mohammad>java -version
                openjdk version "17.0.15" 2025-04-15
                OpenJDK Runtime Environment Temurin-17.0.15+6 (build 17.0.15+6)
                OpenJDK 64-Bit Server VM Temurin-17.0.15+6 (build 17.0.15+6, mixed mode, sharing)

            ```
**Downlaod and install Maven :**

**1. Download Maven:**

Go to Maven.
Download the latest binary zip (e.g., apache-maven-3.9.9-bin.zip).

**2.Install Maven:**

- Extract the zip to C:\maven (create the folder if needed):
- Right-click the zip in Downloads, select “Extract All,” choose C:\maven.
- Result: C:\maven\apache-maven-3.9.9.

**3.Add Maven to System PATH:**

- Right-click “This PC” > Properties > Advanced system settings > Environment Variables.
- Under “System Variables,” find Path, click Edit.
- Add: C:\maven\apache-maven-3.9.9\bin.
- Click OK to save.

**4.Verify Installation:**
Open a new Command Prompt (close and reopen if already open).

Run:

- Maven: Installed, verified with mvn -version.✅

        ```Maven

            C:\Users\Mohammad>mvn -version
            Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
            Maven home: C:\Program Files\Maven\apache-maven-3.9.9
            Java version: 17.0.15, vendor: Eclipse Adoptium, runtime: C:\Program Files\Eclipse Adoptium\jdk-17.0.15.6-hotspot
            Default locale: en_IN, platform encoding: Cp1252
            OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"

        ```
- VS Code: Installed with Java Extension Pack, Spring Boot Extension Pack, and Docker extensions.✅
- Test.java: Created and ran successfully, printing “Hello, TenantTrack!”.✅
- Issues: None—smooth sailing! ✅
- Status : Completed Successfully!✅

---
---

## Day 2 Task: Install Docker, GIT and Postman

- System: AMD64 (x64-based), AMD Ryzen 5 4600H 3.00 GHz, Windows 11 Home 23H2. ✅
- Docker Desktop (AMD64): Installed, ran docker run hello-world successfully. ✅
- Docker Version : Docker version 28.1.1, build 4eba377. ✅
- .wslconfig: Configured WSL 2 resources (`memory=4GB`, `processors=4`, `swap=1GB`) in `C:\Users\Mohammad\.wslconfig` with UTF-8. ✅  

- [Issue:](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-2-task-issue) Missing docker-desktop-data in wsl --list --verbose. Needs fixing. ⚠️
- Git, Postman: Not yet started (to be addressed after Docker).

**⚠️ Day 2 Status in progress : 70% of Day2 task completed and The docker-desktop-data issue is blocking full Docker functionality, critical for TenantTrack’s MongoDB backend. Fixing this to ensure smooth progress.**

- Finally, Resolved Docker Desktop issues by uninstalling and reinstalling Docker, moved disk images to D: drive (`D:\DockerData\DockerDesktopWSL`),
  confirmed new Docker Desktop 4.40.0+ structure with `docker-desktop` distro, enabled MongoDB containers with 18.4GB on C:, 149GB on D:, 4GB RAM, 4 CPUs. ✅

**Step 2: Create a GitHub Repository and then install git and configure it**
Let’s set up a GitHub repository for TenantTrack to store your portfolio notes and project files.

**Instructions:**
1.Sign In to GitHub:

- Go to https://github.com and sign in (or sign up if you don’t have an account).

2.Create a New Repository:

- Click the “+” icon in the top-right corner > New repository.

- Repository name: TenantTrack.
- Description: “A project to manage tenant data using Docker, MongoDB, and Java.”
- Choose Public (or Private if preferred).
- Check “Add a README file” to initialize the repo with a README.md.
- Click Create repository.

3.Add Initial Portfolio Note to README:

- Open the README.md file in the repository and add the following :

# TenantTrack

A project to manage tenant data using Docker, MongoDB, and Java.

## Setup Progress

- **Docker Setup**: Resolved Docker Desktop issues by uninstalling and reinstalling Docker, moved disk images to D: drive (D:\DockerData\DockerDesktopWSL), confirmed new Docker Desktop 4.40.0+ structure with docker-desktop distro, enabled MongoDB containers with 18.4GB on C:, 149GB on D:, 4GB RAM, 4 CPUs.

- Click Commit changes (add a commit message like “Initial README with Docker setup”).

**Step 3 : Install and Configure Git**
Let’s install Git and set it up on your system.

**Instructions:**

1.Download and Install Git:

- Download the Git installer for Windows (AMD64) from: https://git-scm.com/download/win.
- Run the installer as admin.
- Use default settings, but ensure:
- “Git Bash Here” is enabled for File Explorer integration.
- Choose your preferred text editor (e.g., Notepad++ or VS Code if installed).
- Complete the installation.

2.Verify Git Installation:

        ```bash

            C:\Users\Mohammad>git --version
            **git version 2.49.0.windows.1** ✅

        ```
3.Configure Git:

- Set your Git username and email (use the same email as your GitHub account):

        ```bash

        git config --global user.name "MohemmadShaik"
        git config --global user.email "mohemmadshaik@gmail.com"

        ```
- Verify :

        ```bash

            C:\Users\Mohammad>git config --global user.name
            **MohemmadShaik** ✅

            C:\Users\Mohammad>git config --global user.email
             [mohemmadshaik@gmail.com] ✅

        ```

 4.Clone the Repository:

        - In File Explorer, create a folder on D: (e.g., D:\Projects).
        - Right-click the folder > Git Bash Here.
        - Clone your repository:

        ```bash
            
           Mohammad@ASUS-TUF-GAMING-A15 MINGW64 /d/TenantProject
           $git clone https://github.com/MohemmadShaik/TenantTrack.git ✅

        ```
**Step 4: Install and Configure Postman :**

Let’s install Postman to test APIs for TenantTra
Instructions:
1.Download and Install Postman:

        - Download Postman for Windows (AMD64) from: https://www.postman.com/downloads/.
        - Run the installer as admin.
        - Complete the installation.
2.Verify Postman Installation:
    - Open Postman.
    - Sign in or create an account (optional but recommended for syncing). (NOTE : HERE WE DIDN"T CREAT ANY A/C.)
    **Create a new workspace:**
      - Name: TenantTrack.
      - Visibility: Personal.
      - Click Create Workspace.
3.Test Postman with a Sample Request:
    - Create a new request:
    - Click New > HTTP Request.
    - Set the method to GET.
    - Enter URL: [https://api.github.com]
    - Click Send.
  **Expected:** Response with GitHub API data (status 200 OK).

        ```Postman setup

           Google A/c : [mohemmadshaik@gmail.com] ✅
           Username : Hazarudin  ✅
           Worspace: TenantTrack ✅
            
        ```

- Git and Postman successfully set up.✅
- Git Version: git version 2.49.0.windows.1 ✅
- GitHub Repo URL: [https://github.com/MohemmadShaik/TenantTrack.git] ✅
- Postman Test: Status 200 OK, Response includes current_user_url and other GitHub API endpoints. ✅
- Issues: None—smooth sailing! ✅
- Status : Day 2 Task Completed Successfully!✅

## Day 3 Task: Setting up Java Backend with Spring Boot and Mongodb integration

## STEP 1 : Using Spring Initializr [https://start.spring.io] with below settings, Generate Project completed.✅

## Settings

**Project:** Maven  
**Language:** Java  
**Spring Boot:** 3.4.5 or latest (For TenantTrack Project we used 3.4.5 stabled version)
**Group:** com.tenanttrack  
**Artifact:** tenant-backend  
**Dependencies  :** Spring Web  
                    Spring Data MongoDB  
                    Lombok  
                    Spring Boot DevTools  
                    Validation  

For reference click here : [Day3-Pic1](./tenant-backend/docs/screenshots/Day3_1_Spring-Initializr_pic.png)

- And then extracted the downloaded zip file and launched vs code by rightclicking on tenant-backend folder available at path D:\TenantProject\TenantTrack\tenant-backend.

## Project Directory Structure (tenant-backend focus) (after unzip)✅

    ```Java

        TenantTrack/  
            ├── tenant-backend/  
            │   ├── src/  
            │   │   ├── main/  
            │   │   │   ├── java/com/tenanttrack/tenant_backend/  
            │   │   │   │   ├── controller/  
            │   │   │   │   ├── model/  
            │   │   │   │   ├── repository/  
            │   │   │   │   ├── service/  
            │   │   │   │   └── TenantBackendApplication.java  
            │   │   │   └── resources/  
            │   │   │       ├── static/  
            │   │   │       ├── templates/  
            │   │   │       └── application.properties  
            │   │   └── test/  
            │   │       └── java/com/tenanttrack/tenant_backend/  
            │   │           └── TenantBackendApplicationTests.java  
            │   ├── target/  
            │   ├── .mvn/wrapper/  
            │   ├── docs/                          **(+ NEW)**  
            │   │   ├── BUGS_AND_RESOLUTIONS.md    **(+ Error log with screenshots)**  
            │   │   ├── ARCHITECTURE.md            **(+ System design notes)**  
            │   │   └── screenshots/               **(+ For error screenshots)**  
            │   ├── pom.xml  
            │   ├── mvnw  
            │   ├── mvnw.cmd  
            │   ├── HELP.md  
            │   ├── .gitignore  
            │   └── interviewPrepQuiz.md           **(+ Interview Q&A)**  
            │
            |  
            ├── README.md                          **(Update with docs links)**
            └── DAILY_PROGRESS.md                  **(Daily Action Tasks and Progress Log)**
    ```

- In VS code, opened pom.xml file and Verified all dependencies (i.e.; Spring Web, Spring Data MongoDB, Lombok, Spring Boot DevTools and Validation) were listed.

- ✅Finally, Run the java apllication src\main\java\com\tenanttrack\tenant_backend\TenantBackendApplication.java
  and Checked the “Started TenanttrackApplication” in logs successfully.

## KEY NOTES

- TenantBackendApplication.java (the Spring Boot entry point) typically stays at the root of the package (com.tenanttrack.tenant_backend) to maintain Spring Boot’s default configuration.
  
- **Restarting the Spring Boot App :** Running mvn spring-boot:run in VS Code does indeed start the Spring Boot application, which means executing TenantBackendApplication.java (the main class). This file (D:\TenantProject\TenantTrack\tenant-backend\src\main\java\com\tenanttrack\tenant_backend\TenantBackendApplication.java) is the entry point for the app. ✅
  
- **How It Works in VS Code :** When you run mvn spring-boot:run in the terminal within VS Code, it automatically triggers TenantBackendApplication.java. Alternatively, you can use VS Code’s Run button on TenantBackendApplication.java (if the Spring Boot Extension Pack is installed), which does the same thing.

## Confirmation of Spring Boot Setup

  ✅Successfully generated the Spring Boot 3.4.5 project, extracted it to D:\TenantProject\TenantTrack\tenant-backend, opened it in VS Code with required extensions (Spring Boot Extension Pack, Java Extension Pack, Docker),
  verified dependencies in pom.xml, and ran the application (TenantBackendApplication.java), confirming “Started TenanttrackApplication” in logs. ✅

## STEP 2 : Steps to Run MongoDB in Docker.✅

- First of all ensure the Docker Desktop is open and in running state before
  running any docker commands.
- Now open powershell window and navigate to the path  

        ```Docker

            PS D:\DockerData\DockerDesktopWSL\disk> and type Run docker run -d -p 27017:27017 --name tenant-mongo mongo:latest

        ```

- Now use docker ps commmand to display the containers or images so far created in the docker.
- The docker ps output shows the tenant-mongo container (image: mongo:latest) is running successfully, with port 27017 mapped (0.0.0.0:27017->27017/tcp). The container started 35 seconds ago and has been up for 34 seconds. ✅

## STEP 3 : Steps to Connect Spring Boot to MongoDB✅

## 3.1 - Add MongoDB URI in application.properties✅

- Open D:\TenantProject\TenantTrack\tenant-backend\src\main\resources\application.properties in VS Code and append:
    spring.data.mongodb.uri=mongodb://localhost:27017/tenantdb  
    spring.data.mongodb.database=tenantdb
  
## 3.2 - Create Tenant Model✅

- In D:\TenantProject\TenantTrack\tenant-backend\src\main\java\com\tenanttrack\tenant_backend, create a new file Tenant.java
- Code in Tenant.java :
  
        ```Java

            package com.tenanttrack.tenant_backend.model;

            import org.springframework.data.annotation.Id;
            import org.springframework.data.mongodb.core.mapping.Document;

            import lombok.Data;

            @Document(collection = "tenants")
            @Data
            public class Tenant {
                @Id
                private String id;
                private String name;
                private String phone;
                private String doj;
                private String roomNumber;
                private Double rent;

             //Getters and Setters
                public String getId() {
                    return id;
                }
                public void setId(String id) {
                    this.id = id;
                }
                public String getName() {
                    return name;
                }
                public void setName(String name) {
                    this.name = name;
                }
                public String getPhone() {
                    return phone;
                }
                public void setPhone(String phone) {
                    this.phone = phone;
                }
                public String getDoj() {
                    return doj;
                }
                public void setDoj(String doj) {
                    this.doj = doj;
                }
                public String getRoomNumber() {
                    return roomNumber;
                }
                public void setRoomNumber(String roomNumber) {
                    this.roomNumber = roomNumber;
                }
                public Double getRent() {
                    return rent;
                }
                public void setRent(Double rent) {
                    this.rent = rent;
                }
            }

        ```

## 3.3 - Create Repository for CRUD Operations ✅

- In the same directory, create TenantRepository.java
- Code in TenantRepository.java

        ```Java
            package com.tenanttrack.tenant_backend.repository;
            
            import com.tenanttrack.tenant_backend.model.Tenant;
            import org.springframework.data.mongodb.repository.MongoRepository;
            
            public interface TenantRepository extends MongoRepository<Tenant,String> { }

        ```

## 3.4 - Test MongoDB Connection ✅

- Add a simple service to test the connection. In the same directory, create TenantService.java
- Code in TenantService.java

            ```Java
                package com.tenanttrack.tenant_backend.service;
                
                import com.tenanttrack.tenant_backend.model.Tenant;
                import com.tenanttrack.tenant_backend.repository.TenantRepository;
                import org.springframework.stereotype.Service;
                
                import java.util.List;
                
                @Service
                public class TenantService {
                    private final TenantRepository repo;
                    public TenantService(TenantRepository repo){ this.repo = repo; }
                    
                  public List<Tenant> all(){ return repo.findAll(); }
                  public Tenant add(Tenant t){ return repo.save(t); }
                }

            ```

## Step 4 : Create basic REST API✅  

- Building a REST controller with endpoints (GET /tenants, POST /tenants) to list and add tenants.
- Create TenantController.java
  in D:\TenantProject\TenantTrack\tenant-backend\src\main\java\com\tenanttrack\tenant_backend\controller.  

- Code in TenantController.java -->

            ```Java
                    package com.tenanttrack.tenant_backend.controller;

                    import com.tenanttrack.tenant_backend.model.Tenant;
                    import com.tenanttrack.tenant_backend.service.TenantService;
                    import org.springframework.web.bind.annotation.*;

                    import java.util.List;

                    @RestController
                    @RequestMapping("/api/tenants")
                    @CrossOrigin // allow React later
                    public class TenantController {
                    
                        private final TenantService service;
                        public TenantController(TenantService service){ this.service = service; }

                        @GetMapping
                        public List<Tenant> getAll(){
                            return service.all();
                        }

                        @PostMapping
                        public Tenant create(@RequestBody Tenant tenant){
                            return service.add(tenant);
                        }
                    }

            ```

## Step 5 : Test APIs with Postman ✅

## Step 5.1 - GET all tenants ✅

## 5.1-(A)

- First ensure the Spring Boot application is in running state which is the entry point,Before opening the Postman.
- Here the TenantBackendApplication.java which act as the entry point (the main     class).  
- The TenantBackendApplication.java file path :              (D:\TenantProject\TenantTrack\tenant-backend\src\main\java\com\tenanttrack\tenant_backend\TenantBackendApplication.java) is the entry point for the app.  

## 5.1-(B)

Open Postman, Create a new request in our TenantTrack workspace.

- Now test the API in Postman using below command

         ```Postman

            GET http://localhost:8080/api/tenants

         ```

- **[Issue](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-3-task-issue) : 401 Unauthorized ⚠️**
            **The request is unauthenticated.**
         **Couldn't evaluate the test script:**
         **JSONError: No data, empty input at 1:1 ^**

- **Error Analysis :⚠️**  
- 401 Unauthorized: The request to GET [http://localhost:8080/api/tenants] is being   blocked because Spring Security (added to the project) is enforcing authentication, which we haven’t configured yet.
- JSONError: No data, empty input: Postman couldn’t parse the response because the server returned an empty or invalid response due to the 401 error.  

- **Issue Resolved :** ✅
- By Disabling Spring Security Temporarily.Since authentication isn’t set up yet, let’s disable it for testing.  
Open D:\TenantProject\TenantTrack\tenant-backend\src\main\java\com\tenanttrack\tenant_backend\TenantBackendApplication.java.

Add @SpringBootApplication(exclude = {SecurityAutoConfiguration.class}):

       ```Java

            package com.tenanttrack.tenant_backend;

            import org.springframework.boot.SpringApplication;
            import org.springframework.boot.autoconfigure.SpringBootApplication;
            import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

            @SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
            public class TenantBackendApplication {

            public static void main(String[] args) {

            SpringApplication.run(TenantBackendApplication.class, args);
    
            }

            }

        ```

## 5.1-(C)

    Now Restart Spring Boot App.

    ```VS-Code

     D:\TenantProject\TenantTrack\tenant-backend: mvn spring-boot:run

     ```

## 5.1-(D)

Now again Retry the GET request in Postman :

    ```Postman

        GET [http://localhost:8080/api/tenants]

    ```

Output in the Response body : [] (empty array (or) we can say empty list  since no tenants added yet).

## Step 5.2 :  Now Test the POST request in Postman ✅

- Set method to POST, URL: [http://localhost:8080/api/tenants]
- Go to Body > raw > JSON, add:

      ```Json

          {
             "roomNumber": "101",
             "name": "Faisal",
             "phone": "9876543210",
             "rent": 5000
          }

       ```

- Once done then click on Send button.
- Output in Response body : A default id will be generated associated with the given fields.

       ```Json

            {
               "id": "682b397078f66a3fda161d1a",
               "name": "Faisal",
               "phone": "9876543210",
               "doj": null,
               "roomNumber": "101",
               "rent": 5000.0
            }

        ```

## Step 5.3 :  Now again Retest the GET request in Postman : ✅

GET [http://localhost:8080/api/tenants] and then click on Send button.

Output in Respose body: [{"id":"682b397078f66a3fda161d1a","name":"Faisal","phone":"9876543210","doj":null,"roomNumber":"101","rent":5000.0}]

## Step 5.4 : Updating README.md file and pushing the changes into our github TenantTrack Repo

### Day 3 tasks short summmary :🚀

   **1. Set Up Spring Boot Project.**✅
   **2. Run MongoDB in Docker.**✅
   **3. Connect Spring Boot to MongoDB.**✅
   **4. Create Basic API.**✅
   **5. Test APIs with Postman.**✅
   **6. Update the README.md and**✅
   **7. Finally add, commit and push the changes to GitHub TenantTrack repository.**✅

- **Finally Updating the README.md file and then pushing the changes into our github  MohemmadShaik/TenantTrack repository.**  

        ```bash

            PS D:\TenantProject\TenantTrack\tenant-backend> git add .
            PS D:\TenantProject\TenantTrack\tenant-backend> git commit -m "Day 3 : Successfully configured Java backend with Spring Boot, MongoDB integration and updated the completed tasks status of Day 3 in short summary."
            PS D:\TenantProject\TenantTrack\tenant-backend> git push origin main

        ```

Let's Test and Confirm the Spring Boot app runs with no issues with the current setup done so far (i.e Day 1 to Day 3) by running the mvn spring-boot:run in the vs code terminal window (or) directly executing the TenantBackendApplication.java (the main root class).

    ```Java Output
    PS D:\TenantProject\TenantTrack\tenant-backend> mvn spring-boot:run

    2025-05-20T02:33:37.663+05:30  INFO 18624 --- [tenant-backend] [localhost:27017] org.mongodb.driver.cluster : Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, cryptd=false, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=36326300, minRoundTripTimeNanos=0}
    2025-05-20T02:33:37.767+05:30  INFO 18624 --- [tenant-backend] [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer : LiveReload server is running on port 35729
    2025-05-20T02:33:38.236+05:30  INFO 18624 --- [tenant-backend] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer : Tomcat started on port 8080 (http) with context path '/'
    2025-05-20T02:33:38.245+05:30  INFO 18624 --- [tenant-backend] [  restartedMain] c.t.t.TenantBackendApplication : Started TenantBackendApplication in 2.763 seconds (process running for 3.201)

    ```

## Analysis

- **MongoDB Connection :** Successfully connected to MongoDB at localhost:27017 (state=CONNECTED). This  confirms the tenant-mongo container is running, and Spring Boot’s connection to tenantdb is working. ✅
- **LiveReload :**Enabled on port 35729 (due to Spring Boot DevTools), supporting faster development. ✅
- **Tomcat Server :** Started on port 8080 with context path /, meaning APIs are accessible at [http://localhost:8080/api/tenants]. ✅
- **App Startup :** Started TenantBackendApplication in 2.763 seconds, indicating the app is running smoothly with no errors. ✅
- **Naming Note :** The log now correctly shows “TenantBackendApplication” (uppercase ‘B’), resolving the earlier lowercase inconsistency (“TenanttrackApplication”)

## ✅ Day 3 Status : Task completed successfully

The Spring Boot app (version 3.4.5) is running smoothly with no issues,And all components (MongoDB, APIs) are functional.Finally Day 3 task completed successfully. ✅

---

## Day 4: Secure APIs & Enhance CRUD

### Task D4.1: Configure Spring Security**  

**- D4.1.1.Add Spring Security Dependency :**  
**- D4.1.2.Remove Temporary Exclusion :**  
**- D4.1.3.Configure Security :**  
    [ISSUE-1 RESOLVED](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#d413-issue-1--deprecated-withdefaultpasswordencoder-and-cors-configuration-in-securityconfigjava)  
**- D4.1.4.Test Authentication**  
    [ISSUE-2 RESOLVED](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#d414-issue-2--spring-security-realmname-error--d414-issue-2-screenshot-error-)  

===<>=====<>=======<>===<>=====<>=======<>===<>=====<>=======<>===<>=====<>=======<>

**D4.1.1.Add Spring Security Dependency :**  

Ensure pom.xml includes Spring Security (already added in Day 3).  

Verify in [D4.1.1 SCREENSHOT](./tenant-backend/docs/screenshots/Day4-1.1%20Confirming%20Spring%20Security%20enabled.png)
  
      ```xml
         <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
      ```

**D4.1.2.Remove Temporary Exclusion :**  

In TenantBackendApplication.java, remove exclude = {SecurityAutoConfiguration.class} to enable Spring Security:

      ```Java
        package com.tenanttrack.tenant_backend;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

        @SpringBootApplication
        public class TenantBackendApplication {
            public static void main(String[] args) {
                SpringApplication.run(TenantBackendApplication.class, args);
            }
        }

      ```

**- D4.1.3.Configure Security :**  

Create SecurityConfig.java in  
D:\TenantProject\TenantTrack\tenant-backend\src\main\java\com\tenanttrack\tenant_backend\config:

    ```SecurityConfig.java

    package com.tenanttrack.tenant_backend.config;

        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.security.config.annotation.web.builders.HttpSecurity;
        import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
        import org.springframework.security.core.userdetails.User;
        import org.springframework.security.core.userdetails.UserDetailsService;
        import org.springframework.security.provisioning.InMemoryUserDetailsManager;
        import org.springframework.security.web.SecurityFilterChain;

        @Configuration
        @EnableWebSecurity
        public class SecurityConfig {
        
            @Bean
            public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                http.authorizeHttpRequests(auth -> auth.requestMatchers("/api/tenants/**").authenticated()
                        .anyRequest().permitAll())
.~~httpBasic~~()
                    .~~and~~()
                    .~~csrf~~().disable() // Disable CSRF for Postman testing
                    .~~cors~~(); // Enable CORS for React
                return http.build();
            }

            @Bean
            public UserDetailsService userDetailsService() {
var user = User.~~withDefaultPasswordEncoder~~()
                    .username("admin")
                    .password("password")
                    .roles("USER")
                    .build();
                return new InMemoryUserDetailsManager(user);
            }
        }
    ```

 [D4.1.3 ISSUE SCREENSHOT](./tenant-backend/docs/screenshots/D4.1.3%20STRIKED%20LINES_pic1.png)

- The striked lines are :
  .httpBasic(), .and(), .csrf(), .cors(), and User.withDefaultPasswordEncoder()

- These are critical components for enabling basic authentication, disabling CSRF, enabling CORS, and
  setting up in-memory user authentication in your TenantTrack project. The striked lines suggest potential issues (e.g., deprecated methods or syntax errors) that could prevent Spring Security from functioning correctly.

**[D4.1.3 Issue-1 Analysis :](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#d413-issue-1--deprecated-withdefaultpasswordencoder-and-cors-configuration-in-securityconfigjava)**

## certain lines appear to be "striked" (likely indicating they are problematic or deprecated)

### Updated SecurityConfig.java

- Use **BCryptPasswordEncoder** instead of the deprecated User.withDefaultPasswordEncoder().
- Properly configure **.httpBasic(), .csrf(), and .cors() for secure APIs and React integration.**
- Align with your project’s goal of securing /api/tenants/** endpoints with basic authentication (admin:password).

 **SecurityConfig.java updated code :**

package com.tenanttrack.tenant_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/tenants/**").authenticated()
                .anyRequest().permitAll())
            .httpBasic(httpBasic -> httpBasic
                .authenticationEntryPoint(new org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint()))
            .sessionManagement(session -> session
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .csrf(csrf -> csrf.disable()) // Disable CSRF for Postman testing
            .cors(cors -> cors.configurationSource(corsConfigurationSource())); // Enable CORS for React
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        var user = User.builder()
            .username("admin")
            .password(passwordEncoder.encode("password"))
            .roles("USER")
            .build();
        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("http://localhost:3000"); // React frontend URL
        configuration.addAllowedMethod("*"); // Allow all HTTP methods
        configuration.addAllowedHeader("*"); // Allow all headers
        configuration.setAllowCredentials(true); // Allow credentials (for Basic Auth)
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}

### Explanation of Changes  

**1.Replaced User.withDefaultPasswordEncoder():**

- The deprecated User.withDefaultPasswordEncoder() was replaced with User.builder() and a separate BCryptPasswordEncoder bean for secure password encoding.
- BCryptPasswordEncoder is production-ready and avoids deprecation warnings.

**2.Updated .httpBasic():**

- Used the newer lambda-based configuration (httpBasic(httpBasic -> ...)) for Spring Security 6.
- Added a BasicAuthenticationEntryPoint to ensure proper handling of unauthorized requests.

**3.Explicit CORS Configuration:**

- Replaced .cors() with .cors(cors -> cors.configurationSource(corsConfigurationSource())).
- Added a CorsConfigurationSource bean to explicitly allow requests from [http://localhost:3000] (React frontend), supporting all HTTP methods and credentials for Basic Auth.

**4.CSRF and Session Management:**

- Kept .csrf(csrf -> csrf.disable()) for Postman testing (safe for now, but consider enabling in production).
- Added .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) to make the API stateless, suitable for REST and React integration.

**5.Modern Syntax:**

- Used lambda-based configuration (e.g., auth ->, csrf ->) for consistency with Spring Security 6.

**- D4.1.4.Test Authentication**  

- Restart Spring Boot: mvn spring-boot:run in D:\TenantProject\TenantTrack\tenant-backend.

**Note :** Try to refresh the dependencies before executing/running the main class (i.e TenantBackendApplication.java) using the below command :

  mvn clean install  

[**D4.1.4 Issue-2 SCREENSHOT Error :**](./tenant-backend/docs/screenshots/D4.1.4%20Refresh%20the%20dependencies%20cmd%20Error.png)

**Error Analysis : Test Failure on mvn clean install**
The error you're encountering when running mvn clean install indicates that the test TenantBackendApplicationTests.contextLoads is failing due to an IllegalStateException: Failed to load ApplicationContext. This typically points to an issue with the Spring Boot application context configuration, often caused by misconfigured dependencies, beans, or environment settings.

The key details from the error are:

**- Error:** IllegalStateException: Failed to load ApplicationContext  
**- Test Class:** com.tenanttrack.tenant_backend.TenantBackendApplicationTests  
**- Context Configuration:** WebMergedContextConfiguration with the main application class com.tenanttrack.tenant_backend.TenantBackendApplication  
**- Location of Logs:** D:\TenantProject\TenantTrack\tenant-backend\target\surefire-reports  

- Let's try to open TenantBackendApplicationTests.txt available in  
  D:\TenantProject\TenantTrack\tenant-backend\target\surefire-reports

- See for "caused by" for the error occured.

- The stack trace reveals that the IllegalStateException: Failed to load ApplicationContext is
  caused by a Spring Security configuration issue.
  
  Specifically, the error stems from a BasicAuthenticationEntryPoint bean in your SecurityConfig clas  where the realmName property is not specified,  
  leading to an IllegalArgumentException: realmName must be specified.

- This issue likely arises because you started implementing Spring Security on Day 4 (as per  
  the  README.md Day 4 Action Plan: "Configure Spring Security (2 hours): Add basic authentication (username/password) for  
  API endpoints").

- However, the BasicAuthenticationEntryPoint configuration is  incomplete, causing the test  
  (TenantBackendApplicationTests.contextLoads) to fail when attempting to  load the application context during mvn clean install.  

### Error Analysis  

**The key points from the stack trace are:**  

**Root Cause:** java.lang.IllegalArgumentException: realmName must be specified in BasicAuthenticationEntryPoint.afterPropertiesSet.  
**Problematic Bean:** org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint.  
**Configuration Class:** com.tenanttrack.tenant_backend.config.SecurityConfig defines a securityFilterChain bean that uses BasicAuthenticationEntryPoint.  
**Context:** This error occurs during the test phase (TenantBackendApplicationTests), indicating the application context fails to load due to the misconfigured BasicAuthenticationEntryPoint.  

**KEY NOTE :**

- The BasicAuthenticationEntryPoint is part of Spring Security’s HTTP Basic Authentication setup.

- Spring Security requires the realmName property to be set for this component, which identifies the authentication realm (a string sent in the WWW-Authenticate header to indicate the protected area).

- Since it’s not set in your SecurityConfig, the application context fails to initialize.  

**Q) How to set realmName property in your SecurityConfig?**  
**Sol :** Open the SecurityConfig.java file and Set the missing realmName property for
          BasicAuthenticationEntryPoint.  

    ~~~SecurityConfig.java

        import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

        BasicAuthenticationEntryPoint authEntryPoint = new BasicAuthenticationEntryPoint();
        authEntryPoint.setRealmName("TenantTrackRealm");

    ~~~

**Explanation:**  

- The setRealmName method specifies the authentication realm, which is required for
  BasicAuthenticationEntryPoint.  
- "TenantTrackRealm" is an arbitrary name but should be meaningful to your application.  

        ```SecurityConfig.java 
        
            package com.tenanttrack.tenant_backend.config;

            import org.springframework.context.annotation.Bean;
            import org.springframework.context.annotation.Configuration;
            import org.springframework.security.config.annotation.web.builders.HttpSecurity;
            import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
            import org.springframework.security.config.http.SessionCreationPolicy;
            import org.springframework.security.core.userdetails.User;
            import org.springframework.security.core.userdetails.UserDetailsService;
            import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
            import org.springframework.security.crypto.password.PasswordEncoder;
            import org.springframework.security.provisioning.InMemoryUserDetailsManager;
            import org.springframework.security.web.SecurityFilterChain;
            import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
            import org.springframework.web.cors.CorsConfiguration;
            import org.springframework.web.cors.CorsConfigurationSource;
            import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

            @Configuration
            @EnableWebSecurity
            public class SecurityConfig {
            
                @Bean
                public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                    BasicAuthenticationEntryPoint authEntryPoint = new BasicAuthenticationEntryPoint();
                    authEntryPoint.setRealmName("TenantTrackRealm"); // Set realmName
                    http.authorizeHttpRequests(auth -> auth.requestMatchers("/api/tenants/**").authenticated().anyRequest().permitAll())
                        .httpBasic(httpBasic -> httpBasic.authenticationEntryPoint(authEntryPoint))
                        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                        .csrf(csrf -> csrf.disable()) // Disable CSRF for Postman testing
                        .cors(cors -> cors.configurationSource(corsConfigurationSource())); // Enable CORS for React
                    return http.build();
                }

                @Bean
                public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
                    var user = User.builder()
                        .username("admin")
                        .password(passwordEncoder.encode("password"))
                        .roles("USER")
                        .build();
                    return new InMemoryUserDetailsManager(user);
                }

                @Bean
                public PasswordEncoder passwordEncoder() {
                    return new BCryptPasswordEncoder();
                }

                @Bean
                public CorsConfigurationSource corsConfigurationSource() {
                    CorsConfiguration configuration = new CorsConfiguration();
                    configuration.addAllowedOrigin("http://localhost:3000"); // React frontend URL
                    configuration.addAllowedMethod("*"); // Allow all HTTP methods
                    configuration.addAllowedHeader("*"); // Allow all headers
                    configuration.setAllowCredentials(true); // Allow credentials (for Basic Auth)
                    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
                    source.registerCorsConfiguration("/**", configuration);
                    return source;
                }
            }
      ```

- Test with Postman :  

      - GET Request :  
        - URL : [http://localhost:8080/api/tenants]  
        - Method: GET  
        - Authentication: Basic Auth  
          - Username: admin  
          - Password: password  
        - Expected Response: 200 OK with [] (empty array if no tenants) or existing tenant data (e.g.,
          Faisal’s record).
      [postman GET Response Screenshot](./tenant-backend/docs/screenshots/D4.1.4%20%20Postman%20GET%20Request%20Outcome_pic.png)

      - POST Request:  
        - URL: [http://localhost:8080/api/tenants]  
        - Method: POST  
        - Authentication: Basic Auth (admin/password)  
        - Body (JSON):  

                 ```json
                    {
                        "roomNumber": "102",
                        "name": "Amit Sharma",
                        "phone": "9123456789",
                        "rent": 6000
                    }
                 ```
     [postman POST Response Screenshot](./tenant-backend/docs/screenshots/D4.1.4%20%20Postman%20POST%20Request%20Outcome_pic.png)

<*>=======<*>===**TASK DAY 4.1 : Configure Spring Security COMPLETED**===<*>=======<*>
+++++++++<>----<><>+++++++++<>-------<>++++++++++++<>----<><>+++++++++<>-------<>++++++++++++

    1. Located and fixed SecurityConfig by setting the realmName property for       
       BasicAuthenticationEntryPoint, and  Updated the SecurityConfig.java   
    
    2. Added User Authentication by modifying the SecurityConfig.java to include an in-memory user for testing purposes  :  
    
    ```SecurityConfig.java

         @Bean
         public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
            var user = User.builder()
                .username("admin")
                .password(passwordEncoder.encode("password"))
                .roles("USER")
                .build();
            return new InMemoryUserDetailsManager(user);
         }

        //Since I need secure password hashing moreover it is Production environment friendly as well.

         @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
    ```

    3. Updated TenantBackendApplicationTests.java using Mock Security Context to test with security enabled.

    ```TenantBackendApplicationTests.java
        package com.tenanttrack.tenant_backend;     
        import org.junit.jupiter.api.Test;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.security.test.context.support.WithMockUser;

        @SpringBootTest
        class TenantBackendApplicationTests {

        @Test
        @WithMockUser(username = "admin", roles = {"USER"}) // Mock user for testing
            // This annotation allows the test to run with a mock user having the role "USER"
            void contextLoads() {
            }
        }
    ```
  4. Verified spring-security-test is in pom.xml
  
    ```pom.xml

        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
    ```

  5. Verified MongoDB Connection using
  
      docker ps //which Confirm tenant-mongo is running and mapped to 0.0.0.0:27017->27017/tcp.

      docker start tenant-mongo //if not running try to start it  

 6. Clean and Rebuild //to clear any cached artifacts and rebuild :

     mvn clean install
  
     Output :
     ======
        [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.096 s -- in com.tenanttrack.tenant_backend.TenantBackendApplicationTests
        [INFO] 
        [INFO] Results:
        [INFO]
        [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
        [INFO]
        [INFO]
        [INFO] --- jar:3.4.2:jar (default-jar) @ tenant-backend ---
        [INFO] Building jar: D:\TenantProject\TenantTrack\tenant-backend\target\tenant-backend-0.0.1-SNAPSHOT.jar
        [INFO] 
        [INFO] --- spring-boot:3.4.5:repackage (repackage) @ tenant-backend ---
        [INFO] Replacing main artifact D:\TenantProject\TenantTrack\tenant-backend\target\tenant-backend-0.0.1-SNAPSHOT.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
        [INFO] The original artifact has been renamed to D:\TenantProject\TenantTrack\tenant-backend\target\tenant-backend-0.0.1-SNAPSHOT.jar.original
        [INFO]
        [INFO] --- install:3.1.4:install (default-install) @ tenant-backend ---
        [INFO] Installing D:\TenantProject\TenantTrack\tenant-backend\pom.xml to C:\Users\Mohammad\.m2\repository\com\tenanttrack\tenant-backend\0.0.1-SNAPSHOT\tenant-backend-0.0.1-SNAPSHOT.pom
        [INFO] Installing D:\TenantProject\TenantTrack\tenant-backend\target\tenant-backend-0.0.1-SNAPSHOT.jar to C:\Users\Mohammad\.m2\repository\com\tenanttrack\tenant-backend\0.0.1-SNAPSHOT\tenant-backend-0.0.1-SNAPSHOT.jar
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time:  13.164 s
        [INFO] Finished at: 2025-06-01T20:50:48+05:30
        [INFO] ------------------------------------------------------------------------

  7. Testing the connection manually using the below command in the Powershell terminal path :  
     D:\TenantProject\TenantTrack\tenant-backend> mvn spring-boot:run  

        Output :
        ======
            2025-06-01T21:01:04.776+05:30  INFO 26540 --- [tenant-backend] [localhost:27017] org.mongodb.driver.cluster : Monitor thread successfully connected
            to server with description ServerDescription{address=localhost:27017, type=STANDALONE, cryptd=false, state=CONNECTED, ok=true,
            minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=22423400,
            minRoundTripTimeNanos=0}  
            2025-06-02T09:24:40.283+05:30  INFO 25808 --- [tenant-backend] [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
            2025-06-02T09:24:40.547+05:30  INFO 25808 --- [tenant-backend] [  restartedMain] r$InitializeUserDetailsManagerConfigurer : Global AuthenticationManager configured with UserDetailsService bean with name userDetailsService
            2025-06-02T09:24:40.967+05:30  INFO 25808 --- [tenant-backend] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
            2025-06-02T09:24:40.975+05:30  INFO 25808 --- [tenant-backend] [  restartedMain] c.t.t.TenantBackendApplication           : Started TenantBackendApplication in 3.026 seconds (process running for 3.434)  

 8. Testing GET and POST request in the Postman is successful.  
 9. Finally updating the README.md, DAILY_PROGRESS.md, BUGS_AND_RESOLUTIONS.md,
    InterviewPrepQuiz.md and pushing the changes to our GitHub repository.  

    - Open the Bash Terminal :  
        git add .  
        git commit -m "Day4.1 Configure Spring Security ( All 4 tasks) completed and Resolved 2 issues successfully."  
        git push origin main  
