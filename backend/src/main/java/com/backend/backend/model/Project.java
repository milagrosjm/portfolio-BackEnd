package com.backend.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name="photo")
    public String photo;
    @Column(name="link_deploy")
    public String link_deploy;
    @Column(name="link_github")
    public String link_github;
    @Column(name="tittle")
    public String tittle;
    @Column(name="description")
    public String description;
    @Column(name="id_portfolio")
    public String id_portfolio;
    @Column(name="username")
    public String username;
   
}
