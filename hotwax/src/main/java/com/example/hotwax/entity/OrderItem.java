package com.example.hotwax.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class OrderItem {
    @Column(name = "ORDER_ID", length = 40, nullable = false)
    private String orderId;

    @Id
    @Column(name = "ORDER_ITEM_SEQ_ID", length = 40, nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String orderItemSeqId;


    @Column(name = "PRODUCT_ID", length = 40)
    private String productId;

    @Column(name = "ITEM_DESCRIPTION")
    private String itemDescription;

    @Column(name = "QUANTITY", precision = 26, scale = 6)
    private BigDecimal quantity;

    @Column(name = "UNIT_AMOUNT", precision = 25, scale = 5)
    private BigDecimal unitAmount;

    @Column(name = "ITEM_TYPE_ENUM_ID", length = 40)
    private String itemTypeEnumId;

    @Column(name = "PARENT_ITEM_SEQ_ID", length = 40)
    private String parentItemSeqId;
}