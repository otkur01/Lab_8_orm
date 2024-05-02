package com.cydeo.entity;

import com.cydeo.enums.CartState;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CartState cartState;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Discount discount;
    @OneToOne
    private Order order;
    @OneToMany(mappedBy = "cart")
    private List<cartItem> cartItem;



}
