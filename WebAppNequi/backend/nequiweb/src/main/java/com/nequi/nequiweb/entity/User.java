package com.nequi.nequiweb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "identification", nullable = false, length = 20)
    private String identification;

    @Column(name = "account_id", nullable = false)
    private Integer accountId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role", nullable = false)
    private Role role;

    @Column(name = "identification_type", nullable = false, length = 10)
    private String identificationType;

    @Column(name = "names", nullable = false, length = 100)
    private String names;

    @Column(name = "email", nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "cellphone", nullable = false, length = 15)
    private String cellphone;

   
}
