package br.com.etechas.exerciciofisicoapp.entity;

import br.com.etechas.exerciciofisicoapp.enums.NivelDificuldadeEnum;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class ExercicioFisico {
    @Id
    @Column(name = "ID_FILME")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_exer")
    private String nome;
    @Column(name = "musculo_trabalhado")
    private String grupoMuscular;
    @Column(name = "imagem_exer")
    private String imagem;
    @Column(name = "descri")
    private  String descricao;
    @Column(name = "series_recomend")
    private int numeroSeries;
    @Column(name = "repeticoes_serie")
    private int numeroRepeticoes;
    @Column(name = "carga_kg")
    private double cargaSugerida;
    @Enumerated(EnumType.STRING)
    @Column(name = "dificuldade_exer")
    private NivelDificuldadeEnum nivelDificuldade;

}
