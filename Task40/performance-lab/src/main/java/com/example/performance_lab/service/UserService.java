package com.example.performance_lab.service;

import com.example.performance_lab.dto.UserOrderDTO;
import com.example.performance_lab.entity.User;
import com.example.performance_lab.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    public List<User> lazyExample() {
        return repo.findAll();   // triggers N+1
    }

    public List<User> fetchJoinExample() {
        return repo.findAllWithOrders();
    }

    public List<UserOrderDTO> dtoExample() {
        return repo.fetchUserOrdersDTO();
    }
}
