create database pw2-av3;

use pw2-av3;

create table TLB_EXERCICIO_FISICO (
	ID_EXERCICIO biginit primary key identity,
	NOME varchar(50),
	GRUPO_MUSCULAR varchar(60) not null,
	IMAGEM varchar(10),
	DESCRICAO varchar(300) not null,
	NUMERO_SERIES int not null,
	NUMERO_REPETICOES int not null,
	CARGA_SUGERIDA float,
	NIVEL_DIFICULDADE varchar(10)
);

insert into TBL_EXERCICIO_FISICO (NOME, GRUPO_MUSCULAR, DESCRICAO, NUMERO_SERIES, NUMERO_REPETICOES, CARGA_SUGERIDA, NIVEL_DIFICULDADE) values ('Supino', 'Peitoral', 'Descrição da técnica e benefícios do exercício', 3, 15, 70.0, 'DIFICIL');