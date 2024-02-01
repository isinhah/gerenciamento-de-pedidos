package com.dev.course.repositories;

import com.dev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository (opcional)
public interface UserRepository extends JpaRepository<User, Long> {

}
