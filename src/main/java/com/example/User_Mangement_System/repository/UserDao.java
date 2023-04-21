package com.example.User_Mangement_System.repository;

import com.example.User_Mangement_System.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    private List<User> userList;

    public UserDao(){
        userList = new ArrayList<>();
        userList.add(new User("1","Sai Yogith","Sai","Ooty,The Nilgiris,TamilNadu","xxxxxxxxxx"));
    }

    public boolean save(User user) {
        userList.add(user);
        return true;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public boolean remove(User user) {
        userList.remove(user);
        return true;
    }
}
