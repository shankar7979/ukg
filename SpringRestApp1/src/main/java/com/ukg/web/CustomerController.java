package com.ukg.web;

import com.ukg.exception.CustomerException;
import com.ukg.model.Customer;
import com.ukg.model.Product;
import com.ukg.repository.CustomerRepository;
import com.ukg.repository.ProductRepository;
import com.ukg.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;


    @RequestMapping("/all")
    public  ResponseEntity<List<Customer>> getAllCustomer() {
        try {
            return new ResponseEntity<List<Customer>>(service.getAllCustomer(), HttpStatus.FOUND);
        }
        catch (CustomerException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    //@RequestMapping(value = "/add", method = RequestMethod.POST)
    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        try {
            return new ResponseEntity<Customer>(service.addCustomer(customer), HttpStatus.CREATED);
        }
        catch (CustomerException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

/*    @Autowired
    private ProductRepository productRepository;

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
     *//*   Optional<Customer> byId = repository.findById(customer.getId());
         if(byId.isPresent()){
             repository.updateCustomer(customer.getName(),customer.getSsn(),customer.getId());
             return  repository.findById(customer.getId()).get();
         }
        return null;*//*

        for (Product p : customer.getProductSet())
            productRepository.save(p);

        return repository.save(customer);
    }


    @GetMapping("/get/{id}")
    public Customer findCustomerById(@PathVariable("id") long id) {
        Optional<Customer> byId = repository.findById(id);
        if (byId.isPresent())
            return byId.get();
        return null;
    }
//http://localhost:9090/get/1

    @GetMapping("/getbyname/")
    public Customer findCustomerByName(@RequestParam("name") String name) {
        return repository.findByName(name);
    }
//http://localhost:9090/getbyname/?name=amit kumar

    @GetMapping("/getbynameandssn/")
    public Customer findCustomerByNameAndSsn(@RequestParam("name") String name,
                                             @RequestParam("ssn") String ssn
    ) {
        return repository.findByNameAndSsn(name, ssn);
    }
    // http://localhost:9090/getbynameandssn/?name=amit kumar&ssn=abc344343

    @DeleteMapping("/deletebyid/{id}")
    public Customer deleteCustomerById(@PathVariable("id") long id) {

        if (repository.findById(id).isPresent()) {
            Customer c = repository.findById(id).get();
            repository.deleteById(id);
            return c;
        }
        return null;
    }*/

}
