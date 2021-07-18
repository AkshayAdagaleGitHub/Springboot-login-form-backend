package com.example.demo.repo;

import com.example.demo.dto.RegistrationFormDTO;
import com.example.demo.model.RegistrationForm;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationFormDTO,String> {

    boolean exists(RegistrationFormDTO registrationFormDTO);

    RegistrationForm save(RegistrationFormDTO registrationFormDTO);
}
