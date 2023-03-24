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
        repo.deleteById(username);
    }

    public User getUser(String username) {
        return repo.findById(username).orElse(null);
    }

    public Boolean getUserLogin(User us){
        User user = repo.login(us.username, us.password);

        return (user != null);
    }

    public void updateAboutMe(User us){
        User existingUser = repo.findById(us.username).orElse(null); 
        existingUser.about_me = us.about_me;
        existingUser.photo = us.photo;
        repo.save(existingUser);
    }

    public void updateHeaderName(User us){
        User existingUser = repo.findById(us.username).orElse(null); 
        existingUser.first_name = us.first_name;
        existingUser.second_name = us.second_name;
        existingUser.lastname = us.lastname;
        repo.save(existingUser);
    }

    public void updateHeaderDegree(User us){
        User existingUser = repo.findById(us.username).orElse(null); 
        existingUser.degree = us.degree;
        repo.save(existingUser);
    }
}
