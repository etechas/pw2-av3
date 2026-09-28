package main.java.br.com.etechoracio.demo.entity;

import br.com.etechoracio.demo.enums.NivelDificuldadeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExercicioFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "grupo_muscular")
    private String grupoMuscular;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "descricao")
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
