package com.example.pw2av3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "exercicio_fisico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExercicioFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "grupo_muscular", nullable = false, length = 50)
    private String grupoMuscular;

    @Column(name = "imagem", length = 500)
    private String imagem;

    @Column(name = "descricao", length = 1000)
    private String descricao;

    @Column(name = "numero_series", nullable = false)
    private int numeroSeries;

    @Column(name = "numero_repeticoes", nullable = false)
    private int numeroRepeticoes;

    @Column(name = "carga_sugerida", nullable = false)
    private double cargaSugerida;

    @Enumerated(EnumType.STRING)
    @Column(name = "nivel_dificuldade", nullable = false, length = 10)
    private NivelDificuldadeEnum nivelDificuldade;
}
