DELETE FROM careers;
DELETE FROM departments;
DELETE FROM faculties;
INSERT INTO faculties (faculty_id, faculty_name)
VALUES (1, 'Ingeniería'),
    (2, 'Artes'),
    (3, 'Humanas'),
    (4, 'Ciencias de la Salud'),
    (5, 'Ciencias Sociales y Económicas');
INSERT INTO departments (department_id, department_name, faculty_id)
VALUES (1, 'Ingeniería de Sistemas e Industrial', 1),
    (2, 'Medicina', 4),
    (3, 'Biologia', 4),
    (4, 'Ingeniería agricola', 1);
INSERT INTO careers (career_id, credits, career_name, department_id)
VALUES (1, 200, 'Ingeniería de Sistemas', 1),
    (2, 200, 'Medicina', 2),
    (3, 200, 'Biologia', 3),
    (4, 200, 'Ingeniería agricola', 4),
    (5, 185, 'Ingeniería Industrial', 1);