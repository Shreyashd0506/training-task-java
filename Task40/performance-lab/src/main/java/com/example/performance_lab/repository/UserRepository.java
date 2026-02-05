package com.example.performance_lab.repository;

import com.example.performance_lab.dto.UserOrderDTO;
import com.example.performance_lab.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    // Fetch Join
    @Query("SELECT u FROM User u JOIN FETCH u.orders")
    List<User> findAllWithOrders();

    // DTO Projection
    @Query("""
      SELECT new com.example.performance_lab.dto.UserOrderDTO
      (u.name,o.amount)
      FROM User u JOIN u.orders o
    """)
    List<UserOrderDTO> fetchUserOrdersDTO();
}
