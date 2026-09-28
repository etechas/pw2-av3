use SQL123;

create table ExercicioFisico(
id bigint identity primary key,
nome varchar(100) not null,
grupoMuscular varchar(50) not null,
imagem varchar(100) not null,
descricao text not null,
numeroSeries int not null,
numeroRepeticoes int not null,
cargaSugerida float not null,
nivelDificuldadeEnum varchar(7) not null
);

insert into ExercicioFisico values
('Supino', 'Peitoral', 'supino.jpg', 'Deite-se no banco, alinhe a barra na linha dos olhos, segure-a com as mãos
um pouco além da largura dos ombros, desça o peso controladamente até tocar levemente o meio do peito e empurre-o
para cima estendendo os braços.',3,15,67.42,'DIFICIL');