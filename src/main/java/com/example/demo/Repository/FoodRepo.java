package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.model;

public interface FoodRepo extends JpaRepository<model, Integer> {





}
