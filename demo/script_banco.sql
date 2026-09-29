create database AtiviPW
use AtiviPW
CREATE TABLE exercicio_fisico (
    id                 BIGINT        IDENTITY(1,1) NOT NULL,
    nome               VARCHAR(100)  NOT NULL,
    grupo_muscular     VARCHAR(50)   NOT NULL,
    imagem             VARCHAR(500)  NULL,
    descricao          VARCHAR(1000) NULL,
    numero_series      INT           NOT NULL,
    numero_repeticoes  INT           NOT NULL,
    carga_sugerida     FLOAT         NOT NULL,
    nivel_dificuldade  VARCHAR(10)   NOT NULL,

 );


INSERT INTO dbo.exercicio_fisico
    (nome, grupo_muscular, imagem, descricao, numero_series, numero_repeticoes, carga_sugerida, nivel_dificuldade)
VALUES
    ('Supino',
     'Peitoral',
     'https://s2.glbimg.com/sS0V36C9kJDW6m8Nc7h-dMOjGFs%3D/690x390/s2.glbimg.com/vpHJvv5l9HbLU4dr2tLmIBzDPLU%3D/0x63%3A950x600/690x390/s.glbimg.com/es/ge/f/original/2013/07/16/147486767.jpg',
     'Deitado no banco, segure a barra com as maos um pouco mais afastadas que a largura dos ombros, desca ate a altura do peito e empurre para cima. Trabalha peitoral, ombros e triceps, ajudando no ganho de forca e massa muscular.',
     3,
     15,
     70.0,
     'DIFICIL');

SELECT * FROM exercicio_fisico;
