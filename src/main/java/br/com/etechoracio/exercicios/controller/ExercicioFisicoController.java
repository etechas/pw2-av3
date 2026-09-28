package br.com.etechoracio.exercicios.controller;
import br.com.etechoracio.exercicios.entity.NivelDificuldadeEnum;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import br.com.etechoracio.exercicios.entity.ExercicioFisico;
import br.com.etechoracio.exercicios.repository.ExercicioFisicoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class ExercicioFisicoController {

    private final ExercicioFisicoRepository repository;

    public ExercicioFisicoController(ExercicioFisicoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<ExercicioFisico>> listarTodos() {

        List<ExercicioFisico> lista = repository.findAll();

        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(lista);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFisico> buscarPorId(@PathVariable Long id) {

        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/dificuldades")
    public ResponseEntity<NivelDificuldadeEnum[]> listarDificuldades() {
        return ResponseEntity.ok(NivelDificuldadeEnum.values());
    }
}