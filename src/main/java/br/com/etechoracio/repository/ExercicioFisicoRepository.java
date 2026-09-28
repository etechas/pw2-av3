package br.com.etechoracio.repository;

import br.com.etechoracio.entity.ExercicioFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface ExercicioFisicoRepository extends JpaRepository<ExercicioFisico, Long> {
}
