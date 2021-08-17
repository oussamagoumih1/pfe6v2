/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.ws.provided;

import java.util.List;
import com.example.testpfe.Vo.CommandeVo;
import com.example.testpfe.bean.Commande;
import com.example.testpfe.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/pfe/commande")
public class CommandeProvidedRest {

    @Autowired
    private CommandeService commandeService;

    @PostMapping("/search/")
    public List<Commande> search(@RequestBody CommandeVo commandeVo) {
        return commandeService.search(commandeVo);
    }

    @GetMapping("/reference/{reference}")
    public Commande findByReference(@PathVariable String reference) {
        return commandeService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return commandeService.deleteByReference(reference);
    }

    @PostMapping("/")
    public int save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }

    @GetMapping("/")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }

}
