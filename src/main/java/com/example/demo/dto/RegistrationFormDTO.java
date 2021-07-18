package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class RegistrationFormDTO {

    String firstName;
    String lastName;
    String phoneNumber;
    String gender;
    String telephoneNumber;
    Address address;

}
