package com.example.UserManagementSystemWithValidations.Controller;

//import ch.qos.logback.core.joran.event.SaxEventRecorder;
import com.example.UserManagementSystemWithValidations.Entity.User;
import com.example.UserManagementSystemWithValidations.Service.Service;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {
    @Autowired
    Service service;

    @PostMapping("user")
    public String addUser( @Valid @RequestBody User user){
        return service.addUser(user);
    }

    @GetMapping("user/userId/{userId}")
    public User getUserById( @Valid @NotNull @PathVariable Integer userId){
        return service.getUserById(userId);
    }
    @GetMapping("users")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @PutMapping("user/id/{id}/phoneNo/{phoneNo}")
    public String updateUserInfoById(@Valid @NotNull @PathVariable Integer id , @Valid @Pattern(regexp = "^\\+\\d{2}\\d{10}$" , message = "Phone no should have 12 digit and first two digits will be county only.") @PathVariable  String phoneNo ){
        return service.updateUserInfoById(id , phoneNo);
    }

    @DeleteMapping("user/{userId}")
    public String deleteUser(@Valid @NotNull @PathVariable Integer userId){
        return service.deleteUser(userId);
    }
}