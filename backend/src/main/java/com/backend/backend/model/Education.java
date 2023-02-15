package com.backend.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name="username")
    public String username;
    @Column(name="degree")
    public String degree;
    @Column(name="institution")
    public String institution;
    @Column(name="is_current")
    public Boolean is_current;
    @Column(name="start_date")
    public String start_date;
    @Column(name="end_date")
    public String end_date;

    public Education(){
        
    }
    
}
