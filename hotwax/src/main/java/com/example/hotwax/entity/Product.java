package com.example.hotwax.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @Column(name = "PRODUCT_ID", length = 40, nullable = false)
    private String productId;

    @Column(name = "OWNER_PARTY_ID", length = 40)
    private String ownerPartyId;

    @Column(name = "PRODUCT_NAME", length = 255)
    private String productName;

    @Column(name = "DESCRIPTION", length = 4095)
    private String description;

    @Column(name = "CHARGE_SHIPPING", length = 1)
    private Character chargeShipping;

    @Column(name = "RETURNABLE", length = 1)
    private Character returnable;
}
