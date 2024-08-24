package com.spring.restaurant.service;

import com.spring.restaurant.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    List<Order> getAllOrder();

    Order getOrderById(Long id);

    Order saveOrder(Order order);

    Order updateOrder(Long id, Order updateOrder);

    void deleteOrder(Long id);
}
