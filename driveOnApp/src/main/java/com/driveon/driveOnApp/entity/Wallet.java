package com.driveon.driveOnApp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Wallet extends BaseEntity{

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    private Double balance;

    @OneToMany(mappedBy = "wallet", fetch = FetchType.LAZY)
    private List<WalletTransaction> transactions;
}

