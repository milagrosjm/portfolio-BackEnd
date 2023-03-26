package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.backend.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, String>{

    @Query("SELECT u FROM User u WHERE u.username = ?1 and u.password = ?2")
    public User login(String username, String password);

    @Modifying
    @Query("UPDATE User u SET u.about_me=?2 WHERE u.username=?1")
    public void updateAboutMe(String username, String aboutMe);
    
}
