CREATE DATABASE ExPW2;
USE ExPW2;


CREATE TABLE exercicio_fisico(
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    grupo_muscular VARCHAR(50) NOT NULL,
    imagem VARCHAR(255),
    descricao VARCHAR(255),
    numero_series INT NOT NULL,
    numero_repeticoes INT NOT NULL,
    carga_sugerida FLOAT NOT NULL,
    nivel_dificuldade VARCHAR(20) NOT NULL
);


INSERT INTO exercicio_fisico (
    nome, grupo_muscular, imagem, descricao, 
    numero_series, numero_repeticoes, carga_sugerida, nivel_dificuldade
) VALUES (
    'Supino', 
    'Peitoral', 
    'https://grandeatleta.com.br/blog/wp-content/uploads/2018/09/supino.jpg', 
    'Exercício para peitoral e tríceps com barra e banco plano.', 
    3, 
    15, 
    70.0, 
    'DIFICIL'
);

SELECT * FROM exercicio_fisico;