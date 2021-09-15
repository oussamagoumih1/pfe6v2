package com.example.testpfe.service.impl;

import com.example.testpfe.bean.ChefDepartment;
import com.example.testpfe.dao.ChefDepartmentDao;
import com.example.testpfe.service.facade.ChefDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ChefDepartmentServiceImpl implements ChefDepartmentService {
    @Autowired
    private ChefDepartmentDao chefDepartmentDao;

    @Override
    public ChefDepartment findByCode(String code) {
        return chefDepartmentDao.findByCode(code);
    }

    @Override
    public Optional<ChefDepartment> findById(Long id) {
        return chefDepartmentDao.findById(id);
    }

    @Override
    public int deleteByCode(String code) {
        return chefDepartmentDao.deleteByCode(code);
    }

    @Override
    public List<ChefDepartment> findAll() {
        return chefDepartmentDao.findAll();
    }

    @Override
    public ChefDepartment save(ChefDepartment chefDepartment) {
        if (findByCode(chefDepartment.getCode()) != null) {
            return null;
        } else {
            chefDepartmentDao.save(chefDepartment);
            return chefDepartment;
        }
    }

    @Override
    public ChefDepartment findByLogin(String login) {
        return chefDepartmentDao.findByLogin(login);
    }

    @Override
    public ChefDepartment seconnecter(ChefDepartment chefDepartment) {
        ChefDepartment foundChefDepartment = this.chefDepartmentDao.findByLogin(chefDepartment.getLogin());
        if (foundChefDepartment == null) {
            return null;
        } else if (!foundChefDepartment.getPassword().equals(chefDepartment.getPassword())) {
            return null;
        } else {
            return foundChefDepartment;
        }
    }

    @Override
    public ChefDepartment update(ChefDepartment chefDepartment) {
        chefDepartmentDao.save(chefDepartment);
        return chefDepartment;
    }


}