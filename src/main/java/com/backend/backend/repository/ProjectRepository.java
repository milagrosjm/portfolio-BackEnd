package com.backend.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.backend.model.Project;

public interface ProjectRepository extends JpaRepository <Project, Long>{

    @Query("SELECT pr FROM Project pr WHERE pr.username LIKE %?1%")
    public List<Project> findByUsernameQuery(String username);
    
}
