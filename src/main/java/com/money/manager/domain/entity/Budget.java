package com.money.manager.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "budgets")
@Getter
@Setter
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int budgetID;
    private Integer userID; // Using Integer to handle null values
    private Integer categoryID; // Using Integer to handle null values
    private double amount;
    private Date startDate;
    private Date endDate;

}
