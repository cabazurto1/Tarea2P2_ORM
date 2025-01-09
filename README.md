# Micro Cursos

Micro Cursos es una aplicación de gestión de cursos y estudiantes, desarrollada con **Spring Boot** y **MySQL**. Este proyecto incluye funcionalidades para crear, leer, actualizar y eliminar información de cursos y estudiantes.

## Características

- Gestión de cursos: creación, consulta, actualización y eliminación.
- Gestión de estudiantes: creación, consulta, actualización y eliminación.
- API RESTful utilizando **Spring Boot**.
- Persistencia de datos con **MySQL**.
- Soporte para contenedor Docker para MySQL.

---

## Requisitos Previos

Antes de ejecutar este proyecto, asegúrate de tener instalados los siguientes requisitos:

- **Java 17** o superior
- **Maven** (para la construcción del proyecto)
- **Docker** (opcional, para ejecutar MySQL en un contenedor)

---

## Configuración del Entorno

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/micro-cursos.git
   cd micro-cursos
2. Docker:
   ```bash
   docker run --name mysql-micro-cursos -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=microcursos -p 3306:3306 -d mysql:latest

