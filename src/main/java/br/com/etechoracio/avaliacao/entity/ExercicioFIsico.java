package br.com.etechoracio.avaliacao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "exerciciofisico")
public class ExercicioFIsico {

    @Id
    @Column(name = "ID_EXERCICIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = " GRUPO_MUSCULAR")
    private String grupoMuscular;

    @Column(name = "IMAGEM")
    private String imagem;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "NUM_SERIES")
    private int numeroSeries;

    @Column(name = "NUM_REPETICOES")
    private int numeroRepeticoes;

    @Column(name = "CARGA_SUG")
    private double cargaSugerida;

    @Enumerated(EnumType.STRING)
    @Column(name = "NIVEL_DIFIC")
    private NivelDificuldadeEnum nivelDificuldade;


}
