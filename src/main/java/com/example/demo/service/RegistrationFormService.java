package com.example.demo.service;

import com.example.demo.dto.RegistrationFormDTO;
import com.example.demo.repo.RegistrationRepository;
import org.springframework.stereotype.Service;

public interface RegistrationFormService {

    boolean registerUser(RegistrationFormDTO registrationFromDTO);

}
