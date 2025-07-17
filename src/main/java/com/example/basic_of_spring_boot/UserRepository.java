package com.example.basic_of_spring_boot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Role, Long> {
    // Additional query methods can be defined here if needed
}
