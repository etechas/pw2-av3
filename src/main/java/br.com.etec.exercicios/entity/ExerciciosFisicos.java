package br.com.etec.exercicios.entity;

import br.com.etec.exercicios.enums.NivelDificuldadeEnum;
import lombok.*;

public class ExercicioFisico{
    private String nome;
    private String grupoMuscular;
    private String imagem
    private String descricao
    private int numeroSeries
    private int numeroRepeticoes
    private double cargaSugerida
    private NivelDificuldadeEnum nivelDificuldade
}