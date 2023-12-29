package com.example.hotwax.controller;

import com.example.hotwax.dto.AddOrderDto;
import com.example.hotwax.dto.OrderResponse;
import com.example.hotwax.dto.ResponseItem;
import com.example.hotwax.entity.OrderHeader;
import com.example.hotwax.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/order-item")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<OrderResponse> getAllOrderItems() {
        return orderService.getAllOrderItems();
    }

    @GetMapping("/{orderId}")
    public OrderResponse getOrderItemById(@PathVariable String orderId) {
        return orderService.getOrderItemById(orderId);
    }
    @PostMapping
    public OrderHeader addOrder(@RequestBody OrderHeader orderItem) {
        return orderService.addOrderItem(orderItem);
    }

    @PostMapping("/add-item")
    public ResponseItem addItem(@RequestBody AddOrderDto addOrderDto){
        return orderService.addItem(addOrderDto);
    }

    @PutMapping
    public OrderHeader updateOrder(@RequestBody OrderHeader updatedOrder){
        return orderService.updateOrder(updatedOrder);
    }

    @DeleteMapping("/{orderId}/{orderItemSeqId}")
    public void deleteOrderItem(@PathVariable String orderId, @PathVariable String orderItemSeqId) {
        orderService.deleteOrderItem(orderId, orderItemSeqId);
    }
}
