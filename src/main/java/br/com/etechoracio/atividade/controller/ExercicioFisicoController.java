package br.com.etechoracio.atividade.controller;

import br.com.etechoracio.atividade.entity.ExercicioFisico;
import br.com.etechoracio.atividade.enums.NivelDificuldadeEnum;
import br.com.etechoracio.atividade.repository.ExercicioFisicoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class ExercicioFisicoController {

    private final ExercicioFisicoRepository repository;

    public ExercicioFisicoController(ExercicioFisicoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<ExercicioFisico>> listar() {
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

    @GetMapping("/niveis")
    public ResponseEntity<List<NivelDificuldadeEnum>> listarNiveis() {
        return ResponseEntity.ok(Arrays.asList(NivelDificuldadeEnum.values()));
    }
}
