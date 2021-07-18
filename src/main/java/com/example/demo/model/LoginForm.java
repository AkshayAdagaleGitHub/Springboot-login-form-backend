package com.example.demo.model;

import lombok.*;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class LoginForm {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    @Id
    @Email
    String email;
    String password;
    Date dob;

    LoginForm(String email, String password, Date dob){
        this.email = email;
        this.password = password;
        this.dob = dob;
    }

}
