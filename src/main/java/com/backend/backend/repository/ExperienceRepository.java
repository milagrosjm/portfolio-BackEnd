package com.backend.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.backend.model.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository <Experience, Long> {

    @Query("SELECT exp FROM Experience exp WHERE exp.username LIKE %?1%")
    public List<Experience> findByUsernameQuery(String username);
    
    
}
