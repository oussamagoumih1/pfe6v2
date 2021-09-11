package com.example.testpfe.ws.provided.admin;

import com.example.testpfe.bean.User;
import com.example.testpfe.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/pfe/admin/user")
public class UserAdminRest {
    @Autowired
    private UserService userService;

    @PutMapping("/edit")
    public User editePersonnel(@RequestBody User user) {
        return userService.editePersonnel(user);
    }
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
