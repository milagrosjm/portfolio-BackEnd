package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.Skill;
import com.backend.backend.repository.SkillRepository;

@Service
public class SkillService {
    
    @Autowired
    private SkillRepository repo;

    public List<Skill> getSkills(String username) {
        
        return repo.findByUsernameQuery(username);
    }

    public Skill getSkillDetail(Long id){
        
        return repo.findById(id).orElse(null); 
    }

    public void updateSkill(Skill proj){
        repo.save(proj);
    }

    public void deteleSkill(Long id) {
        repo.deleteById(id);
    }
}
