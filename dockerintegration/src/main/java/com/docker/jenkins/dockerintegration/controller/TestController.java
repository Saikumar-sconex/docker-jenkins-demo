package com.docker.jenkins.dockerintegration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class TestController {

    @GetMapping
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Hello Satish How are you..");
    }
}
