package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// Repository interface for SoftwareEngineer entity
public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {
    // ✅ You don’t need to write any code here for basic CRUD.
    // Spring Data JPA provides methods like:
    //   findAll(), findById(id), save(entity), deleteById(id)

    // If you want custom finders, you can just add them:
    // Example:
    // List<SoftwareEngineer> findByName(String name);
}
