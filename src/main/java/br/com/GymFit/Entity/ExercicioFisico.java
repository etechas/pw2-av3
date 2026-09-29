package br.com.GymFit.Entity;

import br.com.GymFit.Enums.NivelDificuldadeEnum;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="exercicio_filme")
public class ExercicioFisico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_exercicio")
    private long id;


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
