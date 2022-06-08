-- 2.3.1 – Pourquoi lorsque l’on utilise la fonction « MAX » ou « MIN » les valeurs
-- « NULL » sont-elles ignorées ?
-- Null n'est pas une valeur, donc n'est pas pris en compte
-- 2.3.2 – Pourquoi le type des données n’a-t-il pas d’importance lorsque l’on utilise la
-- fonction « COUNT » ?
-- car il compte le ligne de la table
-- 2.3.3 – La fonction « AVG » renvoie la moyenne de toutes les lignes résultantes d’une
-- requête SELECT sur une colonne incluant toutes les valeurs « NULL ». (Vrai/Faux ?)
-- FAUX car null n'est pas une valeur
-- 2.3.4 – La fonction « SUM » est utilisée pour ajouter des totaux aux colonnes.
-- (Vrai/Faux ?)
-- FAUX - Il renvoie simplement la somme des valeurs de la colonne
-- 2.3.5 – La fonction « COUNT(*) » compte toutes les lignes d’une table. (Vrai/Faux ?)
-- VRAI
-- 2.3.6 – Les requêtes suivantes sont-elles valides ?
SELECT COUNT(*) -- toute fonction  doit avoir des ()
FROM student;

SELECT COUNT(student_id), login -- ! dans certaines SGBD ça ne marche pas
FROM student;	-- car count() renvoie une valeur et login une série de valeur

SELECT MIN(year_result), MAX(birth_date) -- OK
FROM student
WHERE year_result > 12;

-- 2.3.7
SELECT avg(year_result)
FROM student;
-- 2.3.8
SELECT max(year_result)
FROM student;

-- 2.3.9
SELECT sum(year_result)
FROM student;
-- 2.3.10
SELECT min(year_result)
FROM student;

-- 2.3.11
SELECT count(*)
FROM student;

-- 2.3.12
SELECT login, year(birth_date) AS "Année de naissance"
FROM student
WHERE year(birth_date) > 1970;

-- 2.3.13
SELECT login, last_name
FROM student
WHERE length(last_name) >= 8;

-- 2.3.14
SELECT upper(last_name) As "Nom de famille", first_name, year_result
FROM student
WHERE year_result >= 16
ORDER BY year_result DESC;
-- 2.3.15
SELECT first_name, last_name, login, lower(concat(left(first_name,2), left(last_name,4))) AS "Nouveau login"
FROM student
WHERE year_result BETWEEN 6 AND 10;
-- 2.3.16
SELECT first_name, last_name, login, concat(substring(first_name, char_length(first_name)-2, char_length(first_name)), year(curdate())-year(birth_date)) AS "Nouveau login"
FROM student
WHERE year_result = 10 OR year_result = 12 OR year_result = 14;
-- OU
SELECT first_name, last_name, login, concat(right(first_name, 3), year(curdate())-year(birth_date)) AS "Nouveau login"
FROM student
WHERE year_result IN(10, 12, 14);
-- 2.3.17
SELECT last_name, login, year_result
FROM student
WHERE left(last_name, 1) IN('d', 'm', 's')
ORDER BY birth_date ASC;
-- 2.3.18
SELECT last_name, login, year_result
FROM student
WHERE year_result % 2 = 1 AND year_result > 10
ORDER BY year_result DESC;
-- 2.3.19
SELECT count(*) AS "Nbre de noms de plus de 7 lettres"
FROM student
WHERE char_length(last_name) >= 7;

-- 2.3.20
SELECT last_name, year_result, 
CASE
	WHEN year_result >= 12 THEN 'OK'
	ELSE 'KO'
END
AS "Statut"
FROM student
WHERE year(birth_date) < 1955;

-- 2.3.21
SELECT last_name, year_result, 
CASE
	WHEN year_result > 10 THEN 'supérieure'
	WHEN year_result < 10 THEN 'inférieure'
	ELSE 'neutre'
END AS "Catégorie"
FROM student
WHERE year(birth_date) BETWEEN 1955 AND 1965;
	
-- 2.3.22
SELECT last_name, year_result, concat(day(birth_date), ' ',
CASE month(birth_date)
	WHEN 1 THEN 'janvier'
	WHEN 2 THEN 'février'
	WHEN 3 THEN 'mars'
	WHEN 4 THEN 'avril'
	WHEN 5 THEN 'mai'
	WHEN 6 THEN 'juin'
	WHEN 7 THEN 'juillet'
	WHEN 8 THEN 'aout'
	WHEN 9 THEN 'septembre'
	WHEN 10 THEN 'octobre'
	WHEN 11 THEN 'novembre'
	WHEN 12 THEN 'décembre'
END, ' ', year(birth_date)
) AS Literal_date
FROM student
WHERE year(birth_date) BETWEEN 1975 AND 1985;

-- 2.3.23
SELECT last_name, month(birth_date) AS "Mois de naissance", year_result, 
CASE
	WHEN year_result = 4 THEN null
	ELSE year_result
END AS "Nouveau résultat"
FROM student
WHERE month(birth_date) NOT IN(12,1,2,3) AND year_result < 7;
-- OU
SELECT last_name, month(birth_date) AS "Mois de naissance", year_result, NULLIF(year_result, 4) AS "Nouveau résultat"
FROM student
WHERE month(birth_date) NOT IN(12,1,2,3) AND year_result < 7;
