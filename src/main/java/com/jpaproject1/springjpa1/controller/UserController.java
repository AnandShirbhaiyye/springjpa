package com.jpaproject1.springjpa1.controller;

import com.jpaproject1.springjpa1.Repository.UserRepository;
import com.jpaproject1.springjpa1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user){
        userRepository.save(user);
        return "user saved";
    }

}
