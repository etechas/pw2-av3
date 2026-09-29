package br.com.etechoracio.academia.controller;

import br.com.etechoracio.academia.entity.ExercicioFisico;
import br.com.etechoracio.academia.entity.NivelDificuldadeEnum;
import br.com.etechoracio.academia.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class Controller {

    @Autowired
    private Repository repository;

    @GetMapping
    public List<ExercicioFisico> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFisico> buscarPorId(@PathVariable Long id) {
        var exercicio1 = repository.findById(id);

        if (exercicio1.isPresent()) {
            return ResponseEntity.ok(exercicio1.get());
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/niveis")
    public List<NivelDificuldadeEnum> listarNiveis() {
        return List.of(NivelDificuldadeEnum.values());
    }
}