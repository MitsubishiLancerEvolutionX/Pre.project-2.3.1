package com.example.crud.service;

import com.example.crud.model.User;
import com.example.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Transactional
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Transactional
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Transactional
    public void addUser (User user) {
        userRepository.addUser(user);
    }

    @Transactional
    public void deleteById(Long id) {
        userRepository.deleteUser(id);
    }
}
