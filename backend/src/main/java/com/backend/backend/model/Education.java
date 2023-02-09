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
    private Long id;
    @Column(name="username")
    private String username;
    @Column(name="degree")
    private String degree;
    @Column(name="institution")
    private String institution;
    @Column(name="is_current")
    private Boolean is_current;
    @Column(name="start_date")
    private String start_date;
    @Column(name="end_date")
    private String end_date;

    public Education(){
        
    }
    
}
