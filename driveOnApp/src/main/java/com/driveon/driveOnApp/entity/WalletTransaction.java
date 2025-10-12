package com.driveon.driveOnApp.entity;

import com.driveon.driveOnApp.entity.enums.TransactionMethod;
import com.driveon.driveOnApp.entity.enums.TransactionType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

@Entity
public class WalletTransaction extends BaseEntity{

    private Double amount;

    private TransactionType transactionType;

    private TransactionMethod transactionMethod;

    @OneToOne
    private Ride ride;

    private String transactionId;

    @ManyToOne
    private Wallet wallet;
}
