package com.example.UserManagementSystemWithValidations.Service;

import com.example.UserManagementSystemWithValidations.Entity.User;
import com.example.UserManagementSystemWithValidations.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;


    public String addUser(User user) {
        List <User> users = repository.getListOfUsers();

        users.add(user);
        return "User is successfully added..";
    }

    public User getUserById(Integer id) {
        List <User> users = repository.getListOfUsers();
        for(User user : users){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        List<User> users = repository.getListOfUsers();
        return users;
    }

    public String updateUserInfoById(Integer id , String phoneNo) {
        List<User> users = repository.getListOfUsers();

        for(User user : users){
            if(user.getUserId().equals(id)){
                user.setPhoneNo(phoneNo);
            }
        }
        return "User Phone No Updated Successfully..";
    }

    public String deleteUser(Integer userId) {

        for(User user : repository.getListOfUsers()){

            if(user.getUserId().equals(userId)){
                repository.getListOfUsers().remove(user);
                break;
            }

        }
        return "User removed successfully..";
    }
}
