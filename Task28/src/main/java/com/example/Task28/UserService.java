package com.example.Task28;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // SLF4J Logger
    private static final Logger logger =
            LoggerFactory.getLogger(UserService.class);

    public String getUserById(int id) {

        logger.trace("Entered getUserById() method");
        logger.debug("Fetching user with id: {}", id);

        if (id <= 0) {
            logger.error("Invalid user id received: {}", id);
            throw new IllegalArgumentException("Invalid ID");
        }

        logger.info("User fetched successfully");
        return "User ID: " + id;
    }
}
