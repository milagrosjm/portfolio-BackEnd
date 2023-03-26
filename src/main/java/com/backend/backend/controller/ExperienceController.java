package com.backend.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.Experience;
import com.backend.backend.service.ExperienceService;

@RestController
@RequestMapping("/portfolio/experience")
@CrossOrigin(origins = {"http://localhost:4200", "https://frontend-argprog-f91e1.web.app"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class ExperienceController {

    @Autowired
    private ExperienceService expservice;


    @GetMapping ("/{username}")
    public List<Experience> getExperience(@PathVariable String username){
        return expservice.getExperience(username);
    }

    @GetMapping ("/detail/{id}")
    public Experience getExperienceDetail(@PathVariable Long id){
        return expservice.getExperienceDetail(id);
    }
    
    @PostMapping("/update")
    public void updateExperience(@RequestBody Experience exp){
        expservice.updateExperience(exp);
    }

    @DeleteMapping("/delete/{id}")
    public void deteleExperience(@PathVariable Long id){
        expservice.deteleExperience(id);

    }
}
