package com.example.testpfe.ws.provided.chef_department;

import com.example.testpfe.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pfe/chef-department/user")
public class UserChefDepartmentRest {

    @Autowired
    private UserService userService;

    @GetMapping("/block/id/{id}")
    public int block(@PathVariable Long id) {
        return userService.block(id);
    }
    @GetMapping("/reset/ide/{ide}")
    public int reset(@PathVariable Long ide) {
        return userService.reset(ide);
    }
    @GetMapping("/deblock/idi/{idi}")
    public int deblock( @PathVariable Long idi) {
        return userService.deblock(idi);
    }
}
