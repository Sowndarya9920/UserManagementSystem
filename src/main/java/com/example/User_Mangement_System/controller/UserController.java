package com.example.User_Mangement_System.controller;

import com.example.User_Mangement_System.model.User;
import com.example.User_Mangement_System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user) {

        return userService.addUser(user);
    }

    @GetMapping(value = "/getAllUser")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/getUserById/{userId}")
    public User getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @PutMapping(value = "/updateUserInfo/{userId}")
    public void updateUser(@PathVariable String userId,@RequestBody User user) {

        userService.updateUser(userId,user);
    }


    @DeleteMapping(value = "/deleteUser/{userId}")
    public String deleteUser(@PathVariable String userId) {

        return userService.deleteUser(userId);
    }
}
