package br.com.etechoracio.avaliacao.repository;

import br.com.etechoracio.avaliacao.entity.ExercicioFIsico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<ExercicioFIsico, Long>{
}