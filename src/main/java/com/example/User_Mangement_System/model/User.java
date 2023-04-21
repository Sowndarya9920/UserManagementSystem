package com.example.User_Mangement_System.model;

public class User {
    private String userId;
    private String name;
    private String userName;
    private String Address;
    private String phNo;

    public User(String userId, String name, String userName, String address, String phNo) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        Address = address;
        this.phNo = phNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }
}
