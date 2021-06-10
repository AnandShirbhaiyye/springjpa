package com.jpaproject1.springjpa1.controller;

import com.jpaproject1.springjpa1.Repository.CustomerRepository;
import com.jpaproject1.springjpa1.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

     //Query for Insert data:
    @PostMapping("/saveCustomer")
    public Object saveCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return "customer saved";
    }

        //Query for perticular data
       @GetMapping("/displaycustomerproduct")
               public List<Map<String,Object>>getAllCustomersByProduct(){
           return customerRepository.getAllCustomersByProduct();
        }

        //dynamic query
        @GetMapping("/displaycustomer/{name1}/{name2}/{name3}/{name4}")
        public List<Map<String,Object>>getAllCustomers(@PathVariable String name1,@PathVariable String name2,@PathVariable String name3,@PathVariable String name4){
            return customerRepository.getAllCustomers(name1,name2,name3,name4);
        }

        // dynamic query
    @GetMapping("/displaycustprod")
    public List<Map<String,Object>>getAllCustomersByPartucularProduct(@RequestParam List<String>products){
        return customerRepository.getAllCustomersByPartucularProduct(products);
    }

        //get all customers with no products
        @GetMapping("/getCustomersWithNoProducts")
        public List<Map<String,Object>>getAllCustomersWithNoProducts(){
            return customerRepository.getAllCustomersWithNoProducts();
        }

        //get all products not sold
        @GetMapping("/getproductsnotsold")
        public List<Map<String,Object>>getAllProductsNotSold(){
            return customerRepository.getAllProductsNotSold();
        }

}

