package com.example.hotwax.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    private String productId;
    private String itemDescription;
    private BigDecimal quantity;
    private BigDecimal unitAmount;

    public static List<OrderItem> fromEntities(List<com.example.hotwax.entity.OrderItem> orderItems) {
        return orderItems.stream()
                .map(OrderItem::fromEntity)
                .collect(Collectors.toList());
    }

    public static OrderItem fromEntity(com.example.hotwax.entity.OrderItem orderItem) {
        OrderItem orderItemRequest = new OrderItem();
        orderItemRequest.setProductId(orderItem.getProductId());
        orderItemRequest.setItemDescription(orderItem.getItemDescription());
        orderItemRequest.setQuantity(orderItem.getQuantity());
        orderItemRequest.setUnitAmount(orderItem.getUnitAmount());
        return orderItemRequest;
    }

    public static com.example.hotwax.entity.OrderItem toEntity(OrderItem orderItemRequest){
        com.example.hotwax.entity.OrderItem orderItem = new com.example.hotwax.entity.OrderItem();
    orderItem.setProductId(orderItemRequest.getProductId());
    orderItem.setItemDescription(orderItemRequest.getItemDescription());
    orderItem.setQuantity(orderItemRequest.getQuantity());
    orderItem.setUnitAmount(orderItemRequest.getUnitAmount());
    return orderItem;
    }
}
