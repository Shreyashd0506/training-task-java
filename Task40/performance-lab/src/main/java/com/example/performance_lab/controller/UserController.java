package com.example.performance_lab.controller;

import com.example.performance_lab.dto.UserOrderDTO;
import com.example.performance_lab.entity.User;
import com.example.performance_lab.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    @GetMapping("/lazy")
    public List<User> lazy() {
        return service.lazyExample();
    }

    @GetMapping("/fetch")
    public List<User> fetchJoin() {
        return service.fetchJoinExample();
    }

    @GetMapping("/dto")
    public List<UserOrderDTO> dto() {
        return service.dtoExample();
    }
}
