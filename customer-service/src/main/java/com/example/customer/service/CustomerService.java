package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

//    public Customer updateCustomer(String id, Customer customer) {
//        customer.setId(id);
//        return customerRepository.save(customer);
//    }

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
