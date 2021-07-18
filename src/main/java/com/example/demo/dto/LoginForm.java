package com.example.demo.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
//  {
//   "email" :"",
//   "password" : "",
//   "confirmPassword" : "",
//   "dob" : ""
//  }
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class LoginForm {
    int id;
    @NotNull(message = "Email should be valid")
    @Email
    String email;
    @NotNull()
    String password;
    Date dob;

    LoginForm(String email, String password, Date dob){
        this.email = email;
        this.password = password;
        this.dob = dob;
    }

    public com.example.demo.model.LoginForm getLoginFormDTO(com.example.demo.dto.LoginForm dto){
        com.example.demo.model.LoginForm model;
        model = new com.example.demo.model.LoginForm();
        model.setEmail(dto.getEmail());
        model.setPassword(dto.getPassword());
        model.setDob(dto.getDob());
        return model;
    }

}
