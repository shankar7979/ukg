package com.ukg;

import com.ukg.model.Customer;
import com.ukg.model.Product;
import com.ukg.repository.CustomerRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
//@EnableDiscoveryClient

/*public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}*/
public class Main  implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }



  @Autowired
  CustomerRepository customerRepository;

  @Override
  public void run(String... args) {
         Product product[] = new Product[]{
                Product.builder().pname("biscuit").cost(200).build(),
                Product.builder().pname("tea").cost(100).build(),
                Product.builder().pname("sugar").cost(20).build(),
                Product.builder().pname("rice").cost(400).build()
        };

        Set<Product> collect = Stream.of(product).collect(Collectors.toSet());

        Customer customer1 = Customer.builder().ssn("ssn01").name("amit kumar").productSet(collect).build();
        Customer customer2 = Customer.builder().ssn("ssn02").name("sumit kumar").productSet(collect).build();
        customerRepository.save(customer1);
       // customerRepository.save(customer2);
    }
}