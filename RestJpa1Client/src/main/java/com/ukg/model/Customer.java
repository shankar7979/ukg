package com.ukg.model;

import lombok.Data;

import java.util.Set;

@Data
public class Customer {

    private long id;
    private String name;
    private String ssn;

    private Set<Product> productSet;

}