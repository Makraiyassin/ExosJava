-- 2.4.1 L’utilisation de « GROUP BY » peut être considérée comme une forme de
-- boucle dans une requête SQL ? (Vrai/Faux)
-- VRAI : il répète l'action pour chacun des groupes
-- 2.4.2 La répartition en groupe se fait avant de prendre en compte les restrictions
-- imposées par un « WHERE » ? (Vrai/Faux)
-- FAUX - l'ordre est le suivant
-- 1 FROM
-- 2 WHERE
-- 3 GROUP BY 
-- 4 HAVING
-- 5 SELECT
-- 6 ORDER BY
-- 2.4.3 Un « GROUP BY » doit impérativement porter sur une colonne non alliacée ?
-- VRAI car il ne connait pas encore le select
-- 2.4.4 L’utilisation d’un « GROUP BY » a pour effet de trier les résultats dans l’ordre
-- croissant de la colonne incluse dans le « GROUP BY » ? (Vrai/Faux)
-- VRAI /!\ Ca dépend du SGBD
-- 2.4.5 La colonne sur laquelle porte le « GROUP BY » doit impérativement être
-- présente dans la clause « SELECT » ? (Vrai/Faux)
-- FAUX mais l'inverse est vrai
-- SELECT student_id, AVG(year_result)
-- FROM student
-- GROUP BY student_id

-- SELECT AVG(year_result)
-- FROM student
-- GROUP BY student_id
-- 2.4.6
SELECT section_id, count(last_name)
FROM student
GROUP BY section_id; -- la règle d'or dit que ce qui est dans le select (non agrégé) 
-- doit se trouver dans le group by

SELECT section_id, AVG(year_result) 
FROM student
GROUP BY section_id
HAVING AVG(year_result) > 10; -- une condition sur un résultat d'un group est dans un 
-- having et non dans un where

SELECT section_id, AVG(year_result) -- ok
FROM student
WHERE year_result > 10
ORDER BY section_id;

-- 2.4.7
SELECT section_id, max(year_result) AS "Résultat maximum"
FROM student
GROUP BY section_id;
-- 2.4.8
-- ce n'est qu'une addition car lorsqu'il fait une opération, il convertit le type 
-- le plus approprié 
-- donc 4.000 + 0 = 4
SELECT section_id, CONVERT(avg(year_result), char)+0 AS "Moyenne"
FROM student
WHERE section_id LIKE "10%"
GROUP BY section_id;
-- 2.4.9
SELECT month(birth_date) AS "Mois de naissance", convert(avg(year_result), char)+0 AS "Moyenne"
FROM student
WHERE year(birth_date) BETWEEN 1970 AND 1985
GROUP BY month(birth_date);

-- 2.4.10
SELECT section_id, convert(avg(year_result), char)+0 AS "Moyenne"
FROM student
GROUP BY section_id
HAVING count(student_id) > 3;
-- 2.4.11
SELECT section_id, convert(avg(year_result), char)+0 AS "Moyenne", max(year_result) AS "Résultat maximum"
FROM student
GROUP BY section_id
HAVING avg(year_result) > 8;

-- 2.5.1 L’utilisation de « ROLLUP » crée des groupes de données en se déplaçant dans
-- une seule direction, partant de la gauche vers la droite par rapport aux colonnes sélectionnées ?
-- (Vrai/Faux)
-- VRAI
-- 2.5.2 Le résultat produit par un « ROLLUP » présente les résultats du plus agrégé au
-- moins agrégé ? (Vrai/Faux)
-- FAUX - c'est le select
-- 2.5.6 
SELECT section_id, course_id, convert(avg(year_result), char)+0 AS "Moyenne"
FROM student
WHERE section_id IN(1010, 1320)
GROUP BY section_id, course_id WITH ROLLUP;