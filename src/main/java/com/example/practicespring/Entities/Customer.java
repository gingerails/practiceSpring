package com.example.practicespring.Entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
public class Customer {
    @Id
    private Integer customer_id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "birth_date")
    private String birth_date;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "points")
    private Integer points;


    @Override
    public String toString() {
        return "Customer [customer_id=" + customer_id + ", first_name=" + first_name + "]";
    }

}

//
//@Table(name = "items")
//public class Item {
//    @Id
//    private String ID;
//    @Column("Description")
//    private String description;
//    @Column("Brand")
//    private String brand;
//    @Column("Price")
//    private double price;
//}