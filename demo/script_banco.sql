CREATE DATABASE Academia;

USE Academia;

CREATE TABLE exercicio (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    grupo_muscular VARCHAR(50) NOT NULL,
    imagem VARCHAR(100),
    descricao VARCHAR(255),
    numero_series INT NOT NULL,
    numero_repeticoes INT NOT NULL,
    carga_sugerida FLOAT NOT NULL,
    nivel_dificuldade VARCHAR(10) NOT NULL
    CHECK (nivel_dificuldade IN ('FACIL', 'MEDIO', 'DIFICIL'))
);

INSERT INTO exercicio
(nome, grupo_muscular, imagem, descricao, numero_series, numero_repeticoes, carga_sugerida, nivel_dificuldade)
VALUES
('Supino', 'Peitoral', 'supino.jpg', 'Exercicio para trabalhar o peitoral.', 3, 15, 70.0, 'DIFICIL');