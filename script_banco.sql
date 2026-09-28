Create database script_banco;

create table detalhe_exercicior(
id_exer numeric(5) primary key not null,
nome_exer varchar(25) not null,
musculo_trabalhado varchar(15) not null,
descri varchar(67),
series_recomend numeric(1) not null,
repeticoes_serie numeric(2) not null,
carga_kg numeric(2) not null,
imagem_exer varchar(300),
dificuldade_exer varchar(10) not null);

INSERT INTO detalhe_exercicior 
VALUES (
    30001, 
    'Supino', 
    'Peitoral', 
    'exercicio muito bom', 
    3, 
    15, 
    70, 
    'https://conteudo.imguol.com.br/c/entretenimento/b9/2018/10/11/homem-fazendo-supino-1539278407682_v2_4x3.jpg', 
    'DIFICIL'
);

select * from detalhe_exercicior;


