package com.example.demo.repo;


import com.example.demo.model.LoginForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface LoginRepository extends JpaRepository<LoginForm,Integer> {
    LoginForm save(LoginForm loginForm);
}
