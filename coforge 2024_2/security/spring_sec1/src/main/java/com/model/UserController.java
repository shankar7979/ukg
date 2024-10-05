package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController  {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/all")
    public List<User1> userList(){
        return  userRepo.findAll();
    }

    @PostMapping("/new")
    public User1 addUser(@RequestBody User1 user){
       return userRepo.save(user);
    }

}