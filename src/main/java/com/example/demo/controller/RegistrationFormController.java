package com.example.demo.controller;

import com.example.demo.dto.RegistrationFormDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class RegistrationFormController {

    @PostMapping("/registration_form")
    ResponseEntity registrationForm(@RequestBody RegistrationFormDTO registrationFormDTO){
        return ResponseEntity.status(HttpStatus.OK).body("True");

    }
}
