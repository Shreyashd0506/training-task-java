package com.example.Task34;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //  CACHEABLE → DB hit only first time
    @Cacheable(value = "users", key = "#id")
    public User getUserById(Long id) {
        System.out.println("Fetching user from DATABASE...");
        return userRepository.findById(id).orElse(null);
    }

    //  CACHEPUT → updates cache after DB update
    @CachePut(value = "users", key = "#user.id")
    public User updateUser(User user) {
        System.out.println("Updating user in DATABASE...");
        return userRepository.save(user);
    }

    //  CACHEEVICT → removes cache entry
    @CacheEvict(value = "users", key = "#id")
    public void deleteUser(Long id) {
        System.out.println("Deleting user from DATABASE...");
        userRepository.deleteById(id);
    }
}
