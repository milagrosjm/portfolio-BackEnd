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
    private Long id;
    @Column(name="photo")
    private String photo;
    @Column(name="link")
    private String link;
    @Column(name="description")
    private String description;
    @Column(name="id_portfolio")
    private String id_portfolio;
    @Column(name="username")
    private String username;
   
}
