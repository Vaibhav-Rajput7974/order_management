package com.example.hotwax.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class OrderPart {
    @Column(name = "ORDER_ID", length = 40, nullable = false)
    private String orderId;

    @Id
    @Column(name = "ORDER_PART_SEQ_ID", length = 40, nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String orderPartSeqId;

    @Column(name = "PART_NAME", length = 255)
    private String partName;

    @Column(name = "STATUS_ID", length = 40)
    private String statusId;

    @Column(name = "VENDOR_PARTY_ID", length = 40)
    private String vendorPartyId;

    @Column(name = "CUSTOMER_PARTY_ID", length = 40)
    private String customerPartyId;

    @Column(name = "PART_TOTAL", precision = 24, scale = 4)
    private BigDecimal partTotal;


    @Column(name = "FACILITY_ID", length = 40)
    private String facilityId;

    @Column(name = "SHIPMENT_METHOD_ENUM_ID", length = 40)
    private String shipmentMethodEnumId;

}
