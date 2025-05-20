
# **(+ Error log with screenshots)**

---

## Day 2: Docker Setup

### Issue 1: Missing `docker-desktop-data` in WSL

**Cause**: Corrupted Docker WSL distribution. 

**Resolution**:  

1. Reinstalled Docker Desktop.  
2. Moved disk image to `D:\DockerData\DockerDesktopWSL`.  
3. Verified with `wsl --list --verbose`.  
  
  ---
  ---

## Day 3: Spring Security 401 Error

### Issue 2: Unauthorized API Access

**Symptom :**  

    ```json
        HTTP 401 - "Unauthorized" in Postman
    ```
**Cause :** Spring Security auto-enabled blocking APIs.

**Resolution :**
 -Temporarily disabled via @SpringBootApplication(exclude = {SecurityAutoConfiguration.class}).

 -Later added proper auth (Basic/JWT).

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
---
---
