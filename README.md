# iCET - Demo Spring Boot Application - (03)

This project is a Java Spring Boot application designed for academic purposes as a backend for student registration. It includes functionalities for managing student records with a RESTful API. The application connects to a MySQL database to store student information.

## Features

- Add new students

## Technologies Used

- Java 17
- Spring Boot 3.2.5
- Spring Data JPA
- MySQL
- Lombok
- Maven

## Getting Started

### Prerequisites

- Java 17
- Maven
- MySQL

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/student-registration-backend.git
    cd student-registration-backend
    ```

2. Configure the database:

    Update the `application.yml` file in the `src/main/resources` directory with your MySQL database credentials.

    ```yaml
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/student_crm
        username: root
        password: yourpassword
      jpa:
        hibernate:
          ddl-auto: update
    ```

3. Build the project:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

## API Endpoints

### Add a new student

- **URL:** `/student`
- **Method:** `POST`
- **Request Body:**

    ```json
    {
      "studentId": 1,
      "firstName": "John",
      "lastName": "Doe",
      "province": "Ontario"
    }
    ```

- **Response:**

    ```json
    {
      "studentId": 1,
      "firstName": "John",
      "lastName": "Doe",
      "province": "Ontario"
    }
    ```

## Project Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   └── edu/icet/demo/
│   │       ├── Main.java
│   │       ├── controller/
│   │       │   └── StudentController.java
│   │       ├── entity/
│   │       │   └── StudentEntity.java
│   │       ├── model/
│   │       │   └── Student.java
│   │       ├── repository/
│   │       │   └── StudentRepository.java
│   │       ├── service/
│   │       │   ├── StudentService.java
│   │       │   └── StudentServiceImpl.java
│   └── resources/
│       ├── application.yml
│       └── static/
│       └── templates/
├── test/
│   └── java/
│       └── edu/icet/demo/
│           └── MainTests.java
└── pom.xml
