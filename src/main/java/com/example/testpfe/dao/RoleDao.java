package com.example.testpfe.dao;


import com.example.testpfe.bean.Role;
import com.example.testpfe.service.util.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleDao extends JpaRepository <Role,Long> {
    Optional<Role> findByName(Roles name);

}
