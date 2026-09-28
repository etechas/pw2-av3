package br.com.etechoracio.exercicios.entity;

import br.com.etechoracio.exercicios.entity.NivelDificuldadeEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ExercicioFisico")
public class ExercicioFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "grupoMuscular")
    private String grupoMuscular;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "numeroSeries")
    private int numeroSeries;

    @Column(name = "numeroRepeticoes")
    private int numeroRepeticoes;

    @Column(name = "nivelDificuldadeEnum")
    @Enumerated(EnumType.STRING)
    private NivelDificuldadeEnum nivelDificuldade;

    @Column(name = "cargaSugerida")
    private double cargaSugerida;
}