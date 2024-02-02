package com.dev.course.services;

import com.dev.course.entities.Order;
import com.dev.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Optional<Order> findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return Optional.of(obj.get());
    }
}
