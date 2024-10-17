
INSERT INTO estudiantes(nombre, edad)
VALUES('Hermione Granger', '18'), /* id: 1 */
      ('Harry Potter', '17'),
      ('Draco Malfoy', '16'),
      ('Ron Weasley', '18'),
      ('Luna Lovegood', '16'),
      ('Ginny Weasley', '17');
      
INSERT INTO cursos(nombre, duracion)
VALUES('Astronomia', '1 mes'),  /* id: 1 */
      ('Encantamientos', '4 meses'),
      ('Artes Oscuras', '6 meses'),
      ('Vuelo', '3 meses'),
      ('Pociones', '2 meses');
      
INSERT INTO inscripciones(estudiante_id, curso_id)
VALUES(1, 2),
      (1, 5),
      (2, 1),
      (2, 4),
      (3, 3),
      (3, 4),
      (5, 2),
      (5, 5);

/* Proyecta a todos los estudiantes y sus respectivos cursos. */
      
SELECT estudiantes.nombre, cursos.nombre 
FROM estudiantes 
JOIN inscripciones
    ON estudiantes.id = inscripciones.estudiante_id
JOIN cursos
    ON cursos.id = inscripciones.curso_id;

SELECT estudiantes.nombre, cursos.nombre /* Proyecta todos los estudiantes que están inscritos vuelo, utilizando el nombre del curso como criterio de búsqueda*/
FROM estudiantes 
JOIN inscripciones
    ON estudiantes.id = inscripciones.estudiante_id
JOIN cursos
    ON cursos.id = inscripciones.curso_id
WHERE cursos.nombre = 'vuelo';

SELECT estudiantes.nombre, cursos.nombre /* despliega en todos los cursos donde esta inscrito un estudiante por su nombre */
FROM estudiantes 
JOIN inscripciones
    ON estudiantes.id = inscripciones.estudiante_id
JOIN cursos
    ON cursos.id = inscripciones.curso_id
WHERE estudiantes.nombre = 'Hermione Granger';

SELECT cursos.nombre, COUNT(inscripciones.estudiante_id) AS numero_estudiantes
FROM cursos JOIN inscripciones
    ON cursos.id = inscripciones.curso_id
GROUP BY cursos.nombre;

SELECT estudiantes.nombre
FROM estudiantes LEFT JOIN inscripciones
     ON estudiantes.id = inscripciones.estudiante_id
WHERE estudiante_id IS NULL;




    

    
