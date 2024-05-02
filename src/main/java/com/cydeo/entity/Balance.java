package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long amount;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Customer customer;

    public Balance(Long amount) {
        this.amount = amount;
    }
}
