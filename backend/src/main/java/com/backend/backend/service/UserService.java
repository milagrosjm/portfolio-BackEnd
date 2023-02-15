package com.backend.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.model.User;
import com.backend.backend.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> listUsers() {
        return repo.findAll();
    }

    public void createUser(User us) {
        repo.save(us);
    }

    public void deteleUser(String username) {
        repo.deleteById(username);;
    }

    public User getUser(String username) {
        return repo.findById(username).orElse(null);
    }
    
}
