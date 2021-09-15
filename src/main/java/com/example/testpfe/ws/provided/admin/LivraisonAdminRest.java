/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.ws.provided.admin;

import com.example.testpfe.bean.Livraison;
import com.example.testpfe.service.facade.LivraisonService;
import com.example.testpfe.vo.LivraisonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/pfe/admin/livraison")
public class LivraisonAdminRest {

    @Autowired
    private LivraisonService livraisonService;

    @PostMapping("/search/")
    public List<Livraison> search(@RequestBody LivraisonVo livraisonVo) {
        return livraisonService.search(livraisonVo);
    }

    @GetMapping("/reference/{reference}")
    public Livraison findByReference(@PathVariable String reference) {
        return livraisonService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return livraisonService.deleteByReference(reference);
    }

    @PostMapping("/")
    public int save(@RequestBody Livraison livraison) {
        return livraisonService.save(livraison);
    }

    @GetMapping("/")
    public List<Livraison> findAll() {
        return livraisonService.findAll();
    }

}
