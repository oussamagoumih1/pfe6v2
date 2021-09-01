package com.example.testpfe.service.impl;

import com.example.testpfe.bean.User;
import com.example.testpfe.dao.UserDao;
import com.example.testpfe.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImple  implements UserService {
    @Autowired
    private UserDao userDao;
  /*  @Autowired
    PasswordEncoder encoder;*/


    public Optional<User> findByLogin(String login) {
        return userDao.findByLogin(login);
    }

    public Optional<User> findById(Long id){
        return userDao.findById(id);
    }

    public User save(User user){
        return userDao.save(user);
    }

    public User editePersonnel(User user){
        Optional<User> userFounded = userDao.findById(user.getId());
        if(userFounded.isPresent()){
            userFounded.get().setNom(user.getNom());
            userFounded.get().setPrenom(user.getPrenom());
            userFounded.get().setLogin(user.getLogin());
            userFounded.get().setPhone(user.getPhone());
            userDao.save(userFounded.get());
            return userFounded.get();
        }else
            return null;
    }
    public int block(Long id){
        User user = userDao.findById(id).get();
        user.setBlocked(true);
        userDao.save(user);
        return 1;
    }
/*
    public int reset(Long id){
        User user = userDao.findById(id).get();
        user.setPassword(encoder.encode(user.getLogin()));
        userDao.save(user);
        return 2;
    }*/

    public int deblock(Long id){
        User user = userDao.findById(id).get();
        user.setBlocked(false);
        userDao.save(user);
        return 0;
    }
}
