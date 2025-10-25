package com.nequi.nequiweb.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "movements")
public class Movement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movement_id")
    private Integer movement_id;

    @Column(name = "purchase_id")
    private Integer purchase_id;

    @Column(name = "payment_id")
    private Integer payment_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;
}