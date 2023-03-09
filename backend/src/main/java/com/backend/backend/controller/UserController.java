package com.backend.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.User;
import com.backend.backend.service.UserService;

@RestController
@RequestMapping("/portfolio/user")
@CrossOrigin(origins = {"http://localhost:4200"}, methods = {RequestMethod.GET, RequestMethod.POST})
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping ("/{username}")
    public User getHeaderInfo(@PathVariable String username){
        return service.getUser(username);
    }

    @PostMapping("/login")
    public Boolean getUserLogin(@RequestBody User user){
        return service.getUserLogin(user);
    }

    @PostMapping("/update/aboutMe")
    public void updateAboutMe(@RequestBody User user){
        service.updateAboutMe(user);
    }

    @PostMapping("/update/headerName")
    public void updateHeaderName(@RequestBody User user){
        service.updateHeaderName(user);
    }

    @PostMapping("/update/headerDegree")
    public void updateHeaderDegree(@RequestBody User user){
        service.updateHeaderDegree(user);
    }
    
}
