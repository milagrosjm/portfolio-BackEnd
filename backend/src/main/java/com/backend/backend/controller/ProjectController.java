package com.backend.backend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.service.ProjectService;
import com.backend.backend.model.Project;
@RestController
@RequestMapping("/portfolio/project")
@CrossOrigin(origins = {"http://localhost:4200"}, methods = {RequestMethod.GET, RequestMethod.POST})
public class ProjectController {

    @Autowired
    private ProjectService service;

    @GetMapping ("/{username}")
    public List<Project> getProject(@PathVariable String username){
        return service.getProject(username);
    }
    
}
