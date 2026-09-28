package br.com.etec.projeto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "exercicios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExercicioFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String nome;

    @Column(name = "grupo_muscular")
    private String grupoMuscular;

    @Column(length = 500)
    private String imagem;

    @Column(columnDefinition = "VARCHAR(MAX)")
    private String descricao;

    @Column
    private Integer series;

    @Column
    private Integer repeticoes;

    @Column(name = "carga_sugerida")
    private Double cargaSugerida;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private NivelDificuldadeEnum dificuldade;

    @Column
    private String orientacoes;
}
