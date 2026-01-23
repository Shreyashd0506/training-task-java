package com.example.Task34;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteUser(id);
        return "Deleted";
    }
}
