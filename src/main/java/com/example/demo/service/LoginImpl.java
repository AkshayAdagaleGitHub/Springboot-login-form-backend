package com.example.demo.service;

import com.example.demo.dto.LoginForm;
import com.example.demo.repo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginImpl implements LoginService {

    @Autowired
    LoginRepository loginRepository;

    @Override
    public boolean validateLogin(LoginForm loginForm){
          boolean isTrue = basicValidations(loginForm);
          com.example.demo.model.LoginForm loginFormModel = loginForm.getLoginFormDTO(loginForm);
          loginFormModel = loginRepository.save(loginFormModel);
        return isTrue;
    }

    private boolean basicValidations(LoginForm loginForm) {
        LoginForm currentLoginForm = loginForm;
        return true;
    }
}
