package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Admin;
import com.example.testpfe.dao.AdminDao;
import com.example.testpfe.service.facade.AdminService;
import com.example.testpfe.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.Optional;

@Service
public class AdminServiceImple extends AbstractFacade<Admin> implements AdminService {
    @Override
    protected EntityManager getEntityManager() {
        return null;
    }

    @Override
    public Class<Admin> getEntityClass() {
        return Admin.class;
    }

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private UserService userService;

    @Override
    public Optional<Admin> findByLogin(String login) {
        return adminDao.findByLogin(login);
    }

    @Override
    public Boolean existsByLogin(String login) {
        return adminDao.existsByLogin(login);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return adminDao.existsByEmail(email);
    }

    @Override
    public Admin save(Admin user) {
        return adminDao.save(user);
    }
}
