package com.example.hotwax.service.impl;

import com.example.hotwax.dto.AddOrderDto;
import com.example.hotwax.dto.OrderItem;
import com.example.hotwax.dto.OrderResponse;
import com.example.hotwax.dto.ResponseItem;
import com.example.hotwax.entity.OrderHeader;
import com.example.hotwax.entity.OrderPart;
import com.example.hotwax.repositart.OrderItemRepo;
import com.example.hotwax.repositart.OrderPartRepo;
import com.example.hotwax.repositart.OrderRepository;
import com.example.hotwax.repositart.PersonRepository;
import com.example.hotwax.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private OrderPartRepo orderPartRepo;

    @Autowired
    private OrderItemRepo orderItemRepo;

    @Override
    public List<OrderResponse> getAllOrderItems() {
        List<OrderHeader> orderHeaderList = orderRepository.findAll();
    System.out.println(orderHeaderList);
        List<OrderResponse> orderResponseList= new ArrayList<>();
        for (OrderHeader orderHeader : orderHeaderList){
            OrderResponse orderResponse = new OrderResponse(orderHeader.getOrderId(),orderHeader.getOrderName(),orderHeader.getCurrentUnomId(),orderHeader.getSalesChannelEnumId(),orderHeader.getStatusId(),orderHeader.getPlacedDate(),orderHeader.getGrandTotal());
//            orderResponse.getOrderParts().add(orderResponse);
            List<com.example.hotwax.entity.OrderItem> orderItems = orderItemRepo.findByOrderId(orderHeader.getOrderId());
            List<OrderItem> orderItemResponse = OrderItem.fromEntities(orderItems);
            orderResponse.setOrderParts(orderItemResponse);
            orderResponseList.add(orderResponse);
      System.out.println(orderResponse);
        }
        return orderResponseList;
    }

    @Override
    public OrderResponse getOrderItemById(String orderId) {
        OrderHeader orderHeader = orderRepository.findById(orderId).get();
            OrderResponse orderResponse = new OrderResponse(orderHeader.getOrderId(),orderHeader.getOrderName(),orderHeader.getCurrentUnomId(),orderHeader.getSalesChannelEnumId(),orderHeader.getStatusId(),orderHeader.getPlacedDate(),orderHeader.getGrandTotal());
            List<com.example.hotwax.entity.OrderItem> orderItems = orderItemRepo.findByOrderId(orderHeader.getOrderId());
            List<OrderItem> orderItemResponse = OrderItem.fromEntities(orderItems);
    System.out.println(orderItemResponse+"Resoinse");
            orderResponse.setOrderParts(orderItemResponse);
        return orderResponse;
    }

    @Override
    public OrderHeader addOrderItem(OrderHeader orderHeader) {
        return orderRepository.save(orderHeader);
    }

    @Override
    public void deleteOrderItem(String orderId, String orderItemSeqId) {
        orderRepository.deleteById(orderId + orderItemSeqId);
    }

    @Override
    public ResponseItem addItem(AddOrderDto orderRequest) {
        OrderPart orderPart = orderRequest.toEntity(orderRequest);
        List<OrderItem> items = orderRequest.getItemDetails();
        for (OrderItem orderItem : items){
            com.example.hotwax.entity.OrderItem item = orderItem.toEntity(orderItem);
            item.setOrderId(orderRequest.getOrderId());
            orderItemRepo.save(item);
        }
        OrderPart savedOrderPart = orderPartRepo.save(orderPart);
         ResponseItem responseItem = new ResponseItem(savedOrderPart.getOrderId(),savedOrderPart.getOrderPartSeqId());
         return responseItem;
    }

    @Override
    public OrderHeader updateOrder(OrderHeader updatedOrder) {
        return orderRepository.save(updatedOrder);
    }
}
