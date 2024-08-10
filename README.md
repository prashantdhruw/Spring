# Spring Boot REST API with MongoDB

This is a simple Spring Boot REST API project that demonstrates CRUD operations for managing employee data using MongoDB as the database.

## Features

- **Create Employee:** Add a new employee record.
- **Get All Employees:** Retrieve a list of all employees.
- **Get Employee by ID:** Fetch an employee by their unique ID.
- **Error Handling:** Includes global exception handling for scenarios like employee not found.
- **Validation:** Uses Bean Validation to ensure data integrity.
- **Logging:** Utilizes SLF4j for logging application events.

## Technologies Used

- Spring Boot
- Spring Data MongoDB
- MongoDB
- Lombok
- Spring Validation
- SLF4j

## Prerequisites

- Java 17 or higher
- MongoDB installed and running on localhost:27017 (or configure the connection URI in `application.properties`)
- Maven

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/prashantdhruw/Spring.git
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

| Method | Endpoint          | Description                                  |
| ------- | ---------------- | -------------------------------------------- |
| POST    | `/employees`      | Create a new employee.                       |
| GET     | `/employees`      | Retrieve all employees.                      |
| GET     | `/employees/{id}` | Retrieve an employee by their ID.            |


## Example Request (Create Employee)

```json
{
  "name": "Prashant Dhruw",
  "age": 25,
  "salary": 60000
}
```

## Configuration

- The MongoDB connection URI can be configured in `src/main/resources/application.properties`.
- The database name is set to `TestDB`.

## Future Enhancements

- Implement update and delete operations for employees.
- Add pagination and sorting for the list of employees.
- Implement security features for authentication and authorization.
- Write more comprehensive unit and integration tests.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.
