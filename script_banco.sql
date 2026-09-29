CREATE DATABASE ExerciciosDB;
USE ExerciciosDB;

CREATE TABLE exercicio_fisico (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    grupo_muscular VARCHAR(100) NOT NULL,
    imagem VARCHAR(255),
    descricao VARCHAR(500),
    numero_series INT NOT NULL,
    numero_repeticoes INT NOT NULL,
    carga_sugerida DECIMAL(10,2),
    nivel_dificuldade VARCHAR(10) NOT NULL
);

INSERT INTO exercicio_fisico values('Supino', 'Peitoral', 'https://www.tuasaude.com/supino/', 'Exercício para trabalhar principalmente os músculos do peito.', 3, 15, 70.00, 'DIFICIL');
