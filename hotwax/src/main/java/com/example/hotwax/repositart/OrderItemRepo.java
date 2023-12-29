package com.example.hotwax.repositart;

import com.example.hotwax.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepo  extends JpaRepository<OrderItem,String> {

    List<OrderItem> findByOrderId(String id);

}
