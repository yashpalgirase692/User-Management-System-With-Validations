package com.example.UserManagementSystemWithValidations.Repository;

import com.example.UserManagementSystemWithValidations.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    @Autowired
    List <User> users;

    public List<User> getListOfUsers() {
        return users;
    }



}