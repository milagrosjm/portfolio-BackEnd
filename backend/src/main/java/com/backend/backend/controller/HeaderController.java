package com.backend.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.User;
import com.backend.backend.service.HeaderService;

@RestController
public class HeaderController {

    @Autowired
    private HeaderService service;


    @GetMapping ("/portfolio/user/{username}")
    public User getHeaderInfo(@PathVariable String username){
        return service.getUser(username);
    }
    
}
