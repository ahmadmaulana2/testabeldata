/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ptxyz.springboot.controller;

import java.util.List;
import net.ptxyz.springboot.model.Customer;
import net.ptxyz.springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ahmad Maulana
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class CustomerController {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    // get all customer
    @GetMapping("/customer")
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
    
    // create customer rest api
    @PostMapping("/customer")
    public Customer createEmployee(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
