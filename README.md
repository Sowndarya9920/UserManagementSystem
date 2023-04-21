
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

![image](https://user-images.githubusercontent.com/112794922/233675361-7f994481-bdbc-4490-b966-cd9033321863.png)




## Data Flow :

## Model : 

- It consists of a User class which consists of Entity's used to model our data application.
- For each of our data , constructors , getters and setters are created.

![image](https://user-images.githubusercontent.com/112794922/233673901-18e6f12b-9c5e-486c-8e58-fe2a98c4b037.png)



## Controller : 

- It consists of UserController class which basically control the flow of data.
- @RestController annotation is used to make the UserController class as controller layer.
- @GetMapping , @PostMapping , @PutMapping , @DeleteMapping annotations are used to perform the CRUD operations.

![image](https://user-images.githubusercontent.com/112794922/233673979-43bef8e5-0764-4f2f-9a7d-c0bdcb0eb3d7.png)





- ### API Reference :

#### Get all Users

```http
  https://localhost:8080/getAllUser
```

![image](https://user-images.githubusercontent.com/112794922/233674130-20e49b11-26bc-403d-8f9c-587daf3407c8.png)


#### Get User By userId

```http
  https://localhost:8080/getUserById/{userId}
```

![image](https://user-images.githubusercontent.com/112794922/233674270-c46d7e9d-f1aa-4ddb-85f8-94811eddd1f5.png)

#### Add User

```http
  https://localhost:8080/addUser
```

![image](https://user-images.githubusercontent.com/112794922/233674342-92cc9465-04cf-403a-83c3-beff99805e14.png)


#### Delete user by userId

```http
  https://localhost:8080/deleteUser/{userId}
```

![image](https://user-images.githubusercontent.com/112794922/233674402-83280d78-55d9-4d85-90ae-4ae7b10ee79c.png)

#### Update Users

```http
  https://localhost:8080/updateUserInfo/{userId}
```

![image](https://user-images.githubusercontent.com/112794922/233674446-fb1c3484-d67a-4dfa-ad36-faac4153848e.png)


## Service : 

- It consists of UserService class which helps us to write the business functionalities.
- @Service annotation is used to make the class as a service layer.

![image](https://user-images.githubusercontent.com/112794922/233674531-c1839173-94d9-4faf-941d-77ec3e2a5e2b.png)


## Repository :

- It consists of UserDao which is used to manage or datas.
- @Repository annotation is used to make the class repository layer.

![image](https://user-images.githubusercontent.com/112794922/233674582-6cc54712-7c75-4b3e-a218-616fbb1f6b53.png)

 


## Summary :

- In this project , I had created the RestApi's performing various CRUD operations such as fetch , save , delete and update.
- The RestApi's are tested by using Postman which is a client used to test our Api's.

