package com.spring.restaurant.service.serviceimpl;

import com.spring.restaurant.model.Order;
import com.spring.restaurant.repository.OrderRepository;
import com.spring.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id){
        return orderRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Not found order has id: " + id));
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Long id, Order updateOrder) {
        Order order = orderRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Not found order has id: " + id));
        order.setCustomer_name(updateOrder.getCustomer_name());
        order.setEmail(updateOrder.getEmail());
        order.setTown(updateOrder.getTown());
        order.setCountry(updateOrder.getCountry());
        order.setZipcode(updateOrder.getZipcode());
        order.setPhone_number(updateOrder.getPhone_number());
        order.setAddress(updateOrder.getAddress());

        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
