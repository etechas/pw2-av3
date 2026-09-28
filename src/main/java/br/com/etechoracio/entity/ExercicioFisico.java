package br.com.etechoracio.entity;

import br.com.etechoracio.Enums.NivelDificuldadeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_exercicio_fisico")
public class ExercicioFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "grupo_muscular")
    private String grupoMuscular;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "num_series")
    private int numeroSeries;

    @Column(name = "num_repeticoes")
    private int numeroRepeticoes;

    @Column(name = "carga_sugerida")
    private double cargaSugerida;

    @Enumerated(EnumType.STRING)
    @Column(name = "nivel_dificuldade")
    private NivelDificuldadeEnum nivelDificuldade;
}
