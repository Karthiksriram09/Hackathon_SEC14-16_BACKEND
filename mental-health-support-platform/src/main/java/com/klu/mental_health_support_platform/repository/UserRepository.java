package com.klu.mental_health_support_platform.repository;

import java.lang.foreign.Linker.Option;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Option<User> findByUsername(String username);
}

