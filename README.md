# library-management

library-management
A simple library management system API built with Spring Boot and Maven.

**Features**
<<<<<<< HEAD

=======
>>>>>>> d350bbe26c1a0b976c1b3ce684fa19a3f70e3ad4
Register a new borrower to the library.
Register a new book to the library.
Get a list of all books in the library.
Borrow a book with a particular book id.
Return a borrowed book.
<<<<<<< HEAD


**Data Models**

=======
**Data Models**
>>>>>>> d350bbe26c1a0b976c1b3ce684fa19a3f70e3ad4
Borrower
id: Unique identifier.
name: Name of the borrower.
email: Email address of the borrower.
<<<<<<< HEAD

**Book**


=======
**Book**
>>>>>>> d350bbe26c1a0b976c1b3ce684fa19a3f70e3ad4
id: Unique identifier.
isbn: ISBN number of the book.
title: Title of the book.
author: Author of the book.
<<<<<<< HEAD


=======
>>>>>>> d350bbe26c1a0b976c1b3ce684fa19a3f70e3ad4
**Prerequisites**
JDK 17 or higher
Docker (optional, for containerization)
Gradle (if not using the provided Gradle Wrapper)
Build and Run the Project
Using maven


**Build the Project**
<<<<<<< HEAD

=======
>>>>>>> d350bbe26c1a0b976c1b3ce684fa19a3f70e3ad4
mvn clean install

#### Run the Project

**Build the Docker Image**
Ensure that Docker is installed and running on your machine.
Build the Docker image using the following command:
docker build -t library-management-system .
<<<<<<< HEAD


=======
>>>>>>> d350bbe26c1a0b976c1b3ce684fa19a3f70e3ad4
**Run the Docker Container**
Run the Docker container from the image you just built:

docker run -p 9191:9090 library-management-system:latest
