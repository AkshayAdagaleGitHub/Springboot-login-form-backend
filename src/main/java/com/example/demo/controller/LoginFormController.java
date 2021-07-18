package com.example.demo.controller;

import com.example.demo.dto.LoginForm;
import com.example.demo.service.LoginImpl;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginFormController {

    LoginService loginService;

    @Autowired
    LoginFormController(LoginImpl loginImpl){
        this.loginService = loginImpl;
    }

    @GetMapping("/")
    ResponseEntity HelloWorld() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello World!!");
    }

    @PostMapping("/loginForm")
    ResponseEntity loginForm(@RequestBody LoginForm loginForm) {
        boolean isFalse = loginService.validateLogin(loginForm);
        return ResponseEntity.status(HttpStatus.OK).body(isFalse);
    }

}
