package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.Project;
import com.backend.backend.repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository repo;

    public List<Project> getProject(String username) {
        
        List<Project> res = repo.findByUsernameQuery(username);
        return res;
    }
    
}
