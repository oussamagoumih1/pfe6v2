/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.facade;

import com.example.testpfe.bean.Commande;
import com.example.testpfe.bean.Produit;

import java.util.List;

/**
 *
 * @author admin
 */
public interface ProduitService {

    public Produit findByReference(String ref);

    public int deleteByReference(String ref);

    public int save(Produit produit);

    public int deleteMultiple(List<Produit> produits);

    List<Produit> findAll();
}
