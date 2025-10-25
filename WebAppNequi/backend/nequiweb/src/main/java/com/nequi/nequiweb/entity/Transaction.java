package com.nequi.nequiweb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Integer transaction_id;

    @Column(name = "transaction_date")
    private LocalDateTime transaction_date;

    @Column(name = "description")
    private String description;

    @Column(name = "available_balance", precision = 15, scale = 2)
    private BigDecimal available_balance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_account")
    private Account sender_account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_account")
    private Account receiver_account;

    @Column(name = "transaction_value", nullable = false, precision = 15, scale = 2)
    private BigDecimal transaction_value;

    @PrePersist
    protected void onCreate() {
        transaction_date = LocalDateTime.now();
    }
}
