package com.example.services;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CustomerController {

    private final CustomerRepository repository;

    CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customers/read")
    List<Customer> findAll() {
        return repository.findAll();
    }

    @PostMapping("/customers/create")
    Customer createCustomer(@RequestBody Customer newCustomer) {
        return repository.save(newCustomer);
    }

    @PutMapping("/customers/update")
    Customer updateCustomer(@RequestBody Customer newCustomer, @PathVariable Short id) {
        return repository.findById(id).map(customer -> {
            customer.setName(newCustomer.getName());
            return repository.save(customer);
        });
    }

    @DeleteMapping("/customers/delete")
    void deleteCustomer(@PathVariable Short id) {
        repository.deleteById(id);
    }
}