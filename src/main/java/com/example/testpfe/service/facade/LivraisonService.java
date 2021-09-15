/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.facade;

import com.example.testpfe.vo.LivraisonVo;
import com.example.testpfe.bean.Livraison;

import java.util.List;


/**
 *
 * @author admin
 */
public interface LivraisonService {

    List<Livraison> search(LivraisonVo livraisonVO);

    public Livraison findByReference(String reference);

    public int deleteByReference(String reference);

    public int save(Livraison livraison);

    List<Livraison> findAll();
}
