
package com.ukg.web;

import com.ukg.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CustomerController {

    RestTemplate restTemplate=new RestTemplate();

    @GetMapping("/allCustomer")
    public ResponseEntity<Customer[]>  getAllCustomer(){
        ResponseEntity<Customer[]> c= restTemplate.getForEntity("http://localhost:7070/all",Customer[].class);
         return  c;
    }

}
