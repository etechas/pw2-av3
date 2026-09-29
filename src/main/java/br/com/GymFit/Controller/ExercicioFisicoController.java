package br.com.GymFit.Controller;


import br.com.GymFit.Entity.ExercicioFisico;
import br.com.GymFit.Enums.NivelDificuldadeEnum;
import br.com.GymFit.Repository.ExercicioFisicoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Exercicio")
public class ExercicioFisicoController {
    private ExercicioFisicoRepository exercicioFisicoRepository;

    @GetMapping
    public List<ExercicioFisico> listar(){
        return exercicioFisicoRepository.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFisico> buscarId(@PathVariable Long id){
        var exercicio1 = exercicioFisicoRepository.findById(id);
        if (exercicio1.isPresent()) {
            return ResponseEntity.ok(exercicio1.get());
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/Dificuldades")
    public List<NivelDificuldadeEnum> listarDificuldades(){
        return List.of(NivelDificuldadeEnum.Medio, NivelDificuldadeEnum.Dificil, NivelDificuldadeEnum.Facil);

    }


}
