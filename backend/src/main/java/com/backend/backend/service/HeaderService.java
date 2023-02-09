package com.backend.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.User;
import com.backend.backend.repository.HeaderRepository;

@Service
public class HeaderService {

    @Autowired
    private HeaderRepository repo;

    public User getUser(String username) {
        return repo.findById(username).orElse(null);
    }
    
}
