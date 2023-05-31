package com.example.aws_sample.controller;

import com.example.aws_sample.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController("/")
public class MainController {

    @GetMapping
    public List<User> getAllUsers(){

        List<User> userList= new ArrayList<>();
        userList.add(new User(1,"Sachin","9879"));
        userList.add(new User(2,"Chandan","2445"));
        userList.add(new User(3,"Ranveer","3565"));
        userList.add(new User(4,"Satyam","8765"));

        return  userList;
    }


}

