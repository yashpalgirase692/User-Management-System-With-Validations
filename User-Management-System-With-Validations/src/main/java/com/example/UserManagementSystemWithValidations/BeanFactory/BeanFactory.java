package com.example.UserManagementSystemWithValidations.BeanFactory;

import com.example.UserManagementSystemWithValidations.Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public List<User> getListOfUser(){
        return new ArrayList<User>();
    }


}