package com.example.testpfe.ws.provided.admin;

import com.example.testpfe.bean.User;
import com.example.testpfe.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pfe/admin/admin")
public class AdminRest {

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    @PutMapping("/edit")
    public User editePersonnel(User user) {
        return userService.editePersonnel(user);
    }
}
