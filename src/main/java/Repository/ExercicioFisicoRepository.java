package Repository;
import Class.ExercicoFisico
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercicioFisicoRepository extends JpaRepository<ExercicioFisico, Long> {
}