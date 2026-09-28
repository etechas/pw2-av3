package br.com.etechas.exerciciofisicoapp.repository;

import br.com.etechas.exerciciofisicoapp.entity.ExercicioFisico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<ExercicioFisico, Long> {
}
