package com.backend.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name="id_portfolio")
    private Long id_portfolio;
    @Column(name="username")
    private String username;
    @Column(name="is_current")
    private Boolean is_current;
    @Column(name="start_date")
    private String start_date;
    @Column(name="end_date")
    private String end_date;
    @Column(name="description")
    private String description;
    @Column(name="company_name")
    private String company_name;
    
}

