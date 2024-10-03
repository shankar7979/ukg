package com.javatechie;

import com.javatechie.controller.ProductController;
import com.javatechie.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringSecurityLatestApplication  implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(SpringSecurityLatestApplication.class, args);

    }

    @Autowired
    ProductController productController;

    @Override
    public void run(String... args) throws Exception {
        productController.addNewUser(UserInfo.builder().name("ram kumar").email("ram@gmail.com").roles("USER").password("abcd").build());
        productController.addNewUser(UserInfo.builder().name("shyam kumar").email("ram@gmail.com").roles("ADMIN").password("abcd").build());

         Arrays.asList(new UserInfo[]{
                 UserInfo.builder().name("ram kumar").email("ram@gmail.com").roles("user").password("abcd").build(),
                 UserInfo.builder().name("ram kumar").email("ram@gmail.com").roles("user").password("abcd").build(),
         });
    }
}
//ProductController -- comment @PreAuthorize
//http://localhost:9192/products/welcome
//http://localhost:9192/products/all

