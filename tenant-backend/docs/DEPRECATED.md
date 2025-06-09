
# DEPRECATED.MD file created from Day4 task onwards to place all the deprecated methods in one place.

## D4.1. Configure Spring Security  

Task D4.1.3 : SecurityConfig.java

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

- The striked lines are :
  .httpBasic(), .and(), .csrf(), .cors(), and User.withDefaultPasswordEncoder()

- These are critical components for enabling basic authentication, disabling CSRF, enabling CORS, and
  setting up in-memory user authentication in your TenantTrack project. The striked lines suggest potential issues (e.g., deprecated methods or syntax errors) that could prevent Spring Security from functioning correctly.

**[Issue Analysis :](./tenant-backend/docs/BUGS_AND_RESOLUTIONS.md#day-4--task-13--securityconfigjava--certain-lines-appear-to-be-striked-likely-indicating-they-are-problematic-or-deprecated)**

## Updated SecurityConfig.java

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

**Explanation of Changes**
1.Replaced User.withDefaultPasswordEncoder():

- The deprecated User.withDefaultPasswordEncoder() was replaced with User.builder() and a separate BCryptPasswordEncoder bean for secure password encoding.
- BCryptPasswordEncoder is production-ready and avoids deprecation warnings.

2.Updated .httpBasic():

- Used the newer lambda-based configuration (httpBasic(httpBasic -> ...)) for Spring Security 6.
- Added a BasicAuthenticationEntryPoint to ensure proper handling of unauthorized requests.

3.Explicit CORS Configuration:

- Replaced .cors() with .cors(cors -> cors.configurationSource(corsConfigurationSource())).
- Added a CorsConfigurationSource bean to explicitly allow requests from [http://localhost:3000] (React frontend), supporting all HTTP methods and credentials for Basic Auth.

4.CSRF and Session Management:

- Kept .csrf(csrf -> csrf.disable()) for Postman testing (safe for now, but consider enabling in production).
- Added .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) to make the API stateless, suitable for REST and React integration.

5.Modern Syntax:

- Used lambda-based configuration (e.g., auth ->, csrf ->) for consistency with Spring Security 6.

---
