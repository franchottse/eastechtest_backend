package com.example.eastechtest.controller;

import com.example.eastechtest.model.User;
import com.example.eastechtest.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
public class FormController {

    @Autowired
    FormService formService;

    @GetMapping("/test")
    public String test() {
        String testMsg = "This is a test message";
        return testMsg;
    }

    @PostMapping("/users")
    public ResponseEntity<Void> addUser(@RequestBody User user) {
        HttpHeaders headers = new HttpHeaders();
        formService.saveUser(user);
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") Long id) {
        User user = formService.findUserById(id);
        return formService.findUserById(id);
    }
}
