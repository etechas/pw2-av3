package br.com.etechoracio.demo.repository;

import main.java.br.com.etechoracio.demo.entity.ExercicioFisico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<ExercicioFisico, Integer> {
}
