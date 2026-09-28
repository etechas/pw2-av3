CREATE DATABASE academia;

USE academia;

CREATE TABLE exercicios (
    id BIGINT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    grupo_muscular VARCHAR(100) NOT NULL,
    imagem VARCHAR(500),
    descricao VARCHAR(MAX),
    series INT NOT NULL,
    repeticoes INT NOT NULL,
    carga_sugerida DECIMAL(10,2) NOT NULL,
    dificuldade VARCHAR(10) NOT NULL,
    orientacoes VARCHAR(MAX)
);

INSERT INTO exercicios (
    nome,
    grupo_muscular,
    imagem,
    descricao,
    series,
    repeticoes,
    carga_sugerida,
    dificuldade,
    orientacoes
)
VALUES (
    'Supino',
    'Peitoral',
    'supino.jpg',
    'Exercicio realizado com o objetivo de trabalhar principalmente a musculatura do peitoral, alem de envolver triceps e ombros.',
    3,
    15,
    70.00,
    'DIFICIL',
    'Mantenha os pes apoiados no chao, controle o movimento durante a execucao e mantenha a postura adequada. Utilize uma carga compativel com seu nivel de treinamento.'
);
