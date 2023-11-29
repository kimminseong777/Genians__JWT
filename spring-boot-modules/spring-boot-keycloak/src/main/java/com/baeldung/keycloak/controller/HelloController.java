package com.baeldung.keycloak.controller; // Make sure to use the correct package name

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/api/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok().body("{\"message\": \"Hello, World!\"}");
    }
}

