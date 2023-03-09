package com.backend.backend.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="User")
public class User {

    @Id
    @JsonProperty
    @Column(name="username")
    public String username;
    @JsonProperty
    @Column(name="lastname")
    public String lastname;
    @JsonProperty
    @Column(name="first_name")
    public String first_name;
    @JsonProperty
    @Column(name="second_name")
    public String second_name;
    @JsonProperty
    @Column(name="password")
    public String password;
    @JsonProperty
    @Column(name="about_me")
    public String about_me;
    @JsonProperty
    @Column(name="degree")
    public String degree;
    @JsonProperty
    @Column(name="photo")
    public String photo;
    //@OneToMany(targetEntity = Experience.class, cascade = CascadeType.ALL, orphanRemoval = true)
    //@JoinColumn(name = "username", referencedColumnName = "username")
    //private List<Experience> experiences;


    public User(){

    }

    public User(Long id, String username,  String first_name, String lastname) {
        super();
        this.username = username;
        this.first_name = first_name;
        this.lastname = lastname;}

    public void setAboutMe(String about_me){
        this.about_me = about_me; 
    }

    
}
