package com.progreso.Progreso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progreso.Progreso.model.Progreso;

@Repository
public interface ProgresoRepository extends JpaRepository<Progreso, Integer> {


}
