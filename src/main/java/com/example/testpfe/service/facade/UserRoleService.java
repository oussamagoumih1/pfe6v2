package com.example.testpfe.service.facade;




import com.example.testpfe.bean.UserRole;

import java.util.List;

public interface UserRoleService {


    /**
     * delete User from database by username (reference)
     *
     * @param username - reference of User to be deleted
     * @return 1 if User deleted successfully
     */

    List<UserRole> findByUserUsername(String username);

    int deleteByUserUsername(String username);

    UserRole save(UserRole userRole);


}
