/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Commande;
import com.example.testpfe.bean.CommandeItem;
import com.example.testpfe.bean.Produit;
import com.example.testpfe.dao.CommandeItemDao;
import com.example.testpfe.service.facade.CommandeItemService;
import com.example.testpfe.service.facade.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author admin
 */
@Service
public class CommandeItemServiceImpl implements CommandeItemService {

    @Autowired
    private CommandeItemDao commandeItemDao;
    @Autowired
    private ProduitService produitService;

    @Override
    public int save(Commande commande, List<CommandeItem> commandeItems) {
        for (CommandeItem commandeItem : commandeItems) {
            Produit produit = produitService.findByReference(commandeItem.getProduit().getReference());
            commandeItem.setProduit(produit);
            if (produit != null) {
                commandeItem.setCommande(commande);
                commandeItemDao.save(commandeItem);
            }
        }
        return 1;

    }

    @Override
    public int deleteMultiple(List<CommandeItem> commandeItems) {
        int res = 0;
        for (int i = 0; i < commandeItems.size(); i++) {
            res += deleteByReference(commandeItems.get(i).getReference());
        }
        return res;
    }

    @Override
    public CommandeItem findByReference(String reference) {
        return commandeItemDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return commandeItemDao.deleteByReference(reference);
    }

    @Override
    public int deleteByCommandeReference(String reference) {
        return commandeItemDao.deleteByCommandeReference(reference);
    }

    @Override
    public List<CommandeItem> findByCommandeReference(String reference) {
        return commandeItemDao.findByCommandeReference(reference);
    }

    @Override
    public int deleteByProduitReference(String reference) {
        return commandeItemDao.deleteByProduitReference(reference);
    }

    @Override
    public List<CommandeItem> findByProduitReference(String reference) {
        return commandeItemDao.findByProduitReference(reference);
    }

    @Override
    public List<CommandeItem> findAll() {
        return commandeItemDao.findAll();
    }

}
