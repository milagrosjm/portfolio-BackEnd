package com.backend.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.model.Skill;
import com.backend.backend.service.SkillService;

@RestController
@RequestMapping("/portfolio/skill")
@CrossOrigin(origins = {"http://localhost:4200"}, methods = {RequestMethod.GET, RequestMethod.POST})
public class SkillController {

    @Autowired
    private SkillService expservice;


    @GetMapping ("/{username}")
    public List<Skill> getSkills(@PathVariable String username){
        return expservice.getSkills(username);
    }
    
}