# Spring Boot Patient Management System

This is a simple patient management application built with **Spring Boot**, **H2 Database**, and **JPA**. It allows you to perform basic CRUD operations (Create, Read, Update, Delete) on patient records.


##  Project Structure

<img alt="Project Structure" height="224" src="C:\Users\HP\Documents\Master\M2\Systems Distribues\TP\PROJET\TP2\images\img_1.png" width="224"/>

##  Features

- Add new patients
- Update patient info
- Delete patients
- View all patients
- Filter by:
  - Name (contains keyword)
  - Malade (sick) status
- In-memory H2 database
- RESTful API using Spring Web


##  Technologies

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok
- IntelliJ IDEA

---

##  API Endpoints

| Method | Endpoint                | Description            |
|--------|-------------------------|------------------------|
| GET    | `/patients`             | Get all patients       |
| GET    | `/patients/{id}`        | Get patient by ID      |
| POST   | `/patients`             | Add a new patient      |
| PUT    | `/patients`             | Update a patient       |
| DELETE | `/patients/{id}`        | Delete a patient       |
| GET    | `/patients/search/{nom}`| Search by name         |
| GET    | `/patients/malade/{bool}` | Search by maladie     |

---

## Sample Data (in `Tp2Application.java`)

<img alt="Patient Project Screenshot" height="224" src="C:\Users\HP\Documents\Master\M2\Systems Distribues\TP\PROJET\TP2\images\img.png" width="224"/>


## How to Run
1. Clone the repository:
bash
Copier
Modifier
git clone https://github.com/YOUR-USERNAME/spring-boot-patient-app.git
cd spring-boot-patient-app

2. Open in IntelliJ IDEA

3. Run Tp2Application.java or use:
bash
Copier
Modifier
./mvnw spring-boot:run

4. Access:
H2 Console: http://localhost:8083/h2-console


🧠 Author
👩‍💻 Fatima – Student in Master AI & Data Science
📬 LinkedIn :https://www.linkedin.com/in/fatima-al-b11039263/

