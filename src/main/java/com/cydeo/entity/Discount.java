package com.cydeo.entity;

import com.cydeo.enums.DiscountType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal discount;
    @Enumerated(EnumType.STRING)
     private DiscountType discountType;
     private String name;
    @OneToMany(mappedBy = "discount")
     private List<Cart> cart;



}
