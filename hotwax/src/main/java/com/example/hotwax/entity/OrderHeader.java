package com.example.hotwax.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class OrderHeader {
    @Id
    @Column(name = "ORDER_ID", length = 40, nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String orderId;

    @Column(name = "ORDER_NAME", length = 255)
    private String orderName;

    @Column(name = "PLACED_DATE")
    private Date placedDate;

    @Column(name = "APPROVED_DATE")
    private Date approved_date;

    @Column(name = "STATUS_ID", length = 40)
    private String statusId;

    @Column(length = 40)
    private String currentUnomId;

    @Column(length = 40)
    private String storeId;

    @Column(name = "SALES_CHANNEL_ENUM_ID", length = 40)
    private String salesChannelEnumId;

    @Column(columnDefinition = "decimal(24,4) DEFAULT NULL")
    private BigDecimal grandTotal;

    @Column(name = "COMPLETED_DATE")
    private Date completedDate;
}
