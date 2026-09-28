package Controller;

import br.com.etec.exercicioFisico.ExercicioFisico;

import java.util.List;

public class ExercicioFisicoController {

    @GetMapping
    public List<ExercicioFisico> listar(){
        if
        return exercicioFisicoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExercicioFisico> buscarPorId(@PathVariable Long id){
        var exercicioFisico1 = exercicioFisicoRepository.findById(id);
        if(exercicioFisico1.isPresent()) {
            return ResponseEntity.ok(exercicioFisico11.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ExercicioFisico cadastrar(@RequestBody ExercicioFisico exercicioFisico){
        exercicioFisico.setId(100L);
        return exercicioFisico;
    }


}
















}
