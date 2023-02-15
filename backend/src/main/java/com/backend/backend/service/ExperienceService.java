package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.Experience;
import com.backend.backend.repository.ExperienceRepository;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepository repo;

    public List<Experience> getExperience(String username) {
        
        List<Experience> res = repo.findByUsernameQuery(username);
        System.out.println(res);
        return res;
    }
    
}
