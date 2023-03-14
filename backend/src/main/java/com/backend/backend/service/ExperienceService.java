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
        return res;
    }

    public Experience getExperienceDetail(Long id){
        
        Experience exp = repo.findById(id).orElse(null); ;
        return exp;
    }

    public void updateExperience(Experience exp){
        repo.save(exp);
    }

    public void deteleExperience(Long id) {
        repo.deleteById(id);
    }
    
}
