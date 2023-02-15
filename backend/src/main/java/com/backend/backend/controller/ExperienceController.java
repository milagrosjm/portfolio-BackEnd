package com.backend.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.Experience;
import com.backend.backend.service.ExperienceService;

@RestController
public class ExperienceController {

    @Autowired
    private ExperienceService expservice;


    @GetMapping ("/portfolio/experience/{username}")
    public List<Experience> getExperience(@PathVariable String username){
        return expservice.getExperience(username);
    }
    
}
