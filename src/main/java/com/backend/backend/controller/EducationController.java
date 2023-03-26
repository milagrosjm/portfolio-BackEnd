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

import com.backend.backend.model.Education;
import com.backend.backend.service.EducationService;

@RestController
@RequestMapping("/portfolio/education")
@CrossOrigin(origins = {"http://localhost:4200", "https://frontend-argprog-f91e1.web.app"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class EducationController {

    @Autowired
    private EducationService expservice;

    @GetMapping ("/{username}")
    public List<Education> getEducation(@PathVariable String username){
        return expservice.getEducation(username);
    }

    @GetMapping ("/detail/{id}")
    public Education getEducationDetail(@PathVariable Long id){
        return expservice.getEducationDetail(id);
    }
    
    @PostMapping("/update")
    public void updateEducation(@RequestBody Education ed){
        expservice.updateEducation(ed);
    }

    @DeleteMapping("/delete/{id}")
    public void deteleEducation(@PathVariable Long id){
        expservice.deteleEducation(id);

    }

    
}
