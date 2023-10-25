# User-Management-System-With-Validations
User Management System using validations is a Java application built using Maven and the SpringBoot framework.

## Table of Contents

- [Frameworks and Language Used](#frameworks-and-language-used)
- [Dataflow](#dataflow)
- [Data Structure](#data-structure)
- [Project Summary](#project-summary)

## Frameworks and Language Used

- Java: The primary programming language used for developing the application.
- Maven: A build automation tool and dependency management tool used for managing the project's dependencies and building the application.
- SpringBoot: A powerful and widely used framework for building Java-based enterprise applications. It provides features like inversion of control, dependency injection, and seamless integration with various other libraries.

## Dataflow
* Controller : In controller class I have exposed APIs for each operation like addUser , getUser , getAllUsers , updateUserInfo and deleteUser.

* Service : In Service class I have written the logic for each of API method and return it.

* Repository : In Repository class I have acchieved dependency injection for to get list of users from the Beanfactory which is basically a configuration class.

* DataBase Design : For to store deta of users I have used Arraylist as I feel it is easy to manupulate over Arraylist.

## Data Structure
