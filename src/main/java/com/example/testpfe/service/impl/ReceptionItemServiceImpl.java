/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.Reception;
import com.example.testpfe.bean.ReceptionItem;
import com.example.testpfe.dao.ReceptionItemDao;
import com.example.testpfe.service.facade.ProduitService;
import com.example.testpfe.service.facade.ReceptionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author admin
 */
@Service
public class ReceptionItemServiceImpl implements ReceptionItemService {

    @Autowired
    private ReceptionItemDao receptionItemDao;
    @Autowired
    private ProduitService produitService;

    @Override
    public ReceptionItem findByReference(String reference) {
        return receptionItemDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return receptionItemDao.deleteByReference(reference);
    }

    @Override
    public int deleteByReceptionReference(String reference) {
        return receptionItemDao.deleteByReceptionReference(reference);
    }

    @Override
    public List<ReceptionItem> findByReceptionReference(String reference) {
        return receptionItemDao.findByReceptionReference(reference);
    }

    @Override
    public int deleteByProduitReference(String reference) {
        return receptionItemDao.deleteByProduitReference(reference);
    }

    @Override
    public List<ReceptionItem> findByProduitReference(String reference) {
        return receptionItemDao.findByProduitReference(reference);
    }

    @Override
    public int save(Reception reception, List<ReceptionItem> receptionItems) {
        for (ReceptionItem receptionItem : receptionItems) {
            Produit produit = produitService.findByReference(receptionItem.getProduit().getReference());
            receptionItem.setProduit(produit);
            if (produit != null) {
                receptionItem.setReception(reception);
                receptionItemDao.save(receptionItem);
            }
        }
        return 1;
    }

    @Override
    public List<ReceptionItem> findAll() {
        return receptionItemDao.findAll();
    }

}
