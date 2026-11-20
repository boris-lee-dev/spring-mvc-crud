# Spring MVC CRUD Application

A web application for managing users with full CRUD (Create, Read, Update, Delete) functionality built with Spring MVC, Hibernate ORM, and Thymeleaf without Spring Boot.

## Tech Stack

* **Java 17** — programming language.
* **Spring Framework 5.3.22** (Spring MVC) — web framework and IoC/DI container.
* **Hibernate 5.6.11.Final** — ORM and JPA implementation for relational database access.
* **Hibernate Validator 6.2.5.Final** (`javax.validation` + EL 3.0) — server-side form and bean validation (`@NotBlank`, `@Size`, `@Email`, `@Valid`, `BindingResult`).
* **Apache Tomcat 9.0** — servlet container and application server (`javax.*` compatibility).
* **MySQL 8.0** — relational database.
* **Maven** — build automation and dependency management tool.
* **HTML / Thymeleaf** — view templates and form error rendering (`th:errors`, `th:field`).

## Project Structure & Configuration

* **Java-based configuration (`web.config`)**: `AppInit`, `HibernateConfig`, and `WebConfig` without XML configuration files.
* **Layered architecture**: `controller`, `service`, `dao` (`UserDao` / `UserDaoImpl`), and `model` (`User`)
* **Views**: Thymeleaf templates located in `src/main/webapp/WEB-INF/pages/` (`users.html`, `new.html`, `edit.html`)
* **Database configuration**: connection settings in `src/main/resources/db.properties` (`allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC`)

## Getting Started

1. Make sure you have **Java 17**, **Maven**, **MySQL 8.0**, and **Apache Tomcat 9.0** installed.
2. Create a database in MySQL (or match the database name in `src/main/resources/db.properties`)
   ```sql
   CREATE DATABASE crud_app_db;

Update your database username, password, and URL in src/main/resources/db.properties

Open the project in IntelliJ IDEA and reload Maven dependencies.

Configure a local Apache Tomcat 9 run configuration, add the WAR exploded artifact (/ application context), and start the server.

Open http://localhost:8080/users in your browser.