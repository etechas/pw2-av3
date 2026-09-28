CREATE DATABASE Exercicio;
USE Exercicio;

Create table ExercicioFisico(
	nome varchar (50) primary key,
	grupoMuscular varchar(30) not null,
	imagem varchar (30),
	descricao varchar (30),
	numeroSeries numeric(12),
	numeroRepeticoes numeric(20),
	cargaSugerida float(15),
	NivelDificuldade varchar(20) not null
);

insert into ExercicioFisico values('Supino', 'Peitoral', 'Imagem ilustrativa',
'Descrição técnica e benefícios', 3, 15, 70.1, 'Dificil');
