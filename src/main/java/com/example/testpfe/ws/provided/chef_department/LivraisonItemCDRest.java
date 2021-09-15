/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.ws.provided.chef_department;

import com.example.testpfe.bean.LivraisonItem;
import com.example.testpfe.service.facade.LivraisonItemService;
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
@RequestMapping("/pfe/chef-department/livraison-item")
public class LivraisonItemCDRest {

    @Autowired
    private LivraisonItemService livraisonItemService;

    @GetMapping("/")
    public List<LivraisonItem> findAll() {
        return livraisonItemService.findAll();
    }

}
