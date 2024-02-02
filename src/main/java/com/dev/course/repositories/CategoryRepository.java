package com.dev.course.repositories;

import com.dev.course.entities.Category;
import com.dev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository (opcional)
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
