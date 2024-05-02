package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;

    private Integer quantity;

    private Integer remainingQuantity;
    @OneToMany(mappedBy ="product" )
    private List<cartItem>cartItemList;

    @ManyToMany
    private List<Category> categoryList;
}
