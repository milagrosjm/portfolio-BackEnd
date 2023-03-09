package com.backend.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.Education;
import com.backend.backend.service.EducationService;

@RestController
@RequestMapping("/portfolio/education")
@CrossOrigin(origins = {"http://localhost:4200"}, methods = {RequestMethod.GET, RequestMethod.POST})
public class EducationController {

    @Autowired
    private EducationService expservice;

    @GetMapping ("/{username}")
    public List<Education> getEducation(@PathVariable String username){
        return expservice.getEducation(username);
    }

    
}
