package com.example.practicespring.Repository;

import com.example.practicespring.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//    List<Customer> findAllByCustomer_id();
}
