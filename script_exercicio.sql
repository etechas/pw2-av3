CREATE DATABASE script_banco

USE script_banco;

CREATE TABLE exercicio_fisico (
    id INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    grupo_muscular VARCHAR(50) NOT NULL,
    imagem VARCHAR(255),
    descricao VARCHAR(500),
    numero_series INT NOT NULL,
    numero_repeticoes INT NOT NULL,
    carga_sugerida FLOAT NOT NULL,
    nivel_dificuldade VARCHAR(20) NOT NULL
);

INSERT INTO exercicio_fisico (nome, grupo_muscular, imagem, descricao, numero_series, numero_repeticoes, carga_sugerida, nivel_dificuldade)
VALUES ('Supino', 'Peitoral', 'supino.png', 'Exercício para desenvolvimento do peitoral maior e tríceps.', 4, 12, 40.0, 'MEDIO');