package com.example.demo.service;

import com.example.demo.models.User;

public interface UserService {
    Iterable<User> findAll();

    User findOne(Long id);

    void deleteUser(Long id);

    void updateUser(User user);
}
