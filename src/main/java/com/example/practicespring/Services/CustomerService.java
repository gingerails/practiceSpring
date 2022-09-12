package com.example.practicespring.Services;

import com.example.practicespring.Entities.Customer;
import com.example.practicespring.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;


    public List<Customer> printPersonInfo() {
        List<Customer> list = new ArrayList<>();
        customerRepository.findAll().forEach(list::add);
        return list;
    }
}
