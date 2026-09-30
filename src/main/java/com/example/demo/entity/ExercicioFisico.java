package com.example.demo.entity;

import com.example.demo.enums.NivelDificuldadeEnum;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TLB_EXERCICIO_FISICO")
public class ExercicioFisico {
    @Id
    @Column(name = "ID_EXERCICIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "GRUPO_MUSCULAR")
    private String grupoMuscular;
    @Column(name = "IMAGEM")
    private String imagem;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "NUMERO_SERIES")
    private int numeroSeries;
    @Column(name = "NUMERO_REPETICOES")
    private int numeroRepeticoes;
    @Column(name = "CARGA_SUGERIDA")
    private double cargaSugerida;
    @Column(name = "NIVEL_DIFICULDADE")
    @Enumerated(EnumType.STRING)
    private NivelDificuldadeEnum nivelDificuldade;
}
