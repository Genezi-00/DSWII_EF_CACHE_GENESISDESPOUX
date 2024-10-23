-- Crear la base de datos
DROP DATABASE IF EXISTS universidadUpc;
CREATE DATABASE universidadUpc;
USE universidadUpc;

-- Crear la tabla Especialidad
CREATE TABLE Especialidad (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT
);

-- Crear la tabla Docente
CREATE TABLE Docente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    dni VARCHAR(8) NOT NULL,
    email VARCHAR(100)
);

-- Crear la tabla Alumno
CREATE TABLE Alumno (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    dni VARCHAR(8) NOT NULL,
    fechaNacimiento DATE,
    email VARCHAR(100)
);

-- Crear la tabla Curso
CREATE TABLE Curso (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    creditos INT NOT NULL
);

-- Crear la tabla Asignatura (relacionada con Curso)
CREATE TABLE Asignatura (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    idcurso INT,
    FOREIGN KEY (idcurso) REFERENCES Curso(id)
);

-- Insertar datos en la tabla Especialidad
INSERT INTO Especialidad (nombre, descripcion) VALUES 
('Ingeniería de Sistemas', 'Carrera de Ingeniería orientada a la informática y sistemas'),
('Ingeniería Civil', 'Carrera enfocada en construcción y diseño de infraestructuras'),
('Medicina', 'Carrera enfocada en la salud y el tratamiento de enfermedades'),
('Derecho', 'Carrera enfocada en leyes y justicia'),
('Arquitectura', 'Carrera enfocada en el diseño de edificios y estructuras'),
('Marketing', 'Carrera orientada a la gestión y promoción de productos'),
('Psicología', 'Carrera orientada al estudio del comportamiento humano'),
('Contabilidad', 'Carrera enfocada en el manejo de las finanzas y contabilidad empresarial');

-- Insertar datos en la tabla Docente
INSERT INTO Docente (nombres, apellidos, dni, email) VALUES 
('Carlos', 'Pérez', '12345678', 'carlos.perez@universidad.edu.pe'),
('María', 'González', '87654321', 'maria.gonzalez@universidad.edu.pe'),
('Pedro', 'López', '11223344', 'pedro.lopez@universidad.edu.pe'),
('Ana', 'Ramírez', '44332211', 'ana.ramirez@universidad.edu.pe'),
('Juan', 'Mendoza', '33445566', 'juan.mendoza@universidad.edu.pe'),
('Lucía', 'Torres', '55667788', 'lucia.torres@universidad.edu.pe'),
('José', 'Flores', '66778899', 'jose.flores@universidad.edu.pe'),
('Elena', 'Castro', '99887766', 'elena.castro@universidad.edu.pe');

-- Insertar datos en la tabla Alumno
INSERT INTO Alumno (nombres, apellidos, dni, fechaNacimiento, email) VALUES 
('Luis', 'Quispe', '10101010', '2001-05-10', 'luis.quispe@universidad.edu.pe'),
('Laura', 'Rojas', '20202020', '1999-03-12', 'laura.rojas@universidad.edu.pe'),
('Diego', 'Martínez', '30303030', '2000-07-20', 'diego.martinez@universidad.edu.pe'),
('Carmen', 'Fernández', '40404040', '1998-10-01', 'carmen.fernandez@universidad.edu.pe'),
('Miguel', 'Sánchez', '50505050', '2002-01-15', 'miguel.sanchez@universidad.edu.pe'),
('Daniela', 'Reyes', '60606060', '2000-09-09', 'daniela.reyes@universidad.edu.pe'),
('Ricardo', 'Salas', '70707070', '1999-12-21', 'ricardo.salas@universidad.edu.pe'),
('Gabriela', 'Huamán', '80808080', '2001-11-05', 'gabriela.huaman@universidad.edu.pe');

-- Insertar datos en la tabla Curso
INSERT INTO Curso (nombre, creditos) VALUES 
('Matemáticas Básicas', 4),
('Programación I', 5),
('Física General', 4),
('Química General', 3),
('Historia del Perú', 2),
('Algebra Lineal', 4),
('Ética Profesional', 3),
('Cálculo Diferencial', 5);

-- Insertar datos en la tabla Asignatura (relacionada con Curso)
INSERT INTO Asignatura (nombre, idcurso) VALUES 
('Matrices y Determinantes', 1),
('Introducción a la Programación', 2),
('Cinemática', 3),
('Reacciones Químicas', 4),
('Historia Contemporánea', 5),
('Vectores en el Espacio', 6),
('Normas Éticas en la Empresa', 7),
('Derivadas y Límites', 8);

-- Consultar todos los cursos
SELECT * FROM Curso;
