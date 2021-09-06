package com.example.testpfe.dao;



import com.example.testpfe.bean.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRoleDao extends JpaRepository<UserRole,Long> {

       List<UserRole> findByUserUsername(String username);
       int deleteByUserUsername(String username);


}
