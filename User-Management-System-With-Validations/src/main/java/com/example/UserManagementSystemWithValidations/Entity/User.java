package com.example.UserManagementSystemWithValidations.Entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor   // It is creating parameterized constructor automatically
@NoArgsConstructor
@Data   // used to create getters and setters for each property
public class User {

    @NotNull(message = "Id should not be null")
    private Integer userId;
    @NotBlank(message = "Name should not be blank")
    private String name;
    @NotBlank(message = "Username should not be null and empty..")
    private String username;
    //    @Pattern( regexp = "^\\d{4}-\\d{2}-\\d{2}$" , message = "Date should be valid with yyyy-mm-dd format with hyphen in between..")
    // I tried this but its not working on local date type
    private LocalDate dob;
    @Email
    private String email;
    @Pattern(regexp = "^\\+\\d{2}\\d{10}$" , message = "Phone no should have 12 digit and first two digits will be county only.")
    private String phoneNo;
    //   @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$" , message = "Date should be valid with yyyy-mm-dd format with hyphen in between.")
    private LocalDate date;
    private LocalTime time;




}
