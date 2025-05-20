
# TenantTrack 🏠

A project to manage tenant data using a modern tech stack.

## Technologies and Tools 🛠️

### Frontend 🌐

- HTML5  
- CSS3  
- JavaScript  
- React  

### Backend ⚙️  

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

### CI/CD 🚀  

- GitHub Actions (for automated backend build and test)  

### Tools 🔧

- Docker Desktop (4.40.0+)  
- Git  
- Postman  
- WSL 2  
- Ubuntu 24.04  

### IDE  💻

- VS Code  

### Operating System  🖥️

- Windows 11 Home (23H2)  

#### Note : **ALL LISTED TOOLS AND TECHNOLOGIES ARE FREE OF COST FOR PERSONAL USE OR OPEN-SOURCE.** 📢 (Docker Desktop is free for personal use;  Postman has a free tier;  Windows 11 Home (23H2) is pre-installed.)

# TenantTrack Full-Stack Directory Structure (tenant-backend and tenant-frontend )

                             TenantTrack/
                             ├── tenant-backend/                  # Spring Boot Backend
                             │   ├── src/
                             │   │   ├── main/
                             │   │   │   ├── java/com/tenanttrack/tenant_backend/
                             │   │   │   │   ├── controller/      # REST APIs
                             │   │   │   │   ├── model/           # MongoDB entities
                             │   │   │   │   ├── repository/      # MongoDB repositories
                             │   │   │   │   ├── service/         # Business logic
                             │   │   │   │   └── TenantBackendApplication.java
                             │   │   │   └── resources/
                             │   │   │       ├── static/          # (Optional: Frontend build files)
                             │   │   │       ├── templates/
                             │   │   │       └── application.properties
                             │   │   └── test/                    # Unit/Integration tests
                             │   ├── target/
                             │   ├── .mvn/wrapper/
                             │   ├── docs/                        # Project documentation
                             │   │   ├── BUGS_AND_RESOLUTIONS.md  # Error log with screenshots
                             │   │   ├── ARCHITECTURE.md          # System design notes
                             │   │   └── screenshots/             # Error screenshots
                             │   ├── pom.xml
                             │   ├── mvnw
                             │   ├── mvnw.cmd
                             │   ├── HELP.md
                             │   ├── .gitignore
                             │   └── interviewPrepQuiz.md         # Interview Q&A
                             │
                             ├── tenant-frontend/                 # React Frontend
                             │   ├── src/
                             │   │   ├── components/              # Reusable UI components
                             │   │   │   ├── TenantList.jsx       # Tenant table view
                             │   │   │   ├── RentPaymentForm.jsx  # Payment form
                             │   │   │   └── NotificationBell.jsx # Notification UI
                             │   │   ├── pages/
                             │   │   │   ├── Dashboard.jsx        # Main view
                             │   │   │   └── TenantDetails.jsx    # Tenant profile
                             │   │   ├── services/
                             │   │   │   └── api.js               # Axios API calls
                             │   │   ├── App.js
                             │   │   └── index.js
                             │   ├── public/
                             │   │   ├── index.html
                             │   │   └── favicon.ico
                             │   ├── package.json
                             │   ├── README.md                    # Frontend setup guide
                             │   └── .gitignore
                             │
                             ├── docker-compose.yml               # Multi-container setup (NEW)
                             ├── README.md                        # Full project overview
                             └── DAILY_PROGRESS.md                # Daily task log

# TenentTrack Action Plans 🗓️

## [Day 1 Action Plan](./DAILY_PROGRESS.md#day-1-task-update)

**Goal :** Install and verify OpenJDK 17, Maven, and VS Code to set up your development environment for TenantTrack.  
**Outcome :** Tools installed, verified, and ready for Java and Spring Boot development.  

**Issues Found : 0**  
**Issues Resolved : 0**

# ✅ Day 1 : Task completed successfully

## [Day 2 Action Plan](./DAILY_PROGRESS.md#day-2-task-update)

**Goal :** Install and verify Docker Desktop, Git, and Postman to complete your development environment setup for TenantTrack project.  
**Outcome :** Docker running containers, Git ready for version control, Postman set up for API testing.

**[Issues Found : 1](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-2-task-issue)**  

    Missing docker-desktop-data in wsl  

**[Issues Resolved : 1](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-2-task-issue)**  

# ✅ Day 2 : Task completed successfully

## [Day 3 Action Plan](./DAILY_PROGRESS.md#day-3-update)

**Goal :** Set up Java backend with Spring Boot and MongoDB integration.  
**Tasks :**

  1. Set Up Spring Boot Project : Use Spring Initializr [https://start.spring.io], select Java 17, Maven, add Spring Web, Spring Data MongoDB, and Spring Security. Download, unzip, open in VS Code.
  2. Run MongoDB in Docker : Run docker run -d -p 27017:27017 --name tenant-mongo mongo:latest.
  3. Connect Spring Boot to MongoDB : Add MongoDB URI (mongodb://localhost:27017/tenantdb) in application.properties, create a Tenant model, and a repository for CRUD operations.
  4. Create Basic API : Build a REST controller with endpoints (GET /tenants, POST /tenants) to list and add tenants.
  5. Test and Commit : Test APIs with Postman, commit changes to GitHub (git add ., git commit -m "Day 3 backend setup", git     push).

  **[Issues Found : 1](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-3-task-issue)**
  
     401 Unauthorized, The request is unauthenticated.  

  **[Issues Resolved : 1](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-3-task-issue)**  

# ✅ Day 3 : Task completed successfully

## Day 4 Action Plan  

**Tasks:**  
1.Configure Spring Security (2 hours): Add basic authentication (username/password) for API endpoints.
2.Enhance API (1 hour): Add endpoints for updating (PUT /api/tenants/{id}) and deleting (DELETE /api/tenants/{id}).
3.Start React Frontend (2 hours): Set up a React app, create a basic UI to display tenants.  

**Issues Found : 0**  
**Issues Resolved : 0**

+++++++++<>----<><>+++++++++<>-------<>++++++++++++<>----<><>+++++++++<>-------<>++++++++++++

# Daywise Achievements💡

Day 1: Environment setup.  
Day 2: Spring Boot + MongoDB integration.  
Day 3: CRUD APIs + Postman testing.  

## **Why This Works?**

1. **Interview Ready**: Demonstrates debugging skills (a key interview criterion).  
2. **Track Record**: Chronological errors + fixes show project evolution.  
3. **Screenshot Integration**: Visual proof of issues resolved.  

### **Pro Tips**

- **Screenshot Folder**: Create a `/docs/screenshots` subfolder for images.  
- **Tag Errors**: Use labels like `[HIGH PRIORITY]` or `[INTERVIEW TOPIC]`.  
- **Link to Commits**: Reference Git commit hashes where fixes were applied.
