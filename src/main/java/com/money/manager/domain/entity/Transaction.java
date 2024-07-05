package com.money.manager.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "transactions")
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionID;
    private Integer userID; // Using Integer to handle null values
    private Integer accountID; // Using Integer to handle null values
    private Integer categoryID; // Using Integer to handle null values
    private double amount;
    private TransactionType transactionType;
    private String description;
    private Date transactionDate;
    private Date createdAt;

}
