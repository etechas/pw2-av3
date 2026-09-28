package br.com.etechoracio.exercicios.repository;

import br.com.etechoracio.exercicios.entity.ExercicioFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercicioFisicoRepository
        extends JpaRepository<ExercicioFisico, Long> {

}