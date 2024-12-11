package com.klu.mental_health_support_platform.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;
    private String role;  // Roles: ADMIN, STUDENT
    
    // Getters and Setters
}
