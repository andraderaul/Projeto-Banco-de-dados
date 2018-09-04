CREATE SCHEMA lemovie;

CREATE SEQUENCE lemovie.seq_idAmizade INCREMENT 1 START 1;
CREATE SEQUENCE lemovie.seq_idMidia INCREMENT 1 START 1;
CREATE SEQUENCE lemovie.seq_idComentario INCREMENT 1 START 1;
CREATE SEQUENCE lemovie.seq_idResposta INCREMENT 1 START 1;
CREATE SEQUENCE lemovie.seq_idAvaliacao INCREMENT 1 START 1;
CREATE SEQUENCE lemovie.seq_idIndicacao INCREMENT 1 START 1;
CREATE SEQUENCE lemovie.seq_idLogMidia INCREMENT 1 START 1;
CREATE SEQUENCE lemovie.seq_idElenco INCREMENT 1 START 1;
CREATE SEQUENCE lemovie.seq_idFilme INCREMENT 1 START 1;
CREATE SEQUENCE lemovie.seq_idSerie INCREMENT 1 START 1;

--Criei pq usuario repete mt e ficava esquecendo o 15
CREATE DOMAIN lemovie.tipo_usuario AS VARCHAR(15);

--CREATE TYPE lemovie.tipo_array AS VARCHAR[];
CREATE TYPE lemovie.tipo_genero AS ENUM('M', 'F');
CREATE TYPE lemovie.tipo_nivelAcesso AS ENUM('ADMIN','USER');
CREATE TYPE lemovie.tipo_idioma AS ENUM('PORTUGUÊS','ESPANHOL','INGLÊS','ITALIANO','FRANCÊS','ALEMÃO','CHINÊS','JAPONÊS','INDIANO','RUSSO','CASTELHANO');
CREATE TYPE lemovie.tipo_acao AS ENUM('ATUALIZOU','DELETOU','ADICIONOU');
CREATE TYPE lemovie.tipo_midia AS ENUM('FILME', 'LIVRO', 'SERIE'); 

-- A domain is an alias for a built-in data type

-- pessoa == usuario
CREATE TABLE lemovie.usuario(
    login lemovie.tipo_usuario NOT NULL,
    nome VARCHAR(45) NOT NULL,
    sobrenome VARCHAR (45) NOT NULL,
    genero lemovie.tipo_genero,
    senha VARCHAR(15) NOT NULL,
    nivelAcesso lemovie.tipo_nivelAcesso NOT NULL,
    dataRegistro DATE, -- pega o horario do pc? automaticamente? precisa de not null? -resp: A gente tem q inserir
    CONSTRAINT pk_usuario PRIMARY KEY (login)
);

CREATE TABLE lemovie.amizade(
    idAmizade INT DEFAULT nextval('lemovie.seq_idAmizade'),
    dataRegistro DATE,
    usuario1 lemovie.tipo_usuario NOT NULL,
    usuario2 lemovie.tipo_usuario NOT NULL,
    CONSTRAINT fk_usuario1 FOREIGN KEY (usuario1) REFERENCES lemovie.usuario(login) 
    ON DELETE CASCADE ON UPDATE CASCADE, 
    CONSTRAINT fk_usuario2 FOREIGN KEY (usuario2) REFERENCES lemovie.usuario(login)
    ON DELETE CASCADE ON UPDATE CASCADE
    --precisa do ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE lemovie.midia(
    idMidia INT DEFAULT nextval('lemovie.seq_idMidia'),
    dataRegistro DATE,
    nome VARCHAR(75) NOT NULL,
    ano VARCHAR(4) NOT NULL,
    autor VARCHAR(45) NOT NULL,
    sinopse VARCHAR(1000) NOT NULL,
    idioma lemovie.tipo_idioma NOT NULL,
    mediaNota FLOAT DEFAULT 0,
    tipo lemovie.tipo_midia NOT NULL,
    CONSTRAINT pk_midia PRIMARY KEY (idMidia)
);

-- Adicionei Array de elenco
-- Não podemos criar fk para cada elemento do array? - resp: NÃO
CREATE TABLE lemovie.filme(
 -- idFilme INT DEFAULT nextval('lemovie.seq_idFilme'),
  idFilme INT NOT NULL,
  diretor VARCHAR(45) NOT NULL,
  elenco VARCHAR[] NOT NULL,
  duracao TIME NOT NULL,
  --CONSTRAINT pk_filme PRIMARY KEY (idFilme),
  CONSTRAINT fk_midia FOREIGN KEY (idFilme) REFERENCES lemovie.midia(idMidia)
  ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT pk_filme PRIMARY KEY(idFilme)

  /* CONSTRAINT fk_diretor FOREIGN KEY (diretor) REFERENCES lemovie.elenco(idElenco)
  ON DELETE CASCADE ON UPDATE CASCADE, */
);

-- Adicionei array de elenco
CREATE TABLE lemovie.serie(
 -- idSerie INT DEFAULT nextval('lemovie.seq_idSerie'),
  idSerie INT NOT NULL,
  diretor VARCHAR(45) NOT NULL,
  elenco VARCHAR[] NOT NULL,
  temporadas INT NOT NULL,
  duracaoMediaEps FLOAT NOT NULL,
  CONSTRAINT fk_midia FOREIGN KEY (idSerie) REFERENCES lemovie.midia(idMidia)
  ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT pk_serie PRIMARY KEY (idSerie)
  
  /*CONSTRAINT fk_diretor FOREIGN KEY (diretor) REFERENCES lemovie.elenco(idElenco)
  ON DELETE CASCADE ON UPDATE CASCADE*/
);

-- pk virou o ISBN - resp: MELHOR ID MIDIA SER PK
CREATE TABLE lemovie.livro(
  ISBN VARCHAR(13) NOT NULL, -- UNIQ
  idLivro INT NOT NULL,
  capitulos INT NOT NULL,
  paginas INT NOT NULL,
  editora VARCHAR(100) NOT NULL,
  CONSTRAINT fk_midia FOREIGN KEY (idLivro) REFERENCES lemovie.midia(idMidia)
  ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT pk_livro PRIMARY KEY (idLivro),
  CONSTRAINT uq_ISBN UNIQUE (ISBN)
);

CREATE TABLE lemovie.logMidia(
  idLogMidia INT DEFAULT nextval('lemovie.seq_idLogMidia'),
  usuario lemovie.tipo_usuario NOT NULL,
  midia INT NOT NULL,
  dataRegistro DATE,
  acao lemovie.tipo_acao NOT NULL, -- O q é isso msm? -resp: A ACAO FEITA PELO ADM, CRIEI UM TIPO ENUM
  descricao VARCHAR(45) NOT NULL,
  
  CONSTRAINT pk_idLogMidia PRIMARY KEY (idLogMidia),
  CONSTRAINT fk_usuario FOREIGN KEY (usuario) REFERENCES lemovie.usuario(login)
  ON DELETE CASCADE ON UPDATE CASCADE,
 CONSTRAINT fk_midia FOREIGN KEY (midia) REFERENCES lemovie.midia(idMidia)
 ON DELETE CASCADE ON UPDATE CASCADE

-- Comentando essa ultima linha resolvi o erro que estava tendo
-- CONSTRAINT fk_dataRegistro FOREIGN KEY (dataRegistro) REFERENCES lemovie.midia(dataRegistro) 
);


CREATE TABLE lemovie.comentario(
    idComentario INT DEFAULT nextval('lemovie.seq_idComentario'),
    usuario lemovie.tipo_usuario NOT NULL,
    midia INT NOT NULL,
    texto VARCHAR(1000) NOT NULL,
    dataRegistro DATE NOT NULL,
    CONSTRAINT pk_comentario PRIMARY KEY (idComentario),
    CONSTRAINT fk_usuario FOREIGN KEY (usuario) REFERENCES lemovie.usuario(login) 
    ON DELETE CASCADE ON UPDATE CASCADE, 
    CONSTRAINT fk_midia FOREIGN KEY (midia) REFERENCES lemovie.midia(idMidia)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE lemovie.avaliacao(
  idAvaliacao INT DEFAULT nextval('lemovie.seq_idAvaliacao'),
  usuario lemovie.tipo_usuario NOT NULL,
  midia INT NOT NULL,
  tipo BOOLEAN NOT NULL,
  visto BOOLEAN,
  gostei BOOLEAN,
  queroVer BOOLEAN,
  favorito BOOLEAN,
  CONSTRAINT pk_idAvaliacao PRIMARY KEY (idAvaliacao),
  CONSTRAINT fk_usuario FOREIGN KEY (usuario) REFERENCES lemovie.usuario(login)
  ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT fk_midia FOREIGN KEY (midia) REFERENCES lemovie.midia(idMidia)
  ON DELETE CASCADE ON UPDATE CASCADE
);

-- tem alguma coisa errada
CREATE TABLE lemovie.resposta(
  idResposta INT DEFAULT nextval('lemovie.seq_idResposta'),
  comentario1 INT NOT NULL,
  comentario2 INT NOT NULL,
  CONSTRAINT pk_resposta PRIMARY KEY (idResposta),
  CONSTRAINT fk_comentatio1 FOREIGN KEY (comentario1) REFERENCES lemovie.comentario(idComentario)
  ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT fk_comentatio2 FOREIGN KEY (comentario2) REFERENCES lemovie.comentario(idComentario)
  ON DELETE CASCADE ON UPDATE CASCADE
);


-- O foreign key tmb é primary key?  -resp: SIM
CREATE TABLE lemovie.nota(
  idNota INT NOT NULL,
  --avalicao INT NOT NULL,
  valor FLOAT NOT NULL,
  
  CONSTRAINT fk_avaliacao FOREIGN KEY (idNota) REFERENCES lemovie.avaliacao(idAvaliacao)
  ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT pk_nota PRIMARY KEY(idNota)

/* 
  CONSTRAINT pk_nota PRIMARY KEY (avaliacao),
  CONSTRAINT fk_avaliacao FOREIGN KEY (avaliacao) REFERENCES lemovie.avaliacao(idAvaliacao)
  ON DELETE CASCADE ON UPDATE CASCADE
*/

);

CREATE TABLE lemovie.indicacao(
  idIndicacao INT DEFAULT nextval('lemovie.seq_idIndicacao'),
  usuarioIndicador lemovie.tipo_usuario NOT NULL,
  usuarioIndicado lemovie.tipo_usuario NOT NULL,
  midia INT NOT NULL,
  comentario VARCHAR(1000),
  dataRegistro DATE,
  CONSTRAINT pk_indicacao PRIMARY KEY (idIndicacao),
  CONSTRAINT fk_usuarioIndicador FOREIGN KEY (usuarioIndicador) REFERENCES lemovie.usuario(login) 
  ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT fk_usuarioIndicado FOREIGN KEY (usuarioIndicado) REFERENCES lemovie.usuario(login)
  ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT fk_midia FOREIGN KEY (midia) REFERENCES lemovie.midia(idMidia)
  ON DELETE CASCADE ON UPDATE CASCADE
);


-- ELENCO VIROU UMA LISTA DE NOMES
/*
CREATE TABLE lemovie.elenco(
  idElenco INT DEFAULT nextval('lemovie.seq_idElenco'),
  nome VARCHAR(75) NOT NULL,
  funcao VARCHAR(45) NOT NULL, --trocar por enum?
  CONSTRAINT pk_elenco PRIMARY KEY (idElenco),
);
*/