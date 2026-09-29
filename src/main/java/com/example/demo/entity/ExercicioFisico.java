package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "exercicio_fisico")
public class ExercicioFisico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name="grupo_muscular")
    private String grupoMuscular;
    private String imagem;
    private String descricao;
    @Column(name = "numero_series")
    private int numeroSeries;
    @Column(name = "numero_repeticoes")
    private int numeroRepeticoes;
    @Column(name = "carga_sugerida")
    private double cargaSugerida;
    @Enumerated(EnumType.STRING)
    @Column(name = "nivel_dificuldade")
    private NivelDificuldadeEnum nivelDificuldade;
}
