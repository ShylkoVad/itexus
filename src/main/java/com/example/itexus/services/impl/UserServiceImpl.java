package com.example.itexus.services.impl;

import com.example.itexus.domain.User;
import com.example.itexus.repositories.UserRepository;
import com.example.itexus.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format("Пользователя с id %d не найдено.", id)));
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(int id, User user) {
        // Проверяем существование пользователя перед обновлением
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format("Пользователя с id %d не найдено.", id)));

        // Обновляем поля пользователя
        existingUser.setFirst_name(user.getFirst_name());
        existingUser.setLast_name(user.getLast_name());
        existingUser.setEmail(user.getEmail());
        existingUser.setRoles(user.getRoles());
        existingUser.setPhoneNumbers(user.getPhoneNumbers());

        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
