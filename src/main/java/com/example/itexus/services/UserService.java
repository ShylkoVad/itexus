package com.example.itexus.services;

import com.example.itexus.domain.User;

import java.util.List;


public interface UserService {

    User getUser(int id);

    User createUser(User user);

    User updateUser(int id, User user);

    void deleteUser(int id);

    List<User> getAllUsers();
}
