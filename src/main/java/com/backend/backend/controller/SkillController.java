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

import com.backend.backend.model.Skill;
import com.backend.backend.service.SkillService;

@RestController
@RequestMapping("/portfolio/skill")
@CrossOrigin(origins = {"http://localhost:4200", "https://frontend-argprog-f91e1.web.app"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class SkillController {

    @Autowired
    private SkillService service;


    @GetMapping ("/{username}")
    public List<Skill> getSkills(@PathVariable String username){
        return service.getSkills(username);
    }

    @GetMapping ("/detail/{id}")
    public Skill getSkillDetail(@PathVariable Long id){
        return service.getSkillDetail(id);
    }
    
    @PostMapping("/update")
    public void updateSkill(@RequestBody Skill proj){
        service.updateSkill(proj);
    }

    @DeleteMapping("/delete/{id}")
    public void deteleSkill(@PathVariable Long id){
        service.deteleSkill(id);

    }
    
}