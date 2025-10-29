package com.academia.coders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.coders.entity.CoderEntity;


public interface CoderRepository extends JpaRepository<CoderEntity, Long>{
    boolean existsByNombreIgnoreCase(String nombre);
}
