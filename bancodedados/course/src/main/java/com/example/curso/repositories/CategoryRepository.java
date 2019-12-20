package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curso.entities.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
