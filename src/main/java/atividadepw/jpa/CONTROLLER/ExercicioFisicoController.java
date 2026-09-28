package atividadepw.jpa.CONTROLLER;

import atividadepw.jpa.ENTITY.ExercicioFisico;
import atividadepw.jpa.ENUM.NivelDificuldadeEnum;
import atividadepw.jpa.REPOSITORY.ExercicioFisicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class ExercicioFisicoController {

    @Autowired
    private ExercicioFisicoRepository repository;

    @GetMapping
    public List<ExercicioFisico> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFisico> buscarPorId(@PathVariable Long id) {
    var exercicio = repository.findById(id);

        if (exercicio.isPresent()) {
            return ResponseEntity.ok(exercicio.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/niveis-dificuldade")
    public NivelDificuldadeEnum[] listarNiveisDificuldade() {
        return NivelDificuldadeEnum.values();
    }
}