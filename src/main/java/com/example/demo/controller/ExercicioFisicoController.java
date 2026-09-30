package com.example.demo.controller;

import com.example.demo.entity.ExercicioFisico;
import com.example.demo.repository.ExercicioFisicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class ExercicioFisicoController {
    @Autowired
    private ExercicioFisicoRepository exercicioFisicoRepository;

    @GetMapping
    public List<ExercicioFisico> listar(){
        return exercicioFisicoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFisico> buscarPorId(@PathVariable Long id){
        var exercicio1 = exercicioFisicoRepository.findById(id);
        if(exercicio1.isPresent()) {
            return ResponseEntity.ok(exercicio1.get());
        }
        return ResponseEntity.notFound().build();
    }


}
