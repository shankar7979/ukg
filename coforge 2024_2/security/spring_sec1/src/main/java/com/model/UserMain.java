package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserMain implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserMain.class,args);
    }

    @Autowired
    UserController userController;

    @Override
    public void run(String... args) throws Exception {
     userController.addUser(User1.builder().name("amit kumar").password("abcd").roles("ADMIN").build());
        userController.userList().forEach(System.out::println);
    }
}
