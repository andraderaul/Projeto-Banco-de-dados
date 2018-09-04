
-- USUÁRIOS

INSERT INTO lemovie.usuario VALUES('netorangel','Neto','Rangel','M', '4321', 'USER', '2018-08-24');
INSERT INTO lemovie.usuario VALUES('aryella','aryella','Lacerda','F', '0123', 'USER', '2018-08-24');
INSERT INTO lemovie.usuario VALUES('weslan','Weslan','Jofrey','M', '2424', 'USER', '2018-08-24');
INSERT INTO lemovie.usuario VALUES('andraderaul','Raul','Andrade','M', '1234', 'ADMIN', '2018-08-24');
INSERT INTO lemovie.usuario VALUES('hopikins','Hermanyo','Hopikins','M', 'candanga', 'USER', '2018-08-24');
INSERT INTO lemovie.usuario VALUES('jainec','Jaine','Conceicao','F', '1234', 'USER', '2018-08-24');
INSERT INTO lemovie.usuario VALUES('ADMIN','Administrador','Lemovie','F', 'ADMIN', 'ADMIN', '2018-08-25');
INSERT INTO lemovie.usuario VALUES('fulano','Fulano','de Tal','M', '4321', 'USER', '2018-08-25');
INSERT INTO lemovie.usuario VALUES('eago__','Eago','Elesbao','M', '2143', 'USER', '2018-08-25');
INSERT INTO lemovie.usuario VALUES('Jooj','George','O jesus','M', '3333', 'USER', '2018-08-25');
INSERT INTO lemovie.usuario VALUES('andrebritto','Andre','Brito','M', '12345', 'ADMIN', '2018-08-03');

-- AMIZADES
-- a amizade é feita com a chave primaria do usuario, que neste caso é login
INSERT INTO lemovie.amizade VALUES(DEFAULT,'2018-08-24','netorangel','aryella');
INSERT INTO lemovie.amizade VALUES(DEFAULT,'2018-08-24','netorangel','weslan');
INSERT INTO lemovie.amizade VALUES(DEFAULT,'2018-08-24','netorangel','andraderaul');
INSERT INTO lemovie.amizade VALUES(DEFAULT,'2018-08-24','aryella','weslan');
INSERT INTO lemovie.amizade VALUES(DEFAULT,'2018-08-24','aryella','andraderaul');
INSERT INTO lemovie.amizade VALUES(DEFAULT,'2018-08-24','weslan','andraderaul');
INSERT INTO lemovie.amizade VALUES(DEFAULT,'2018-08-25','jainec','andraderaul');
INSERT INTO lemovie.amizade VALUES(DEFAULT,'2018-08-25','eago__','andraderaul');
INSERT INTO lemovie.amizade VALUES(DEFAULT,'2018-08-25','Jooj','andraderaul');
INSERT INTO lemovie.amizade VALUES(DEFAULT,'2018-08-25','fulano','ADMIN');

-- FILMES
INSERT INTO lemovie.midia VALUES(1,'2018-08-24', '2001: Uma Odisseia no Espaço', '1968', 'Stanley Kubrick',
'Desde a “Aurora do Homem” (a pré-história), um misterioso monólito negro parece emitir sinais de
 outra civilização interferindo no nosso planeta. Quatro milhões de anos depois, no século XXI,
 uma equipe de astronautas liderados pelo experiente David Bowman (Keir Dullea) e Frank Poole (Gary Lockwood)
 é enviada a Júpiter para investigar o enigmático monólito na nave Discovery, totalmente controlada pelo computador HAL 9000.',
 'INGLÊS', 0, 'FILME');
INSERT INTO lemovie.filme VALUES(1, 'Stanley Kubrick', '{"Douglas Rain","Kleir Dullea","Ann Gillis"}', '02:00:00');

INSERT INTO lemovie.midia VALUES(2,'2018-08-24', 'Pulp Fiction', '1994', 'Quentin Tarantino',
'São apresentadas três histórias de forma não cronológica.', 'INGLÊS', 0, 'FILME');
INSERT INTO lemovie.filme VALUES(2, 'Quentin Tarantino', '{"John Travolta", "Samuel L. Jackson","Uma Thurman"}', '02:00:00');

INSERT INTO lemovie.midia VALUES(3,'2018-08-24', 'A Clockwork Orange', '1971', 'Stanley Kubrick',
'Em uma desolada Inglaterra do futuro, a violência das gangues juvenis impera, provocando um clima de terror.', 'INGLÊS', 0, 'FILME');
INSERT INTO lemovie.filme VALUES(3, 'Samuel L. Jackson', '{"Malcolm McDowel", "Patrick Magee","Adrienene Corri"}', '02:00:00');

INSERT INTO lemovie.midia VALUES(9,'2018-08-25','Fight Club','1999', 'Chuck Palahniuk', 'Um explosivo sofredor de insônia (Edward Norton) e um carismático vendedor de sabonete (Brad Pitt) ','INGLÊS',9.8,'FILME');
INSERT INTO lemovie.filme VALUES(9,'David Fincher','{"Edward Norton","Brad Pitt","Helena Bonham Carter"}','01:40:00');

INSERT INTO lemovie.midia VALUES(10,'2018-08-25','Donnie Darko','2001', 'Richard Kelly', 'Após escapar de um acidente bizarro, um adolescente problemático tem visões de um homem numa fantasia de coelho que o faz cometer vários crimes.','INGLÊS',10,'FILME');
INSERT INTO lemovie.filme VALUES(10,'Richard Kelly','{"Jake Gyllenhaal","James Duval","Kristina Malota"}','01:30:00');

-- SERIES
INSERT INTO lemovie.midia VALUES(6,'2018-08-24','Better Call Saul','2015','Peter Gould','Better Call Saul conta a história do advogado Saul Goodman anos antes de ser contratado por Walter White.
De multas de estacionamento a assassinatos, de acidentes de carro a fraudes públicas, Saul faz de tudo. A série vai se passar em 2002, seis anos antes dos eventos de Breaking Bad, embora acontecimentos durante e após a série original também serão explorados.',
'INGLÊS', 0, 'SERIE');
INSERT INTO lemovie.serie VALUES(6,'Adam Bernstein','{"Bob Odenkirk","Jonathan Banks","Rhea Seehorn"}',5,40);


INSERT INTO lemovie.midia VALUES(7,'2018-08-24','Rick and Morty ','2013','Dan Harmor','Após ficar desaparecido por quase vinte anos, o cientista Rick Sanchez (Justin Roiland) reaparece na porta da casa de sua filha Beth (Sarah Chalke) na esperança de ser mudar com ela e sua família.',
'INGLÊS', 0, 'SERIE');
INSERT INTO lemovie.serie VALUES(7,'Dan Harmor','{"Justin Roiland","Sarah Chalke","Phil Hendrie"}',3,20);

INSERT INTO lemovie.midia VALUES(8,'2018-08-24','Breaking Bad','2008','Vince Gilligan','Um professor de Quimica que vira Traficante','INGLÊS', 0, 'SERIE');
INSERT INTO lemovie.serie VALUES(8,'Adam Bernstein','{"Aaron Paul","Bryan Cranston","Dean Norris"}',5,45);

INSERT INTO lemovie.midia VALUES(4,'2018-08-23','Familia Brasileira','2016', 'Hemanyo Hopikins', 'Uma familia do barulho, fora dos padroes sociais','PORTUGUÊS',10,'SERIE');
INSERT INTO lemovie.serie VALUES(4,'Raniery','{"Carol de Paula","Nettinha Rayanne","Marcelo Pan"}',5,45);

INSERT INTO lemovie.midia VALUES(5,'2018-08-27','to puto','2018', 'unknown', 'kkkk','PORTUGUÊS',10,'SERIE');
INSERT INTO lemovie.serie VALUES(5,'unknown','{"unknown de Paula","unknown Rayanne","unknown Pan"}',6,45);

--LIVROS

INSERT INTO lemovie.midia VALUES(11,'2018-08-24','Dom Quixote de la Mancha ','1605','Miguel de Cervantes Saavedra','O protagonista da obra é Dom Quixote, um pequeno fidalgo castelhano que perdeu a razão por muita leitura de romances de cavalaria e pretende imitar seus heróis preferidos.',
'CASTELHANO', 0, 'LIVRO');
INSERT INTO lemovie.livro VALUES('8585008245',11,126,500,'Livraria José Olympio Editora');

INSERT INTO lemovie.midia VALUES(12,'2018-08-24','O Guia do Mochileiro das Galáxias','1979','Douglas Adams','D O I D E R A, sentido da vida é 42',
'INGLÊS', 0, 'LIVRO');
INSERT INTO lemovie.livro VALUES('0330258648',12,5,180,'Pan books');

INSERT INTO lemovie.midia VALUES(13,'2018-08-25','Assassin´s Creed - Renascença','2011','Bowden,Oliver','Traído pelas famílias que governam as cidades-estado italianas, um jovem embarca em uma jornada épica em busca de vingança.',
'INGLÊS', 7, 'LIVRO');
INSERT INTO lemovie.livro VALUES('9788501091338',13,5,180,'Galera Record');

-- AVALIACAO
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'netorangel', 7, FALSE, TRUE, TRUE, TRUE, TRUE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'netorangel', 2, FALSE, TRUE, TRUE, TRUE, TRUE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'andraderaul', 1, FALSE, TRUE, TRUE, TRUE, TRUE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'andraderaul', 3, FALSE, FALSE, FALSE, TRUE, TRUE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'aryella', 3, FALSE, TRUE, TRUE, TRUE, TRUE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'aryella', 2, FALSE, TRUE, TRUE, TRUE, TRUE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'hopikins', 4, FALSE, FALSE, FALSE, TRUE, FALSE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'hopikins', 12, FALSE, TRUE, TRUE, TRUE, TRUE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'eago__', 9, FALSE, FALSE, FALSE, TRUE, FALSE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'Jooj', 12, FALSE, TRUE, TRUE, TRUE, FALSE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'jainec', 8, FALSE, TRUE, TRUE, TRUE, FALSE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'andraderaul', 11, FALSE, FALSE, FALSE, TRUE, FALSE);
INSERT INTO lemovie.avaliacao VALUES (DEFAULT,'eago__', 13, FALSE, FALSE, FALSE, FALSE, FALSE);

-- INDICACAO
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'andraderaul', 'netorangel', 8, 'e legal fioti', '2018-08-24');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'hopikins', 'aryella', 11, 'is cool girl', '2018-08-24');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'netorangel', 'hopikins', 5, 'pra voce que gosta', '2018-08-24');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'andraderaul', 'eago__', 1, 'voce vai adorar', '2018-08-25');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'andraderaul', 'Jooj', 5, 'eh a sua cara', '2018-08-25');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'netorangel', 'eago__', 10, 'kkk muito bom', '2018-08-25');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'eago__', 'andraderaul', 9, 'se nao viu? veja!!', '2018-08-25');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'Jooj', 'eago__', 12, 'super recomendado', '2018-08-25');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'Jooj', 'andraderaul', 3, 'SHOWW!!', '2018-08-25');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'netorangel', 'eago__', 8, 'se liga nisso', '2018-08-25');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'andraderaul', 'eago__', 2, 'D O I D E R A', '2018-08-25');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'eago__', 'netorangel', 6, 'olha que massa', '2018-08-25');
INSERT INTO lemovie.indicacao VALUES (DEFAULT,'netorangel', 'aryella', 5, 'ja to sem ideia pra comentario', '2018-08-25');

-- COMENTARIO
INSERT INTO lemovie.comentario VALUES (1, 'andraderaul', 1, 'eu adoro esse filme', '2018-08-25');
INSERT INTO lemovie.comentario VALUES (2, 'netorangel', 6, 'amo essa serie', '2018-08-25');
INSERT INTO lemovie.comentario VALUES (3, 'andraderaul', 2, 'super recomendo esse filme', '2018-08-25');
INSERT INTO lemovie.comentario VALUES (4, 'jainec', 8, 'essa serie é fantastica', '2018-08-25');
INSERT INTO lemovie.comentario VALUES (5, 'aryella', 12, 'esse livro é magico', '2018-08-25');
INSERT INTO lemovie.comentario VALUES (6, 'hopikins', 12, 'concordo', '2018-08-25');
INSERT INTO lemovie.comentario VALUES (7, 'hopikins', 11, 'esse livro é maluco', '2018-08-25');
INSERT INTO lemovie.comentario VALUES (8, 'andraderaul', 12, 'q magia, tem nada de magia nao', '2018-08-25');
INSERT INTO lemovie.comentario VALUES (9, 'netorangel', 11, 'maluco é pouco', '2018-08-25');

-- RESPOSTA
INSERT INTO lemovie.resposta VALUES (DEFAULT, 5, 6);
INSERT INTO lemovie.resposta VALUES (DEFAULT, 5, 8);
INSERT INTO lemovie.resposta VALUES (DEFAULT, 7, 9);

-- LOGMIDIA
INSERT INTO lemovie.logmidia(
            idlogmidia, usuario, midia, dataregistro, acao, descricao)
    VALUES (1, 'andraderaul', 1, '2018-08-24', 'ADICIONOU', 'foi adicionada um filme');
INSERT INTO lemovie.logmidia(
            idlogmidia, usuario, midia, dataregistro, acao, descricao)
    VALUES (2, 'andraderaul', 2, '2018-08-24', 'ADICIONOU', 'foi adicionada um filme');
INSERT INTO lemovie.logmidia(
            idlogmidia, usuario, midia, dataregistro, acao, descricao)
    VALUES (3, 'andraderaul', 3, '2018-08-24', 'ADICIONOU', 'foi adicionada um filme');
INSERT INTO lemovie.logmidia(
            idlogmidia, usuario, midia, dataregistro, acao, descricao)
    VALUES (4, 'andraderaul', 4, '2018-08-24', 'ADICIONOU', 'foi adicionada um filme');
INSERT INTO lemovie.logmidia(
            idlogmidia, usuario, midia, dataregistro, acao, descricao)
    VALUES (5, 'ADMIN', 6, '2018-08-24', 'ADICIONOU', 'foi adicionada uma serie');
INSERT INTO lemovie.logmidia(
            idlogmidia, usuario, midia, dataregistro, acao, descricao)
    VALUES (6, 'ADMIN', 7, '2018-08-24', 'ADICIONOU', 'foi adicionada uma serie');
INSERT INTO lemovie.logmidia(
            idlogmidia, usuario, midia, dataregistro, acao, descricao)
    VALUES (7, 'ADMIN', 8, '2018-08-24', 'ADICIONOU', 'foi adicionada uma serie');
INSERT INTO lemovie.logmidia(
            idlogmidia, usuario, midia, dataregistro, acao, descricao)
    VALUES (8, 'ADMIN', 11, '2018-08-24', 'ADICIONOU', 'foi adicionada um livro');
INSERT INTO lemovie.logmidia(
            idlogmidia, usuario, midia, dataregistro, acao, descricao)
    VALUES (9, 'ADMIN', 12, '2018-08-24', 'ADICIONOU', 'foi adicionada um livro');
INSERT INTO lemovie.logmidia(
            idlogmidia, usuario, midia, dataregistro, acao, descricao)
    VALUES (10, 'andraderaul', 9, '2018-08-25', 'ADICIONOU', 'foi adicionada um filme');
INSERT INTO lemovie.logmidia(
            idlogmidia, usuario, midia, dataregistro, acao, descricao)
    VALUES (11, 'andraderaul', 10, '2018-08-25', 'ADICIONOU', 'foi adicionada um filme');

-- notas das midias
INSERT INTO lemovie.nota VALUES(8,5);
INSERT INTO lemovie.nota VALUES(10,8);

INSERT INTO lemovie.nota VALUES(2,8);
INSERT INTO lemovie.nota VALUES(6,9);

INSERT INTO lemovie.nota VALUES(4,10);
INSERT INTO lemovie.nota VALUES(5,7);