
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

### Note : **ALL LISTED TOOLS AND TECHNOLOGIES ARE FREE OF COST FOR PERSONAL USE OR OPEN-SOURCE.** 📢 (Docker Desktop is free for personal use;  Postman has a free tier;  Windows 11 Home (23H2) is pre-installed.)

## TenantTrack Full-Stack Directory Structure (tenant-backend and tenant-frontend )

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

## TenentTrack Action Plans 🗓️

## [Day 1 Action Plan](./DAILY_PROGRESS.md#day-1-task-install-java17-maven-and-visual-studio-code-editor-ide)

**Goal :** Install and verify OpenJDK 17, Maven, and VS Code to set up your development environment for TenantTrack.  
**Task : Need to complete 3 tasks**  

- D1.1. Install Java17  
- D1.2. Install Maven  
- D1.3. Install Visual Studio Code (IDE)  

**Issues Found : 0**
**Issues Resolved : 0**  

**Outcome :** Tools installed, verified, and ready for Java and Spring Boot development.  

## Day 1 : Action Plan Completed Successfully. ✅  

## [Day 2 Action Plan](./DAILY_PROGRESS.md#day-2-task-install-docker-git-and-postman)

**Goal :** Install and verify Docker Desktop, Git, and Postman to complete your development environment setup for TenantTrack project.  
**Task : Need to complete 3 tasks**

- D2.1. Install Docker  
- D2.2. Install GIT Version Controller  
- D2.3. Install Postman  

**[Issues Found : 1](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-2-task-issue)** Missing docker-desktop-data in wsl  

**[Issues Resolved : 1](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-2-task-issue)**  

**Outcome :** Docker running containers, Git ready for version control, Postman set up for API testing.  

**Issues Found : 1**  
**Issues Resolved : 1**  

## Day 2 : Action Plan Completed Successfully. ✅

## [Day 3 Action Plan](./DAILY_PROGRESS.md#day-3-task-setting-up-java-backend-with-spring-boot-and-mongodb-integration)

**Goal :** Set up Java backend with Spring Boot and MongoDB integration.  
**Tasks : Need to complete 5 tasks**  

- D3.1. Set Up Spring Boot Project : Use [Spring Initializr](./tenant-backend/docs/screenshots/Day3_1_Spring-Initializr_pic.png) [https://start.spring.io],  
  Select Java 17, Maven, add Spring Web, Spring Data MongoDB, and Spring Security.  
  Download, unzip, open in VS Code.  

- D3.2. Run MongoDB in Docker : Run docker run -d -p   27017:27017 --name tenant-mongo mongo:latest.  

- D3.3. Connect Spring Boot to MongoDB : Add MongoDB URI  
  (mongodb://localhost:27017/tenantdb) in application.properties, create a Tenant model, and a repository for CRUD operations.  

- D3.4. Create Basic API : Build a REST controller with
  endpoints (GET /tenants, POST /tenants) to list and add tenants.  

- D3.5. Test and Commit : Test APIs with Postman, commit  
  changes to GitHub (git add ., git commit -m "Day 3 backend setup", git push).  

  **[Issues Found : 1](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-3-task-issue)** 401 Unauthorized, The request is unauthenticated.  

  **[Issues Resolved : 1](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-3-task-issue)**  

  **Issues Found : 1**
  **Issues Resolved : 1**  

## Day 3 : Action Plan Completed Successfully. ✅  

## [Day 4 Action Plan](DAILY_PROGRESS.md#day-4-task-secure-apis--enhance-crud)  

**Goal :**  

- Enhance the backend with Spring Security for authentication  
- Add update/delete API endpoints, and  
- initialize the React frontend for tenant management.  

**Tasks : Need to complete 4 tasks**  
  
### D4.1. Configure Spring Security (2 hours)  

   **--> D4.1.1.Add Spring Security Dependency :** ✅

   **--> D4.1.2.Remove Temporary Exclusion :** ✅  

   **--> D4.1.3.Configure Security [ISSUE-1 RESOLVED]** ✅  
  
   **--> D4.1.4.Test Authentication [ISSUE-2 RESOLVED]** ✅  
  
  **Day4 Issue 3 RESOLVED : Web Server Failed to Start - Port 8080 in Use**  

  **[BUGS & RESOLUTION](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-414--port-8080-conflict)**  

  **[SCREENSHOT](./tenant-backend/docs/screenshots/Day%204-%20Port%208080%20in%20use%20conflict.png)**  

  **D4.1 Issues Found : 3**
  **D4.1 Issues Resolved : 3**  

- Implement basic authentication (username/password) for API endpoints.
- Use in-memory authentication for simplicity (e.g., admin:password).
- Secure /api/tenants endpoints to require authentication.

### D4.2. Enhance API (1 hour) --WORK IN PROGRESS  

- Add PUT /api/tenants/{id} to update tenant details.  
- Add DELETE /api/tenants/{id} to delete a tenant.  

### D4.3. Start React Frontend (2 hours)  

- Set up a React app using create-react-app.  
- Create a basic UI to display a list of tenants fetched from the backend.  

### D4.4. Test and Commit (1 hour)  

- Test APIs with Postman (with authentication).  
- Test React app in browser.  
- Commit changes to GitHub.  

**Outcome :**  

- Backend APIs are secured with basic authentication.
- Full CRUD functionality (Create, Read, Update, Delete)  
  for tenants.  
- Basic React frontend displaying tenant list.  
- Changes pushed to GitHub with clear commit message.  

**Day 4 Over all Issues Found : 3**  
**Day 4 Over all Issues Resolved : 3**  

## Daywise Achievements💡

Day 1: Environment setup.  
Day 2: Spring Boot + MongoDB integration.  
Day 3: CRUD APIs + Postman testing.  
Day 4: Spring Security, Securing APIs & Enhance CRUD APIs , React setup and Expanding TenantTrack
       Functionality'.

## **Why This Works?**  

1. **Interview Ready**: Demonstrates debugging skills (a key interview criterion).  
2. **Track Record**: Chronological errors + fixes show project evolution.  
3. **Screenshot Integration**: Visual proof of issues resolved.  

### **Pro Tips**  

- **Screenshot Folder**: Create a '/docs/screenshots' subfolder for images.  
- **Tag Errors**: Use labels like '[HIGH PRIORITY]' or '[INTERVIEW TOPIC]'.  
- **Link to Commits**: Reference Git commit hashes where fixes were applied.

## VS-Code Extensions Installed  

1. **Java Extension Pack**  
2. **Docker Extension Pack**  
3. **Spring Extension Pack**  
4. **VS HTML to CSS by Neptune Design :** It generates CSS classes from HTML structure.  
                                      Step 1: Create HTML page first and select all and press Ctrl + Shift + p to open the command Palette, which is a powerful tool for accessing various commands, settings, and features.  
                                     - Now select HTML to CSS: Generate  
                                      Step 2:and now go to CSS file and press ctrl + v

5. **Auto Rename Tag by Jun Han :** It's whenever we Rename a Tag the corresponding opening and closing Tag automatically  adjusts its name to match the new tag.  

6. **Error Lens by Alexander :** For Highlighting  Errors, Warnings, and other language diagnostics in your code. It showsthe error message on the line.  

7. **draw.io Integration by Henning Dieterichs :** Sper easy to create flowcharts, Diagrams, and more right in your editor. It's perfect for Visualizing complex code structures (or) Planning Projects as you code.  
