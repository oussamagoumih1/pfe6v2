/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.ws.provided.admin;

import com.example.testpfe.bean.ReceptionItem;
import com.example.testpfe.service.facade.ReceptionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/pfe/admin/reception-item")
public class ReceptionItemAdminRest {

    @Autowired
    private ReceptionItemService receptionItemService;

    @GetMapping("/")
    public List<ReceptionItem> findAll() {
        return receptionItemService.findAll();
    }

}
