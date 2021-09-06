package com.example.testpfe.dao;

import com.example.testpfe.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleDao extends JpaRepository<Role,Long> {

	   Role findByAuthority(String authority);
       int deleteByAuthority(String authority);


}
