package com.backend.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="User")
public class User {

    @Id
    @JsonProperty
    @Column(name="username")
    private String username;
    @JsonProperty
    @Column(name="lastname")
    private String lastname;
    @JsonProperty
    @Column(name="first_name")
    private String first_name;
    @JsonProperty
    @Column(name="second_name")
    private String second_name;
    @JsonProperty
    @Column(name="password")
    private String password;
    @JsonProperty
    @Column(name="about_me")
    private String about_me;
    @JsonProperty
    @Column(name="degree")
    private String degree;


    public User(){

    }

    public User(Long id, String username,  String first_name, String lastname) {
        super();
        this.username = username;
        this.first_name = first_name;
        this.lastname = lastname;}
    
}
