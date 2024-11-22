
# Job Management System - CRUD Application

This is a Java Spring Boot application for managing job details. The application provides a complete set of CRUD (Create, Read, Update, Delete) operations for managing jobs.

## Features

- Create a job with:
  - **Title**  
  - **Job Description**  
  - **Minimum Salary**  
  - **Maximum Salary**  
  - **Location**  
- Retrieve all jobs or specific job details by ID.  
- Update existing job details.  
- Delete jobs.  

## Technologies Used

- **Backend Framework:** Spring Boot  
- **Database:** H2 (In-memory database for development) or any relational database (e.g., MySQL, PostgreSQL)  
- **Java Version:** 17  
- **Build Tool:** Maven  

---

## Setup Instructions

Follow these steps to clone and run the project:

### Prerequisites

- **Java JDK 17+**  
- **Maven 3.6+**  

### 1. Clone the Repository
```bash
git clone https://github.com/Rohansaini1512/CRUD-Operation-using-JavaSpringBoot.git
cd job-crud-application
```

### 2. Build the Application
```bash
mvn clean install
```

### 3. Run the Application
```bash
mvn spring-boot:run
```

The application will start running on **`http://localhost:9091`** by default.

---

## API Endpoints

Here are the endpoints available for the application:

### 1. **Retrieve All Jobs**
- **GET** `/jobs`
- **Description:** Fetch all job records.

### 2. **Retrieve Job by ID**
- **GET** `/jobs/{id}`
- **Description:** Fetch a specific job record by its ID.

### 3. **Create a Job**
- **POST** `/jobs`
- **Request Body Example:**
  ```json
  {
    "title": "Software Engineer",
    "description": "Responsible for designing and developing software.",
    "minSalary": 60000,
    "maxSalary": 120000,
    "location": "Remote"
  }
  ```

### 4. **Update a Job**
- **PUT** `/jobs/{id}`
- **Request Body Example:**
  ```json
  {
    "title": "Senior Software Engineer",
    "description": "Leads the software development team.",
    "minSalary": 80000,
    "maxSalary": 150000,
    "location": "New York"
  }
  ```

### 5. **Delete a Job**
- **DELETE** `/jobs/{id}`
- **Description:** Deletes a specific job record by its ID.

---

## License
