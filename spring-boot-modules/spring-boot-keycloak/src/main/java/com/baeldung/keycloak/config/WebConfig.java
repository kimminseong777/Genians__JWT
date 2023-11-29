// package com.baeldung.keycloak;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;

// @Configuration
// @EnableWebSecurity
// public class WebConfig extends WebSecurityConfigurerAdapter {

//     @Override
//     public void addCorsMappings(CorsRegistry registry) {
//         registry.addMapping("/**")
//             .allowedOrigins("http://localhost:3000")  // Add your frontend URL here
//             .allowedMethods("GET", "POST", "PUT", "DELETE")
//             .allowedHeaders("*")
//             .exposedHeaders("Authorization")
//             .allowCredentials(true)
//             .maxAge(3600);
//     }

//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http.authorizeHttpRequests()
//             .antMatchers("/login", "/api/hello").permitAll() // Allow these endpoints without authentication
//             .anyRequest().authenticated(); // Require authentication for any other request
//     }
// }
