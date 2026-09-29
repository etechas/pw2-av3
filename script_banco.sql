CREATE TABLE exercicio_fisico (
    id BIGINT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    grupo_muscular VARCHAR(50) NOT NULL,
    imagem VARCHAR(255),
    descricao VARCHAR(MAX),
    numero_series INT NOT NULL,
    numero_repeticoes INT NOT NULL,
    carga_sugerida FLOAT NOT NULL,
    nivel_dificuldade VARCHAR(20) NOT NULL
);

INSERT INTO exercicio_fisico (nome, group_muscular, imagem, descricao, numero_series, numero_repeticoes, carga_sugerida, nivel_dificuldade)
VALUES ('Supino', 'Peitoral', 'supino.png', 'Exercício multiarticular focado no desenvolvimento do peitoral maior, deltoide anterior e tríceps.', 3, 15, 70.0, 'DIFICIL');
