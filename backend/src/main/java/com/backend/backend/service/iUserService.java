package com.backend.backend.service;

import java.util.List;

import com.backend.backend.model.User;

public interface iUserService {
    
    public List<User> listUsers ();
    public void createUser(User us);
    public void deteleUser(String username);
    public User getUser(String username);
}