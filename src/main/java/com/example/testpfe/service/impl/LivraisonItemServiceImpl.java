/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Livraison;
import com.example.testpfe.bean.LivraisonItem;
import com.example.testpfe.bean.Produit;
import com.example.testpfe.dao.LivraisonItemDao;
import com.example.testpfe.service.facade.LivraisonItemService;
import com.example.testpfe.service.facade.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author admin
 */
@Service
public class LivraisonItemServiceImpl implements LivraisonItemService {

    @Autowired
    private LivraisonItemDao livraisonItemDao;
    @Autowired
    private ProduitService produitService;

    @Override
    public int save(Livraison livraison, List<LivraisonItem> livraisonItems) {
        for (LivraisonItem livraisonItem : livraisonItems) {
            Produit produit = produitService.findByReference(livraisonItem.getProduit().getReference());
            livraisonItem.setProduit(produit);
            if (produit != null) {
                livraisonItem.setLivraison(livraison);
                livraisonItemDao.save(livraisonItem);
            }
        }
        return 1;

    }

    @Override
    public List<LivraisonItem> findAll() {
        return null;
    }


    @Override
    public LivraisonItem findByReference(String reference) {
        return livraisonItemDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return livraisonItemDao.deleteByReference(reference);
    }

    @Override
    public int deleteByLivraisonReference(String reference) {
        return livraisonItemDao.deleteByLivraisonReference(reference);
    }

    @Override
    public List<LivraisonItem> findByLivraisonReference(String reference) {
        return livraisonItemDao.findByLivraisonReference(reference);
    }

    @Override
    public int deleteByProduitReference(String reference) {
        return livraisonItemDao.deleteByProduitReference(reference);
    }

    @Override
    public List<LivraisonItem> findByProduitReference(String reference) {
        return livraisonItemDao.findByProduitReference(reference);
    }

}
