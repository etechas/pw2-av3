package atividadepw.jpa.REPOSITORY;

import atividadepw.jpa.ENTITY.ExercicioFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercicioFisicoRepository extends JpaRepository<ExercicioFisico, Long> {
}