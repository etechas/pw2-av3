CREATE DATABASE Exercicio;
USE Exercicio;

Create table ExercicioFisico(
	nome varchar (50),
	grupoMuscular varchar(30),
	imagem varchar (30),
	descricao varchar (30),
	numeroSeries numeric(12),
	numeroRepeticoes numeric(20),
	cargaSugerida float(15),
	NivelDificuldade varchar(20)
);
