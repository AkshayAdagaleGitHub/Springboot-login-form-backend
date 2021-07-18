package com.example.demo.service;

import com.example.demo.dto.RegistrationFormDTO;
import com.example.demo.repo.RegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationFormImpl implements RegistrationFormService{

    @Override
    public boolean registerUser(RegistrationFormDTO registrationFromDTO) {
//        basicValidations(); // null regex email password size
//        businessRelatedValidations(); // exits(primarykey) filter
//        processData post fetch validations //
        return false;
    }
}
