package atividadepw.jpa.ENTITY;

import atividadepw.jpa.ENUM.NivelDificuldadeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "exercicio_fisico")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExercicioFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String grupoMuscular;
    private String imagem;
    private String descricao;
    private int numeroSeries;
    private int numeroRepeticoes;
    private double cargaSugerida;

    @Enumerated(EnumType.STRING)
    private NivelDificuldadeEnum nivelDificuldade;
}