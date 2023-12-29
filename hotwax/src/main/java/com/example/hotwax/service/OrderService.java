package com.example.hotwax.service;

import com.example.hotwax.dto.AddOrderDto;
import com.example.hotwax.dto.OrderResponse;
import com.example.hotwax.dto.ResponseItem;
import com.example.hotwax.entity.OrderHeader;

import java.util.List;

public interface OrderService {
    List<OrderResponse> getAllOrderItems();

    OrderResponse getOrderItemById(String orderId);

    OrderHeader addOrderItem(OrderHeader orderItem);

    void deleteOrderItem(String orderId, String orderItemSeqId);

    ResponseItem addItem(AddOrderDto orderRequest);

    OrderHeader updateOrder(OrderHeader updatedOrder);
}