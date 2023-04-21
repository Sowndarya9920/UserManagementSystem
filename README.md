
# User Management Systems

- The aim of the project is to perform the basic CRUD operations.
- Spring initializer war used to create a spring boot application project.

![Screenshot (103)](https://user-images.githubusercontent.com/112794922/233667518-7e986b7a-9ef9-49e6-a707-39bb27964c52.png)


## Frameworks and Languages used :

- Java
- Spring Boot

## Dependency used :

- Spring web
- Spring Boot Dev Tool

## Data Flow :

## Model : 

- It consists of a User class which consists of Entity's used to model our data application.
- For each of our data , constructors , getters and setters are created.

## Controller : 

- It consists of UserController class which basically control the flow of data.
- @RestController annotation is used to make the UserController class as controller layer.
- @GetMapping , @PostMapping , @PutMapping , @DeleteMapping annotations are used to perform the CRUD operations.




- ### API Reference :

#### Get all Users

```http
  https://localhost:8080/getAllUser
```

#### Get User By userId

```http
  https://localhost:8080/getUserById/{userId}
```

#### Add User

```http
  https://localhost:8080/addUser
```

#### Delete user by userId

```http
  https://localhost:8080/deleteUser/{userId}
```

#### Update Users

```http
  https://localhost:8080/updateUserInfo/{userId}
```

## Service : 

- It consists of UserService class which helps us to write the business functionalities.
- @Service annotation is used to make the class as a service layer.

## Repository :

- It consists of UserDao which is used to manage or datas.
- @Repository annotation is used to make the class repository layer.
 


## Summary :

- In this project , I had created the RestApi's performing various CRUD operations such as fetch , save , delete and update.
- The RestApi's are tested by using Postman which is a client used to test our Api's.

