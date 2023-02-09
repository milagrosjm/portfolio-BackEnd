package com.backend.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.User;
import com.backend.backend.service.UserService;

@RestController
public class Controller {

    @Autowired
    private UserService service;


    @GetMapping ("/Hi/{name}")
    public String sayHi(@PathVariable String name){
        return "Hola mundo " + name;
    }

    @GetMapping ("/Hello")
    public String sayHello(@RequestParam String name){
        return "Hello World " + name;
    }

    @PostMapping("/new/user")
    public void addUser(@RequestBody User us){
        service.createUser(us);;
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> listUsers(){
        return service.listUsers();
    }

    @DeleteMapping("/delete/{username}")
    public void deteleUser(@PathVariable String username){
        service.deteleUser(username);

    }
    
}
