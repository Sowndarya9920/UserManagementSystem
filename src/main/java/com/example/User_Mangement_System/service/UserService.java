package com.example.User_Mangement_System.service;

import com.example.User_Mangement_System.model.User;
import com.example.User_Mangement_System.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;


    public String addUser(User user) {
        boolean status = userDao.save(user);
        if(status){
            return " Users added successfully";
        }
        else{
            return " failed to insert users";
        }

    }


    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


    public User getUserById(String userId) {
        List<User> usersNow = userDao.getAllUsers();
        for(User user : usersNow){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    public String deleteUser(String userId) {
        boolean response = false;
            List<User> userNow = userDao.getAllUsers();
            for(User user : userNow) {
                if (user.getUserId().equals(userId)) {
                    response = userDao.remove(user);
                    if (response) {
                        return "User with id" + userId + "was deleted";
                    } else {
                        return "User with id" + userId + "was not deleted";
                    }
                }

            }
            return "Invalid id";
    }


    public void updateUser(String userId, User newUser) {
        User user = getUserById(userId);

        user.setUserId(newUser.getUserId());
        user.setName(newUser.getName());
        user.setUserName(newUser.getUserName());
        user.setAddress(newUser.getAddress());
        user.setPhNo(newUser.getPhNo());


    }
}
