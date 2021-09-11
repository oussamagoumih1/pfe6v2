package com.example.testpfe.service.facade;

import com.example.testpfe.bean.ChefDepartment;


import java.util.List;
import java.util.Optional;

public interface ChefDepartmentService {
    ChefDepartment findByCode(String code);
    Optional<ChefDepartment> findById(Long id);
    int deleteByCode(String code);
    List<ChefDepartment> findAll();
    ChefDepartment  save(ChefDepartment chefAgence);
    ChefDepartment findByLogin(String login);
    ChefDepartment seconnecter(ChefDepartment chefAgence);
    ChefDepartment update(ChefDepartment chefAgence);
}

