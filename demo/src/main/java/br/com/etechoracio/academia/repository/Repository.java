package br.com.etechoracio.academia.repository;

import br.com.etechoracio.academia.entity.ExercicioFisico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<ExercicioFisico, Long> {
}