package br.com.etechoracio.controller;

import br.com.etechoracio.Enums.NivelDificuldadeEnum;
import br.com.etechoracio.entity.ExercicioFisico;
import br.com.etechoracio.repository.ExercicioFisicoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exercicios")
public class ExercicioFisicoController {
    private final ExercicioFisicoRepository repository;

    public ExercicioFisicoController(ExercicioFisicoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ExercicioFisico> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/id")
    public ResponseEntity<ExercicioFisico> buscarPorId(@PathVariable Long id) {
        Optional<ExercicioFisico> exercicio = repository.findById(id);
        return exercicio.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/niveis-dificuldades")
    public NivelDificuldadeEnum[] listarNiveisDificuldade() {
        return NivelDificuldadeEnum.values();
    }
}
