package com.backend.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.backend.model.Skill;

@Repository
public interface SkillRepository  extends JpaRepository <Skill, Long>{

    @Query("SELECT s FROM Skill s WHERE s.username LIKE %?1%")
    public List<Skill> findByUsernameQuery(String username);
    
}
