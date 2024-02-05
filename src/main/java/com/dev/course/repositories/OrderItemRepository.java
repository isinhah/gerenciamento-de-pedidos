package com.dev.course.repositories;

import com.dev.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository (opcional)
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
