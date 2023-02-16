package com.backend.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.User;
import com.backend.backend.service.UserService;

@RestController
//@RequestMapping("/portfolio/user")
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping ("/portfolio/user/{username}")
    public User getHeaderInfo(@PathVariable String username){
        return service.getUser(username);
    }
    
}
