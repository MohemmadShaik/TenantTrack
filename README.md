# TenantTrack 🏠
A project to manage tenant data using a modern tech stack.


## Technologies and Tools 🛠️

**Frontend** 🌐  
- HTML5  
- CSS3  
- JavaScript  
- React  

**Backend** ⚙️  
- Java (OpenJDK 17)  
- Spring Boot  
- Spring Security (for basic authentication)  
- MongoDB  
- Maven  
- REST APIs  
- JSON  
- JUnit  
- Swagger (OpenAPI)  
- Lombok  
- Log4j  

**CI/CD** 🚀  
- GitHub Actions (for automated backend build and test)  

**Tools** 🔧  
- Docker Desktop (4.40.0+)  
- Git  
- Postman  
- WSL 2  
- Ubuntu 24.04  

**IDE** 💻  
- VS Code  

**Operating System** 🖥️  
- Windows 11 Home (23H2)  

**Note**: **ALL LISTED TOOLS AND TECHNOLOGIES ARE FREE OF COST FOR PERSONAL USE OR OPEN-SOURCE.** 📢 (Docker Desktop is free for personal use; Postman has a free tier; Windows 11 Home is assumed to be pre-installed.)

## TenantTrack Daily Tasks amd Progress Overview 📈

**Day 1 Action Plan: **  Install OpenJDK, Maven, and VS Code
**Goal:** Install and verify OpenJDK 17, Maven, and VS Code to set up your development environment for TenantTrack.
**Outcome:** Tools installed, verified, and ready for Java and Spring Boot development.

**Day 1 Update :**
- OpenJDK 22: Installed JDK22, verified with java -version.✅
- Maven: Installed, verified with mvn -version.✅
- VS Code: Installed with Java Extension Pack, Spring Boot Extension Pack, and Docker extensions.✅
- Test.java: Created and ran successfully, printing “Hello, TenantTrack!”.✅
- Issues: None—smooth sailing!

# ✅ Day 1 Status : Task completed successfully!
---


**Day 2 Action Plan: Install Docker, Git, and Postman**
**Goal:** Install and verify Docker Desktop, Git, and Postman and also switch Java JDK22 to JDK17 (LTS) version to complete your development environment setup for TenantTrack project.
**Outcome:** Docker running containers, Git ready for version control, Postman set up for API testing.

**Day 2 Update :**
- OpenJDK 17 : Switched from Java JDK 22 to  JDK 17 version. ✅
- System: AMD64 (x64-based), AMD Ryzen 5 4600H 3.00 GHz, Windows 11 Home 23H2. ✅
- Docker Desktop (AMD64): Installed, ran docker run hello-world successfully. ✅
- Docker Version : Docker version 28.1.1, build 4eba377. ✅
- .wslconfig: Configured WSL 2 resources (`memory=4GB`, `processors=4`, `swap=1GB`) in `C:\Users\Mohammad\.wslconfig` with UTF-8. ✅
- Issue: Missing docker-desktop-data in wsl --list --verbose. Needs fixing. ⚠️ 
- Git, Postman: Not yet started (to be addressed after Docker).

⚠️ Day 2 Status in progress : 70% of Day2 task completed and The docker-desktop-data issue is blocking full Docker functionality, critical for TenantTrack’s MongoDB backend. Fixing this now ensures smooth progress.

- Finally, Resolved Docker Desktop issues by uninstalling and reinstalling Docker, moved disk images to D: drive (`D:\DockerData\DockerDesktopWSL`),
  confirmed new Docker Desktop 4.40.0+ structure with `docker-desktop` distro, enabled MongoDB containers with 18.4GB on C:, 149GB on D:, 4GB RAM, 4 CPUs. ✅
- Git and Postman successfully set up.✅
- Git Version: git version 2.43.0.windows.1 ✅
- GitHub Repo URL: https://github.com/MohemmadShaik/TenantTrack.git ✅
- Postman Test: Status 200 OK, Response includes current_user_url and other GitHub API endpoints. ✅

**Command prompt terminal window :** 
C:\Users\Mohammad>git --version
**git version 2.49.0.windows.1**✅

C:\Users\Mohammad>git config --global user.name
**MohemmadShaik**✅

C:\Users\Mohammad>git config --global user.email
**mohemmadshaik@gmail.com**✅


**Git bash terminal window :** 

Mohammad@ASUS-TUF-GAMING-A15 MINGW64 /d/TenantProject
**$ git clone https://github.com/MohemmadShaik/TenantTrack.git**✅


**Postman setup :** 

**Google A/c : mohemmadshaik@gmail.com** ✅
**Username : Hazarudin** ✅
**Worspace: TenantTrack** ✅

  
 #  ✅ Day 2 Status : Task completed successfully!
 ---

**Day 3 Action Plan :**
**Goal:** Set up Java backend with Spring Boot and MongoDB integration.
**Tasks:**
1. Set Up Spring Boot Project : Use Spring Initializr (https://start.spring.io), select Java 17, Maven, add Spring Web, Spring Data MongoDB, and Spring Security. Download, unzip, open in VS Code.
2. Run MongoDB in Docker : Run docker run -d -p 27017:27017 --name tenant-mongo mongo:latest.
3. Connect Spring Boot to MongoDB : Add MongoDB URI (mongodb://localhost:27017/tenantdb) in application.properties, create a Tenant model, and a repository for CRUD operations.
4. Create Basic API : Build a REST controller with endpoints (GET /tenants, POST /tenants) to list and add tenants.
5. Test and Commit : Test APIs with Postman, commit changes to GitHub (git add ., git commit -m "Day 3 backend setup", git push).

**Day 3 Update :**

**STEP 1 :** Using Spring Initializr (https://start.spring.io) with below settings, Generate Project completed.✅
Settings:
Project: Maven
Language: Java
Spring Boot: 3.2.x or latest
Group: com.tenanttrack
Artifact: tenant-backend
Dependencies:
Spring Web
Spring Data MongoDB
Lombok
Spring Boot DevTools
Validation

- And then extracted the downloaded zip file and launched vs code by rightclicking on tenant-backend folder available at path D:\TenantProject\TenantTrack\tenant-backend.

```

- Directory Structure (after unzip)
  
tenant-backend/
├── src/
│   └── main/
│       ├── java/com/tenanttrack/tenant_backend/
│       │   └── TenantBackendApplication.java
│       │   └── controller/
│       │   └── model/
│       │   └── repository/
│       │   └── service/
│       └── resources/
│           └── application.properties
├── pom.xml

```

- In VS code, opened pom.xml file and Verified all dependencies (i.e.; Spring Web, Spring Data MongoDB, Lombok, Spring Boot DevTools and Validation) were listed.

- ✅Finally, Run the java apllication src\main\java\com\tenanttrack\tenant_backend\TenantBackendApplication.java
  and Checked the “Started TenanttrackApplication” in logs successfully.

**KEY NOTES :**
--------------
- TenantBackendApplication.java (the Spring Boot entry point) typically stays at the root of the package (com.tenanttrack.tenant_backend) to maintain Spring Boot’s default configuration.
  
- **Restarting the Spring Boot App :** Running mvn spring-boot:run in VS Code does indeed start the Spring Boot application, which means executing TenantBackendApplication.java (the main class). This file (D:\TenantProject\TenantTrack\tenant- 
                                       backend\src\main\java\com\tenanttrack\tenant_backend\TenantBackendApplication.java) is the entry point for the app. ✅
  
- **How It Works in VS Code :** When you run mvn spring-boot:run in the terminal within VS Code, it automatically triggers TenantBackendApplication.java. Alternatively, you can use VS Code’s Run button on TenantBackendApplication.java
                                (if the Spring Boot Extension Pack is installed), which does the same thing.
  
**Confirmation of Spring Boot Setup : ** 
  ✅Successfully generated the Spring Boot 3.4.5 project, extracted it to D:\TenantProject\TenantTrack\tenant-backend, opened it in VS Code with required extensions (Spring Boot Extension Pack, Java Extension Pack, Docker),
     verified dependencies in pom.xml, and ran the application (TenantBackendApplication.java), confirming “Started TenanttrackApplication” in logs. ✅


**STEP 2 :** Steps to Run MongoDB in Docker.✅
- First of all ensure the Docker Desktop is open and in running state before running any docker commands.
- Now open powershell window and navigate to the path PS D:\DockerData\DockerDesktopWSL\disk> and type Run docker run -d -p 27017:27017 --name tenant-mongo mongo:latest.
- Now use docker ps commmand to display the containers or images so far created in the docker.
- The docker ps output shows the tenant-mongo container (image: mongo:latest) is running successfully, with port 27017 mapped (0.0.0.0:27017->27017/tcp). The container started 35 seconds ago and has been up for 34 seconds. ✅

**STEP 3 :** Steps to Connect Spring Boot to MongoDB✅

 ## 3.1 - Add MongoDB URI in application.properties✅
- Open D:\TenantProject\TenantTrack\tenant-backend\src\main\resources\application.properties in VS Code and append:
   # Mongo
    spring.data.mongodb.uri=mongodb://localhost:27017/tenantdb
    spring.data.mongodb.database=tenantdb
  
 ## 3.2 - Create Tenant Model✅
- In D:\TenantProject\TenantTrack\tenant-backend\src\main\java\com\tenanttrack\tenant_backend, create a new file Tenant.java
- Code in Tenant.java :

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

## 3.3 - Create Repository for CRUD Operations ✅
   
- In the same directory, create TenantRepository.java
- Code in TenantRepository.java

package com.tenanttrack.tenant_backend.repository;

import com.tenanttrack.tenant_backend.model.Tenant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TenantRepository extends MongoRepository<Tenant,String> { }

## 3.4 - Test MongoDB Connection

- Add a simple service to test the connection. In the same directory, create TenantService.java
- Code in TenantService.java

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
   






