package br.com.etec.projeto.repository;

import br.com.etec.projeto.entity.ExercicioFisico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository
        extends JpaRepository<ExercicioFisico, Long> {
}
