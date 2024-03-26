# Spring MongoDB Boilerplate

This project is a Spring Boot application designed for managing items in a MongoDB database running in a Docker container. It allows for creating, reading, updating, and deleting (CRUD) items via a RESTful API.

## Prerequisites

Before you begin, ensure you have installed all the following prerequisites on your development machine:

- Java JDK 21
- Maven
- Docker

## Quick Start

Follow these steps to get your application up and running:

1. **Clone the Repository**

    ```sh
    git clone https://your-repository-url-here.git
    cd spring-mongodb-boilerplate
    ```

2. **Build the Project**

   Use Maven to build and package the application.

    ```sh
    mvn package
    ```

3. **Start the Application**

   Run the application along with MongoDB using Docker Compose.

    ```sh
    docker-compose up --build
    ```

   This command builds and starts the containers defined in your `docker-compose.yml`, including your Spring Boot application and MongoDB.

## Usage

The application supports several REST endpoints for interacting with item resources. Use the following `curl` commands to perform CRUD operations:

- **Create an Item**

    ```sh
    curl -X POST http://localhost:8080/items \
    -H "Content-Type: application/json" \
    -d '{"name": "New Item", "description": "Description of the new item"}'
    ```

- **Read All Items**

    ```sh
    curl -X GET http://localhost:8080/items
    ```

- **Read an Item by ID**

  Replace `{ID}` with the actual item ID.

    ```sh
    curl -X GET http://localhost:8080/items/{ID}
    ```

- **Update an Item**

  Replace `{ID}` with the item's ID you want to update.

    ```sh
    curl -X PUT http://localhost:8080/items/{ID} \
    -H "Content-Type: application/json" \
    -d '{"name": "Updated Item Name", "description": "Updated item description"}'
    ```

- **Delete an Item**

  Replace `{ID}` with the item's ID you wish to delete.

    ```sh
    curl -X DELETE http://localhost:8080/items/{ID}
    ```

## Technology Stack

- **Java Version**: JDK 21
- **Spring Boot Version**: 3.2.4
- **Database**: MongoDB
- **Containerization**: Docker

