INSERT INTO faculties (faculty_name)
VALUES ('Ingeniería'),
    ('Artes'),
    ('Humanas'),
    ('Ciencias de la Salud'),
    ('Ciencias Sociales y Económicas');
INSERT INTO departments (department_name, faculty_id)
VALUES ('Ingeniería de Sistemas e Industrial', 1),
    ('Medicina', 4),
    ('Biologia', 4),
    ('Ingeniería agricola', 1);
INSERT INTO careers (credits, career_name, department_id)
VALUES (200, 'Ingeniería de Sistemas', 1),
    (200, 'Medicina', 2),
    (200, 'Biologia', 3),
    (200, 'Ingeniería agricola', 4),
    (185, 'Ingeniería Industrial', 1);