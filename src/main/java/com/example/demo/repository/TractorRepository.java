package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Tractor;

public interface TractorRepository extends JpaRepository<Tractor, Long> {

}
