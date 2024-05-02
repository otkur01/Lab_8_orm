package com.cydeo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String firstName;
    private String lastName;
    private String userName;
    @OneToOne(mappedBy = "customer")
    private Balance balance;
    @OneToMany(mappedBy = "customer")
    private List<Address> addressList;
    @OneToMany(mappedBy = "customer")
   private List<Order>orderList;

    @OneToMany(mappedBy = "customer")
    private List<Cart>cartList;


}
