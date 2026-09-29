package br.com.etechoracio.academia.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "exercicio_fisico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExercicioFisico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "grupo_muscular")
    private String grupoMuscular;


    private String imagem;

    @Column(name = "descricaoo")
    private  String descricao;

    @Column(name = "numero_series")
    private int numeroSeries;

    @Column(name = "repeticoes_serie")
    private int numeroRepeticoes;

    @Column(name = "carga_sugerida")
    private double cargaSugerida;

    @Enumerated(EnumType.STRING)
    @Column(name = "dificuldade")
    private NivelDificuldadeEnum nivelDificuldade;
}