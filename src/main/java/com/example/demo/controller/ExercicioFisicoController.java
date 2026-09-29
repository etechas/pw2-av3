package com.example.demo.controller;
import com.example.demo.entity.ExercicioFisico;
import com.example.demo.entity.NivelDificuldadeEnum;
import com.example.demo.repository.ExercicioFisicoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/exercicios")
public class ExercicioFisicoController {
    private final ExercicioFisicoRepository repo;
    public ExercicioFisicoController(ExercicioFisicoRepository exercicioFisicoRepository) {
        this.repo = exercicioFisicoRepository;
    }
    @GetMapping
    public ResponseEntity<List<ExercicioFisico>> listarTodos() {
        List<ExercicioFisico> lista = repo.findAll();
        if (lista.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.ok(lista);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFisico> buscarPorId(@PathVariable Long id) {
        Optional<ExercicioFisico> ex = repo.findById(id);
        if (ex.isPresent()) {
            return ResponseEntity.ok(ex.get());
        } else {
            return ResponseEntity.status(404).build();
        }
    }
    @GetMapping("/dificuldades")
    public ResponseEntity<NivelDificuldadeEnum[]> listarDificuldades() {
        NivelDificuldadeEnum[] enums = NivelDificuldadeEnum.values();
        return ResponseEntity.ok(enums);
    }
}