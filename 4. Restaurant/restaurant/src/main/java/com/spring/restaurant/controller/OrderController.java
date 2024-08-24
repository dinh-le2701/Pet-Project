package com.spring.restaurant.controller;

import com.spring.restaurant.model.Order;
import com.spring.restaurant.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
//@CrossOrigin(origins = "")
public class OrderController {
    private static Logger log = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @GetMapping("")
    public ResponseEntity<List<Order>> getAllOrder(){
        try {
            List<Order> orders = orderService.getAllOrder();
            log.info("");
            return new ResponseEntity<>(orders, HttpStatus.FOUND);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order){
        try {
            orderService.saveOrder(order);
            log.info(order + "is saved!");
            return new ResponseEntity<>(order, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable("id") Long id){
        try {
            Order order = orderService.getOrderById(id);
            log.info(order + " has found!");
            return new ResponseEntity<>(order, HttpStatus.FOUND);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") Long id){
        try {
            orderService.deleteOrder(id);
            log.info("Order deleted has id: " + id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
