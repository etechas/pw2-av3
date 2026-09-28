package br.com.etec.projeto.controller;

import br.com.etec.projeto.entity.ExercicioFisico;
import br.com.etec.projeto.entity.NivelDificuldadeEnum;
import br.com.etec.projeto.repository.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class Controller {

    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<ExercicioFisico>> listarTodos() {

        List<ExercicioFisico> exercicios = repository.findAll();

        if (exercicios.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(exercicios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFisico> buscarPorId(@PathVariable Long id) {

        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/dificuldades")
    public ResponseEntity<List<NivelDificuldadeEnum>> listarDificuldades() {

        return ResponseEntity.ok(
                Arrays.asList(NivelDificuldadeEnum.values())
        );
    }
}
