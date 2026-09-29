package br.com.etechoracio.avaliacao.controller;


import br.com.etechoracio.avaliacao.entity.ExercicioFIsico;
import br.com.etechoracio.avaliacao.entity.NivelDificuldadeEnum;
import br.com.etechoracio.avaliacao.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class controller {
    @Autowired
    private repository repository;

    @GetMapping
    public List<ExercicioFIsico> listar(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFIsico> buscarId(@PathVariable Long id) {

        var exercicio1 = repository.findById(id);
        if(exercicio1.isPresent()) {
            return ResponseEntity.ok(exercicio1.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{niveis_dificuldade}")
    public ResponseEntity<NivelDificuldadeEnum[]> dificuldades() {
        return ResponseEntity.ok(NivelDificuldadeEnum.values());
    }
}
