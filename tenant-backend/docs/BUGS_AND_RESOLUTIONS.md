
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

    ~~~SecurityConfig.java

        import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

        BasicAuthenticationEntryPoint authEntryPoint = new BasicAuthenticationEntryPoint();
        authEntryPoint.setRealmName("TenantTrackRealm");

    ~~~

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
