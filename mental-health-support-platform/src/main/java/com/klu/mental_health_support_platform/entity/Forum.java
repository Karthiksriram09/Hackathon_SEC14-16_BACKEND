package com.klu.mental_health_support_platform.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;  // Forum topic
    
    @OneToMany(mappedBy = "forum")
    private List<Post> posts;  // Posts in the forum
}
