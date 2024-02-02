package com.dev.course.repositories;

import com.dev.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository (opcional)
public interface OrderRepository extends JpaRepository<Order, Long> {

}
