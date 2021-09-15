/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.impl;


import com.example.testpfe.bean.Livraison;
import com.example.testpfe.dao.LivraisonDao;
import com.example.testpfe.service.facade.BudgetService;
import com.example.testpfe.service.facade.LivraisonItemService;
import com.example.testpfe.service.facade.LivraisonService;
import com.example.testpfe.service.util.StringUtil;
import com.example.testpfe.vo.LivraisonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;


/**
 *
 * @author admin
 */
@Service
public class LivraisonServiceImpl implements LivraisonService {

    @Autowired
    private LivraisonDao livraisonDao;

    @Autowired
    private LivraisonItemService livraisonItemService;
    @Autowired
    private BudgetService budgetService;

    @Autowired
    private EntityManager entityManager;

    @Override
    public int save(Livraison livraison) {
        livraisonDao.save(livraison);
        livraisonItemService.save(livraison, livraison.getLivraisonItems());
        return 1;
    }


 /*   @Override
    public List<Livraison> search(LivraisonDao livraisonVo) {
        return null;
    }*/

  /*  @Override
    public List<Livraison> search(LivraisonVo livraisonVo) {
        String query = "SELECT c FROM Livraison c WHERE 1=1";
        if (StringUtil.isNotEmpty(livraisonVo.getReference())) {
            query += " AND c.reference LIKE '%" + livraisonVo.getReference() + "%'";
        }
        return null;
    }*/

    @Override
    public List<Livraison> search(LivraisonVo livraisonVO) {
        String query = "SELECT l FROM Livraison l WHERE 1=1";
        if (StringUtil.isNotEmpty(livraisonVO.getReference())) {
            query += " AND c.reference LIKE '%" + livraisonVO.getReference() + "%'";
        }
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Livraison findByReference(String reference) {
        return livraisonDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return livraisonDao.deleteByReference(reference);
    }

    @Override
    public List<Livraison> findAll() {
        return livraisonDao.findAll();
    }

}
