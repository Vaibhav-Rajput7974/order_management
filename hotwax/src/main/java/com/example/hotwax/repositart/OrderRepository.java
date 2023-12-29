package com.example.hotwax.repositart;


import com.example.hotwax.entity.OrderHeader;
import com.example.hotwax.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderHeader, String> {
}
