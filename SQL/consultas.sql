-- CONSULTAS

/* 1 - usar somente o básico SELECT, FROM, WHERE. */
-- LISTAR NOME E SOBRENOME DE TODOS OS USUARIOS QUE NÃO SAO ADMS
SELECT nome,sobrenome FROM lemovie.usuario WHERE nivelacesso = 'USER';

/* 2- JOIN de duas tabelas. */
-- LISTAR NOME E ANO DE TODOS OS FILMES
SELECT nome, ano FROM lemovie.midia 
    JOIN lemovie.filme ON (idmidia = idfilme);

/* 3 - JOIN de várias tabelas variando o uso de NATURAL, USING e ON  */
-- LISTAR OS NOMES, COMENTARIOS, AVALIACOES(NO CASO SE JA VIU) DETERMINADA MIDIA
SELECT u.nome, c.texto, a.visto, m.nome FROM lemovie.usuario u 
	JOIN lemovie.comentario c ON(u.login = c.usuario)
	JOIN lemovie.avaliacao a USING (midia)
	JOIN lemovie.midia m ON (a.midia = m.idmidia);


/* 4 - GROUP BY */
-- LISTAR QUANTAS FILMES TIVERAM NOTAS IGUAIS  -- colocar nota nas series
SELECT count(*) as qtd_notas , n.valor FROM lemovie.midia m
	JOIN lemovie.filme s ON (s.idfilme = m.idmidia) 
	LEFT JOIN lemovie.avaliacao a ON(m.idmidia = a.midia)
	LEFT JOIN lemovie.nota n ON (a.idavaliacao = n.idnota)
    GROUP BY(valor) ;

/* 5 - HAVING */
-- LISTAR O LOGIN, NOME E SOBRENOME DOS USUARIOS FIZERAM MAIS DE UM COMENTARIO
SELECT user_cmm.usuario , u.nome, u.sobrenome FROM lemovie.usuario u

	JOIN (	
		SELECT usuario FROM lemovie.comentario c
		GROUP BY (c.usuario)
		HAVING count(c.usuario) > 1
		
) AS user_cmm ON(user_cmm.usuario = u.login);

/*  6 - CONSULTA ANINHADA */
--MOSTRAR  QUEM FEZ O COMENTARIO E QUEM RESPONDEU , SE ESTES FOREM AMIGOS */
SELECT respostas_user.user1 AS comentou , respostas_user.user2 AS respondeu FROM lemovie.amizade am

	LEFT JOIN (

		SELECT DISTINCT c.usuario as USER1, c2.usuario as USER2 FROM lemovie.resposta r
			JOIN lemovie.comentario c ON(c.idcomentario = r.comentario1)
			JOIN lemovie.comentario c2 ON (c2.idcomentario = r.comentario2)

	) as respostas_user ON(respostas_user.user1 = usuario1 )
 WHERE am.usuario2 = respostas_user.user2;


/* 7 - ANINHADA + STRING(ILIKE, LOUWER)  */
/* LISTAR OS NOMES DOS USUARIOS QUE AVALIARAM A MIDIA E FIZERAM UM COMENTARIO NESTA, O NOME DA MIDIA.
EXBIBIR SOMENTE OS QUE NÃO VIRAM E COMENTARAM ADORO*/ 
SELECT av.usuario,av.visto,comments_user.nome_midia,comments_user.texto FROM lemovie.avaliacao av
LEFT JOIN (

	SELECT u.midia,  lower(u.texto) as texto , m.nome AS nome_midia, u.usuario 

		FROM lemovie.comentario u

			JOIN lemovie.midia m ON (m.idmidia = u.midia)
		
		

) AS comments_user ON ( av.midia =  comments_user.midia AND av.usuario = comments_user.usuario)


WHERE (comments_user.midia IS NOT NULL) 
	AND (comments_user.texto ILIKE '%adoro%') 
		AND visto IS FALSE ;
  

/* 8 - ANINHADA , OPERAÇÕES */
/*Listar a midia com a maior media, mostrar seu tipo , nome e a media  */
WITH media_midia AS(
SELECT av.midia,avg(valor) AS media FROM lemovie.avaliacao av
JOIN lemovie.nota n ON(n.idnota = av.idavaliacao)
GROUP BY (av.midia)
)

SELECT mi.nome, mi.tipo, mm.media FROM media_midia mm
JOIN lemovie.midia mi ON(mm.midia = mi.idmidia )
WHERE mm.media =  (

SELECT max(mm.media) FROM media_midia mm

);

/* 9 - GROUP BY, ORDER BY, BETWEEN , JOIN DE DUAS TABELAS */ 
/*LISTAR AS MIDIAS DE 1970 ATÉ 1999 E QUANTAS PESSOAS VIRAM CADA UMA DAS MIDIAS*/ 
SELECT m.ano, m.nome , count(av.visto) AS quantos_viram FROM lemovie.midia m
JOIN lemovie.avaliacao av ON(idmidia = midia)

WHERE ano BETWEEN '1970' AND '1999'
GROUP BY(idmidia)
ORDER BY (ano);


/* 10- ARITMÉTICA*/
/*LISTAR O NOME DOS USUARIOS E A QUANTIDADE DE HORAS QUE ELES ASSISTIRAM DE FILMES */
SELECT u.nome, sum(dur_mid.duracao) AS ASSISTIU  FROM lemovie.usuario u

	JOIN lemovie.avaliacao a ON(u.login = a.usuario)
	
	LEFT JOIN ( 

		SELECT m.idmidia, f.duracao,nome  FROM lemovie.midia m
			JOIN lemovie.filme f ON (m.idmidia = f.idfilme)

) AS dur_mid ON(dur_mid.idmidia = a.midia )
WHERE visto IS TRUE
GROUP BY (login);

