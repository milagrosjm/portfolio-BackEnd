package com.backend.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="Experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name="id_portfolio")
    public Long id_portfolio;
    //@ManyToOne(targetEntity = User.class)
    //@JoinColumn(name = "username", referencedColumnName = "username")
    @Column(name = "username")
    public String username;
    @Column(name="is_current")
    public Boolean is_current;
    @Column(name="start_date")
    public String start_date;
    @Column(name="end_date")
    public String end_date;
    @Column(name="description")
    public String description;
    @Column(name="company_name")
    public String company_name;
    @Column(name="role")
    public String role;
    
    
    
}

