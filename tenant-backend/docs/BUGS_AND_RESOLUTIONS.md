
# TenantTrack - Bugs & Resolutions Log ⏳

## Day 2 : Docker Setup

### Issue 1 : Missing `docker-desktop-data` in WSL

**Cause :** Corrupted Docker WSL distribution.  

**Resolution :**  

1. Reinstalled Docker Desktop.  
2. Moved disk image to `D:\DockerData\DockerDesktopWSL`.  
   - [D:\DockerData\DockerDesktopWSL\disk\docker_data.vhdx](./screenshots/Day2_DockerDesktopWSL%20-disk-docker_data_pic1.png)
   - [D:\DockerData\DockerDesktopWSL\main\ext4.vhdx](./screenshots/Day2_DockerDesktopWSL%20-main-ext4_pic2.png)
3. Verified with [`wsl --list --verbose`](./screenshots/Day2_Docker_Setup_configured%20successfully_pic3.png)  
  
  ---

## Day 3 : Spring Security 401 Error

### Issue 2 : Unauthorized API Access  

        HTTP 401 - "Unauthorized" in Postman
    
**Cause :** Spring Security auto-enabled blocking APIs.

**Resolution :**  

 -Temporarily disabled via @SpringBootApplication(exclude = {SecurityAutoConfiguration.class}).

 -Later added proper auth (Basic/JWT).

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

 ---

## Day 4 Spring Security, Securing APIs, REACT Setup and  Enhance CRUD APIs  

## D4.1.3 ISSUE-1 : Deprecated `withDefaultPasswordEncoder` and CORS Configuration in SecurityConfig.java

**Issue**:  [D4.1.3 ISSUE-1 SCREENSHOT](./screenshots/D4.1.3%20STRIKED%20LINES_pic1.png)
Striked lines in `SecurityConfig.java` (`httpBasic`, `csrf`, `cors`, `withDefaultPasswordEncoder`) indicated deprecation or misconfiguration.  

**Cause**:  
`User.withDefaultPasswordEncoder()` is deprecated in Spring Security 6; unclear CORS setup.  

**Resolution**:  

- Replaced `withDefaultPasswordEncoder()` with `BCryptPasswordEncoder`.  
- Configured explicit CORS with `CorsConfigurationSource` for `http://localhost:3000`.  
- Used lambda-based syntax for `httpBasic`, `csrf`, and `cors`.  

**Status**: ✅ Resolved  

## D4.1.4 ISSUE-2 : Spring Security realmName Error

[**D4.1.4 ISSUE-2 SCREENSHOT**](./screenshots/D4.1.4%20Refresh%20the%20dependencies%20cmd%20Error.png)

### Failed to load ApplicationContext due to missing realmName in BasicAuthenticationEntryPoint

**Cause**: 'BasicAuthenticationEntryPoint' in 'SecurityConfig' lacked a 'realmName', causing an  
           'IllegalArgumentException'.

**Resolution**:

- Added authEntryPoint.setRealmName("TenantTrackRealm") in SecurityConfig.java.

**Q) How to set realmName property in your SecurityConfig?**
**Sol :** Open the SecurityConfig.java file and Set the missing realmName property for  
          BasicAuthenticationEntryPoint.

    ```SecurityConfig.java

        import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

        BasicAuthenticationEntryPoint authEntryPoint = new BasicAuthenticationEntryPoint();
        authEntryPoint.setRealmName("TenantTrackRealm");

    ```

**Explanation:**  

- The setRealmName method specifies the authentication realm, which is required for    BasicAuthenticationEntryPoint.  
- "TenantTrackRealm" is an arbitrary name but should be meaningful to your application.

**Status**: ✅ Resolved

## Day 4.1.4 : Port 8080 Conflict

### Issue 3 : Web Server Failed to Start - Port 8080 in Use

**Cause**: Another process (e.g., a previous Spring Boot instance) was occupying port 8080, preventing Tomcat from starting.

**Resolution**: Open Powershell with Admin privilage and follow the below steps :

1. Identified the process using `netstat -aon | findstr :8080`.
2. Terminated the process with `taskkill /PID <PID> /F`.
3. Restarted the Spring Boot application using `mvn spring-boot:run`.

[ISSUE-3 SCREENSHOT](./screenshots/Day%204-%20Port%208080%20in%20use%20conflict.png)

**Verification**: Application started successfully, and APIs were accessible via Postman.

---

## Day 4.2 : Troubleshoot 404 Error for POST Request (Trailing Slash)

### Issue 9 : 404 Not Found - No static resource api/tenants

**Cause**: The POST request URL had a trailing slash (`http://localhost:8080/api/tenants/`), which didn’t match the `/api/tenants` endpoint mapping in TenantController.

**Resolution**:

- Verified the URL and removed the trailing slash (`http://localhost:8080/api/tenants`).
- Successfully sent POST requests to add new tenant records.
- Sent a GET request to [http://localhost:8080/api/tenants] to view all records.

**Records Added**:

- Tenant 1: Anjali Patel (ID: 682b397078f66a3fda161d1d, Room: 105, Rent: 9000)
- Tenant 2: Neha Sharma (ID: 682b397078f66a3fda161d1f, Room: 107, Rent: 11000)
- Tenant 3: Rahul Gupta (ID: 682b397078f66a3fda161d20, Room: 108, Rent: 12000)
- Tenant 4: Sonia Mehra (ID: 682b397078f66a3fda161d21, Room: 109, Rent: 13000)

**Screenshots**:

- [POST Failure 404](./screenshots/Day4.2_POST_404_TrailingSlash_Pic1.png)
- [POST Success After Fix](./screenshots/Day4.2_POST_Success_TrailingSlashFix_Pic2.png)
- [GET All Tenants](./screenshots/Day4.2_GET_AllTenants_TrailingSlashFix_Pic3.png)

**Reference**: [Commit Hash]

## Q) Why the Trailing Slash Caused a 404?  

- In Spring Boot, the @RequestMapping("/api/tenants") on TenantController.java maps exactly to /api/tenants.
- A trailing slash (/api/tenants/) is treated as a different path unless Spring Boot is configured to ignore 
  trailing slashes.
- Since /api/tenants/ didn’t match any mapped endpoint, Spring Boot’s static resource handler tried to find a 
  resource at that path, resulting in the "No static resource api/tenants" error.
- Fix in Code (Optional):
  To make your API more flexible, you can configure Spring Boot to ignore trailing slashes by adding this to application.properties :
  
        ```application.Properties

            spring.mvc.pathmatch.trailing-slash=true

        ```
- Alternatively, update TenantController.java to handle both /api/tenants and /api/tenants/:

          ```TenantController.java

               @RestController
              @RequestMapping(value = "/api/tenants", trailingSlashes = TrailingSlashBehavior.NEVER)
              @CrossOrigin(origins = "http://localhost:3000")
              public class TenantController {
                  // ...
              }

          ```
- However, since removing the trailing slash resolved the issue, this change is optional.
