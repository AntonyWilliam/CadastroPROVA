create table CADASTRO
(
    nome      VARCHAR,
    matricula INTEGER PRIMARY KEY AUTO_INCREMENT,
    cpf       INTEGER,
    rg        INTEGER,
    endereco  VARCHAR,
    curso     VARCHAR
);


insert into CADASTRO (nome, cpf, rg, endereco, curso)
values ('Antony', 65656, 22121, 'Avenida Rio grande', 'Sistemas Para Internet');