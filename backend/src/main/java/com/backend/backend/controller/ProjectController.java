package com.backend.backend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.service.ProjectService;
import com.backend.backend.model.Project;
@RestController
//@RequestMapping("/portfolio/project")
public class ProjectController {

    @Autowired
    private ProjectService service;

    @GetMapping ("/portfolio/project/{username}")
    public List<Project> getProject(@PathVariable String username){
        return service.getProject(username);
    }
    
}
