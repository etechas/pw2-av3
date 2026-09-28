CREATE DATABASE exercicios_db;


USE exercicios_db;


CREATE TABLE exercicio_fisico (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    grupo_muscular VARCHAR(100) NOT NULL,
    imagem VARCHAR(255),
    descricao VARCHAR(1000),
    numero_series INT NOT NULL,
    numero_repeticoes INT NOT NULL,
    carga_sugerida DECIMAL(10,2) NOT NULL,
    nivel_dificuldade VARCHAR(20) NOT NULL
);

INSERT INTO exercicio_fisico
(
    nome, grupo_muscular, imagem, descricao,
    numero_series,
    numero_repeticoes,
    carga_sugerida,
    nivel_dificuldade
)
VALUES
(
    'Supino',
    'Peitoral',
    'supino.jpg',
    'Exercício para trabalhar principalmente a musculatura do peitoral.',
    3,
    15,
    70.0,
    'DIFICIL'
);
SELECT * FROM exercicio_fisico;
