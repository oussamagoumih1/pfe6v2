/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.facade;


import com.example.testpfe.bean.Reception;
import com.example.testpfe.bean.ReceptionItem;

import java.util.List;

/**
 *
 * @author admin
 */
public interface ReceptionItemService {

    public ReceptionItem findByReference(String reference);

    public int deleteByReference(String reference);

    public int deleteByReceptionReference(String reference);

    public List<ReceptionItem> findByReceptionReference(String reference);

    public int deleteByProduitReference(String reference);

    public List<ReceptionItem> findByProduitReference(String reference);

    public int save(Reception reception, List<ReceptionItem> receptionItems);

    List<ReceptionItem> findAll();
}
