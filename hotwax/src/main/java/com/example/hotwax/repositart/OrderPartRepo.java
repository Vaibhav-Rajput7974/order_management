package com.example.hotwax.repositart;

import com.example.hotwax.entity.OrderItem;
import com.example.hotwax.entity.OrderPart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface OrderPartRepo extends JpaRepository<OrderPart,String> {
    List<OrderPart> findByOrderId(String orderId);
}
