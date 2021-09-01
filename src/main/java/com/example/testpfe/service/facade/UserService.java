package com.example.testpfe.service.facade;

import com.example.testpfe.bean.User;

import java.util.Optional;

public interface UserService {
     Optional<User> findByLogin(String login);

     Optional<User> findById(Long id);
     public User save(User user);
     public User editePersonnel(User user);
     int block(Long id);
    // int reset(Long id);
     int deblock(Long id);
     }
