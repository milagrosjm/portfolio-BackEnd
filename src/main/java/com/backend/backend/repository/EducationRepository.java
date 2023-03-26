package com.backend.backend.repository;

import org.springframework.stereotype.Repository;

import com.backend.backend.model.Education;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface EducationRepository extends JpaRepository <Education, Long> {

    @Query("SELECT ed FROM Education ed WHERE ed.username LIKE %?1%")
    public List<Education> findByUsernameQuery(String username);
    
}
