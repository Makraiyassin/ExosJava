-- 2.6.1
SELECT course_name, section_name, professor_name
FROM course c 
LEFT JOIN professor p ON c.professor_id = p.professor_id
JOIN section s ON p.section_id = s.section_id;
-- 2.6.2
SELECT s.section_id, section_name, last_name
FROM section s
JOIN student st ON s.delegate_id = st.student_id
ORDER BY s.section_id DESC;
-- 2.6.3
SELECT s.section_id, section_name, professor_name
FROM section s 
LEFT JOIN professor p ON p.section_id = s.section_id;
-- 2.6.4
SELECT s.section_id, section_name, professor_name
FROM section s 
JOIN professor p ON p.section_id = s.section_id;
-- 2.6.5
SELECT s.last_name, s.year_result, g.grade
FROM student s
JOIN grade g ON s.year_result BETWEEN g.lower_bound AND g.upper_Bound
WHERE s.year_result >= 12
ORDER BY g.grade ASC;
-- 2.6.6
SELECT professor_name, section_name, course_name, course_ects
FROM section s
JOIN professor p ON s.section_id = p.section_id
LEFT JOIN course c ON p.professor_id = c.professor_id
ORDER BY course_ects DESC;
-- 2.6.7
SELECT p.professor_id, SUM(c.course_ects) AS 'ECTS_TOT'
FROM professor p 
LEFT JOIN course c ON p.professor_id =c.professor_id
GROUP BY p.professor_id
ORDER BY c.course_ects DESC;
-- 2.6.8
SELECT first_name, last_name, "S" AS "Catégorie"
FROM student
WHERE char_length(last_name) > 8
UNION
SELECT professor_surname, professor_name, "P"
FROM professor
WHERE char_length(professor_name) > 8;
-- 2.6.9
-- /!\ MYSQL ne fait pas EXCEPT/MINUS
SELECT s.section_id
FROM section s 
LEFT JOIN professor p ON s.section_id = p.section_id
WHERE p.professor_name is NULL;