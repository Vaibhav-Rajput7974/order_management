package com.example.hotwax.dto;

import com.example.hotwax.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    private String orderId;
    private String orderName;
    private String currencyUom;
    private String salesChannelEnumId;
    private String statusId;
    private Date placedDate;
    private BigDecimal grandTotal;
    private Person customerDetails;
    private List<OrderItem> orderParts;

    public OrderResponse(String orderId, String orderName, String currencyUom,
                            String salesChannelEnumId, String statusId, Date placedDate, BigDecimal grandTotal ){
        this.orderId = orderId;
        this.orderName = orderName;
        this.currencyUom = currencyUom;
        this.salesChannelEnumId = salesChannelEnumId;
        this.statusId = statusId;
        this.placedDate = placedDate;
        this.grandTotal = grandTotal;
    }
}