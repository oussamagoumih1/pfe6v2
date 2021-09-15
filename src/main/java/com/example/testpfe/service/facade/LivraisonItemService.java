/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.facade;

import com.example.testpfe.bean.Livraison;
import com.example.testpfe.bean.LivraisonItem;

import java.util.List;

/**
 *
 * @author admin
 */
public interface LivraisonItemService {

    public LivraisonItem findByReference(String reference);

    public int deleteByReference(String reference);

    public int deleteByLivraisonReference(String reference);

    public List<LivraisonItem> findByLivraisonReference(String reference);

    public int deleteByProduitReference(String reference);

    public List<LivraisonItem> findByProduitReference(String reference);

    public int save(Livraison Livraison, List<LivraisonItem> LivraisonItems);

    List<LivraisonItem> findAll();
}
