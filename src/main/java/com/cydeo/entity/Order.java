package com.cydeo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal paidPrice;
    private BigDecimal totalPrice;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Cart cart;
    @ManyToOne
    private Customer customer;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Payment payment;



}
