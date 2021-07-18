package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Address {
    String line1;
    String street;
    String pinCode;
    String landMark;
    String city;
    String state;
    String country;



}
