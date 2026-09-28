package br.com.etechoracio.demo.controller;

import br.com.etechoracio.demo.enums.NivelDificuldadeEnum;
import br.com.etechoracio.demo.repository.Repository;
import main.java.br.com.etechoracio.demo.entity.ExercicioFisico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<ExercicioFisico> buscarPorId(@PathVariable Integer id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/niveis")
    public ResponseEntity<NivelDificuldadeEnum[]> listarNiveis() {
        return ResponseEntity.ok(NivelDificuldadeEnum.values());
    }
}
