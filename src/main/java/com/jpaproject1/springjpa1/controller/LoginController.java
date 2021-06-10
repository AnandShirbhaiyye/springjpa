package com.jpaproject1.springjpa1.controller;

import com.jpaproject1.springjpa1.Repository.LoginRepository;
import com.jpaproject1.springjpa1.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @PostMapping("/saveLogin")
    public String saveLogin(@RequestBody Login login){
        loginRepository.save(login);
        return "login saved";
    }
}
