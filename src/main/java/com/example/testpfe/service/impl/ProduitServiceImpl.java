/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.ProduitCategorie;
import com.example.testpfe.dao.ProduitDao;
import com.example.testpfe.service.facade.ProduitCategorieService;
import com.example.testpfe.service.facade.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author admin
 */
@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitDao produitDao;


    @Autowired
    private ProduitCategorieService produitCategorieService;

    @Override
    public int save(Produit produit) {
        Produit loadedProduit = findByReference(produit.getReference());

        ProduitCategorie produitCategorie = produitCategorieService.findByReference(produit.getProduitCategorie().getReference());
        produit.setProduitCategorie(produitCategorie);

        if (loadedProduit != null) {
            return -1;
        } else if (produitCategorie == null) {
            return -2;
        } else {

            produit.setProduitCategorie(produitCategorie);
            produitDao.save(produit);

            return 1;
        }
    }

    @Override
    public int deleteMultiple(List<Produit> produits) {
        int res = 0;
        for (int i = 0; i < produits.size(); i++) {
            res += deleteByReference(produits.get(i).getReference());
        }
        return res;     }

    @Override
    public Produit findByReference(String ref) {
        return produitDao.findByReference(ref);
    }

    @Override
    public int deleteByReference(String ref) {
        return produitDao.deleteByReference(ref);
    }

    @Override
    public List<Produit> findAll() {
        return produitDao.findAll();
    }

}
