package com.klu.mental_health_support_platform.entity;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JournalEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToAny
    private User user;  // User who created the entry
    
    private String content;  // Journal text
    private LocalDate date;  // Date of entry
}

