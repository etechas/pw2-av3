package com.example.pw2av3.controller;

import com.example.pw2av3.entity.ExercicioFisico;
import com.example.pw2av3.entity.NivelDificuldadeEnum;
import com.example.pw2av3.repository.ExercicioFisicoRepository;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicios")
public class ExercicioFisicoController {

    private final ExercicioFisicoRepository repository;

    // Injecao de dependencia via construtor
    public ExercicioFisicoController(ExercicioFisicoRepository repository) {
        this.repository = repository;
    }

    // Listar todos os exercicios: 200 (com dados) ou 204 (lista vazia)
    @GetMapping
    public ResponseEntity<List<ExercicioFisico>> listarTodos() {
        List<ExercicioFisico> exercicios = repository.findAll();
        if (exercicios.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(exercicios);
    }

    // Buscar exercicio por ID: 200 (encontrado) ou 404 (nao encontrado)
    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFisico> buscarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Listar os niveis de dificuldade disponiveis: 200
    @GetMapping("/niveis-dificuldade")
    public ResponseEntity<List<NivelDificuldadeEnum>> listarNiveisDificuldade() {
        return ResponseEntity.ok(List.of(NivelDificuldadeEnum.values()));
    }
}
