package Controller;

import Class.ExercicoFisico;
import Enums.NivelDificuldadeEnum;
import Repository.ExercicioFisicoRepository;
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
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/nivels-dificuldade")
    public NivelDificuldadeEnum[] listarNiveisDificuldade() {
        return NivelDificuldadeEnum.values();
    }
}