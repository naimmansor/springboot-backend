package com.money.manager.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "accounts")
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountID;
    private Integer userID; // Using Integer to handle null values
    private String accountName;
    private String accountType;
    private double balance;
    private String currency;

}
