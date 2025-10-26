package com.nequi.nequiweb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "provider")
public class ProviderNequi {
    @Id
    @Column(name = "provider_id", nullable = false, length = 20)
    private String provider_id;

    @Column(name = "business_name", nullable = false, length = 255)
    private String business_name;

    @Column(name = "description")
    private String description;
}
