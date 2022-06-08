-- 2.1.1
SELECT last_name, first_name AS "F name"
FROM student;

SELECT last_name lname, first_name AS fname
FROM student;

SELECT CONCAT(last_name, "_", first_name) AS name
FROM student;

SELECT CONCAT(last_name , first_name) AS name, (year_result * 10) as "result"
FROM student;

-- 2.1.2
SELECT last_name, birth_date, login, year_result
FROM student;

-- 2.1.3
SELECT CONCAT(first_name, " ", last_name) AS "Nom complet", student_id, birth_date
FROM student;

-- 2.1.4
SELECT CONCAT(student_id, "|", first_name, "|", last_name, "|", CONVERT(birth_date, char(10)), "|", login, "|", section_id, "|", year_result, "|", course_id) AS "Info Etudiant"
FROM student;

-- 2.2.1
SELECT login, year_result
FROM student
WHERE year_result > 16;

-- 2.2.2
SELECT last_name, section_id
FROM student
WHERE first_name IN("Georges");

-- 2.2.3
SELECT last_name, year_result
FROM student
WHERE year_result BETWEEN 12 AND 16;

-- 2.2.4
SELECT last_name, section_id, year_result
FROM student
WHERE section_id NOT IN(1010,1020, 1110);

-- 2.2.5
SELECT last_name, section_id
FROM student
WHERE last_name LIKE "%r";

-- 2.2.6
SELECT last_name, year_result
FROM student
WHERE last_name LIKE "__n%" AND year_result > 10;

-- 2.2.7
SELECT last_name, year_result
FROM student
WHERE year_result <= 3
ORDER BY year_result DESC;

-- 2.2.8
SELECT CONCAT(last_name, " ", first_name) AS "Nom complet", year_result
FROM student
WHERE section_id = 1010
ORDER BY year_result ASC;

-- 2.2.9
SELECT last_name, section_id, year_result
FROM student
WHERE year_result NOT BETWEEN 12 AND 18 
	AND section_id IN(1010, 1020)
ORDER BY section_id ASC;

-- 2.2.10
SELECT last_name, section_id, year_result *5 AS "Résultat sur 100"
FROM student
WHERE section_id LIKE "13%" AND year_result *5 <=60
ORDER BY year_result DESC;