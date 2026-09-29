create database ExercicioFisico;

create table exercicio(
	id numeric(1) primary key,
	nome varchar(20),
	grupoMuscular varchar(30),
	imagem varchar(300),
	descricao varchar(300),
	numeroSeries numeric(2),
	numeroRepeticoes numeric(2),
	cargaSugerida numeric(6,2),
	nivelDificuldade varchar(30)
);

insert into exercicio values(1,'Supino','Peitoral','Imagem ilustrativa da execução do movimento','O supino reto é um exercício clássico de musculação feito deitado em um banco plano, focado no desenvolvimento dos músculos do peito, dos tríceps e dos ombros.',3,15,70.00,'Dificil');