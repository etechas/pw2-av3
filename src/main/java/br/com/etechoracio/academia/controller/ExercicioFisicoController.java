package br.com.etechoracio.academia.controller;

import br.com.etechoracio.academia.entity.ExercicioFisico;
import br.com.etechoracio.academia.entity.NivelDificuldadeEnum;
import br.com.etechoracio.academia.repository.ExercicioFisicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicios")
@RequiredArgsConstructor
public class ExercicioFisicoController {

    private final ExercicioFisicoRepository repository;

    @GetMapping
    public ResponseEntity<List<ExercicioFisico>> listarTodos() {
        List<ExercicioFisico> lista = repository.findAll();
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFisico> buscarPorId(@PathVariable int id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/niveis")
    public ResponseEntity<NivelDificuldadeEnum[]> listarNiveis() {
        return ResponseEntity.ok(NivelDificuldadeEnum.values());
    }
}

