# 👨‍💻 Software Engineer CRUD API (Spring Boot + PostgreSQL)

A simple **CRUD REST API** built with **Spring Boot**, **Spring Data JPA**, and **PostgreSQL**.  
This project demonstrates a clean 3-layer architecture (Controller → Service → Repository) with a Dockerized PostgreSQL database.

---

## 🚀 Features
- Create, Read, Update, and Delete (CRUD) operations on `SoftwareEngineer` entities
- REST endpoints returning JSON responses
- Spring Data JPA for database access (no boilerplate SQL)
- PostgreSQL database (running via Docker)

## 🛠️ Tech Stack
- **Java 21**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data JPA**
- **PostgreSQL** (Docker container)
- **Maven**

| Method | Endpoint                          | Description           |
| ------ | --------------------------------- | --------------------- |
| GET    | `/api/v1/software-engineers`      | Get all engineers     |
| GET    | `/api/v1/software-engineers/{id}` | Get engineer by ID    |
| POST   | `/api/v1/software-engineers`      | Create new engineer   |
| PUT    | `/api/v1/software-engineers/{id}` | Update engineer by ID |
| DELETE | `/api/v1/software-engineers/{id}` | Delete engineer by ID |
