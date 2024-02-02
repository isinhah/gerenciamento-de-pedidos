package com.dev.course.repositories;

import com.dev.course.entities.Category;
import com.dev.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository (opcional)
public interface ProductRepository extends JpaRepository<Product, Long> {

}
