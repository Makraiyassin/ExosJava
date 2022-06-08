-- last_name, student_id, first_name, section_id, year_result, birth_date
-- course_id, course_name, course_ects, professor_id
-- grade, lower_bound, upper_bound
-- professor_name, professor_surname, professor_office, 
-- professor_email, professor_hire_date, professor_wage
-- delegate_id
-- section_name, 
-- student, professor, section, grade
-- 2.7.1
SELECT last_name, first_name, section_id
FROM student
WHERE last_name NOT LIKE 'roberts' AND section_id = (
	SELECT section_id
	FROM student
	WHERE last_name LIKE 'roberts'
)
ORDER BY last_name ASC;
-- 2.7.2
SELECT last_name, first_name, year_result
FROM student
WHERE year_result > 2*(
	SELECT avg(year_result)
	FROM student
);
-- 2.7.3
SELECT section_id, section_name
FROM section
WHERE section_id NOT IN(
	SELECT DISTINCT section_id
	FROM professor 
);
-- 2.7.4
SELECT last_name, first_name, DATE_FORMAT(birth_date, '%d/%m/%Y') AS "Date de naissance", year_result
FROM student
WHERE month(birth_date) = (
	SELECT month(professor_hire_date)
	FROM professor
	WHERE professor_name like 'giot'
);
ORDER BY year_result DESC
-- 2.7.5
SELECT last_name, first_name, year_result
FROM student
WHERE exists (
	SELECT lower_bound, upper_bound
	FROM grade
	WHERE year_result BETWEEN lower_bound AND upper_bound
	AND grade like 'TB'
);
-- ou
SELECT last_name, first_name, year_result
FROM student
WHERE year_result BETWEEN (
	SELECT lower_bound
	FROM grade
	WHERE grade like 'TB'
)
AND (
	SELECT upper_bound
	FROM grade
	WHERE grade like 'TB'
);
-- 2.7.6
SELECT last_name, first_name, section_id
FROM student
WHERE section_id = (
	SELECT section_id
	FROM section
	WHERE delegate_id = (
			SELECT student_id
			FROM student
			WHERE last_name = "marceau"
		)	
)	;
-- 2.7.7
SELECT section_id, section_name
FROM section
WHERE section_id = ANY(
	SELECT section_id
	FROM student
	GROUP BY section_id
	HAVING COUNT(*) > 4
);
-- ou
SELECT section_id, section_name
FROM section
WHERE section_id IN(
	SELECT section_id
	FROM student
	GROUP BY section_id
	HAVING COUNT(*) > 4
);
-- 2.7.8
-- Trouver la note max par section
SELECT section_id, MAX(year_result)
FROM student
GROUP BY section_id;
-- trouver la moyenne par section
SELECT section_id, avg(year_result)
FROM student
GROUP BY section_id;
-- trouver le 1 er de la section via à qui appartient la note max
SELECT last_name, first_name, section_id
FROM student s1
WHERE year_result = (
	SELECT MAX(year_result)
	FROM student s2
	WHERE s1.section_id = s2.section_id
	GROUP BY section_id
);
-- ajouter qu'ils ne sont pas dans la section dont la moyenne est < 10
 SELECT last_name, first_name, section_id
FROM student s1
WHERE year_result = (
	SELECT MAX(year_result)
	FROM student s2
	WHERE s1.section_id = s2.section_id
	GROUP BY section_id
)
AND s1.section_id NOT IN(
	SELECT section_id
	FROM student
	GROUP BY section_id
	HAVING avg(year_result) < 10
)
ORDER BY section_id DESC;
-- 2.7.9
SELECT section_id, avg(year_result)
FROM student
GROUP BY section_id
ORDER BY avg(year_result) DESC
LIMIT 1;
-- ou
select section_id, avg(year_result) moyenne
from student
group by section_id
having avg(year_result) = (select max(moyenne)
						   FROM (select section_id, avg(year_result) moyenne
								 from student
								 group by section_id) as moyennes);

SELECT section_id, moyenne
FROM (select section_id, avg(year_result) moyenne
	  from student
      group by section_id) as moyennes
Where moyenne = (select max(moyenne)
				 FROM (select section_id, avg(year_result) moyenne
					   from student
                       group by section_id) as moyennes);
-- ou
with moyennes (section_id, moyenne)
as
(
	select section_id, avg(year_result) moyenne
	from student
    group by section_id
)                       
SELECT section_id, moyenne
FROM moyennes
Where moyenne = (select max(moyenne)
				 FROM moyennes);