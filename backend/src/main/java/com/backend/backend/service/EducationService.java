package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.Education;
import com.backend.backend.repository.EducationRepository;

@Service
public class EducationService {

    @Autowired
    private EducationRepository repo;

    public List<Education> getEducation(String username) {
        
        List<Education> res = repo.findByUsernameQuery(username);
        return res;
    }
    
}
