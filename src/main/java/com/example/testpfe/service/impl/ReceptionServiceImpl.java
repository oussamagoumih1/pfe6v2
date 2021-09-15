/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Reception;
import com.example.testpfe.dao.ReceptionDao;
import com.example.testpfe.service.facade.ReceptionItemService;
import com.example.testpfe.service.facade.ReceptionService;
import com.example.testpfe.service.util.StringUtil;
import com.example.testpfe.vo.ReceptionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;


/**
 *
 * @author admin
 */
@Service
public class ReceptionServiceImpl implements ReceptionService {

    @Autowired
    private ReceptionDao receptionDao;

    @Autowired
    private ReceptionItemService receptionItemService;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Reception> search(ReceptionVo receptionVo) {
        String query = "SELECT r FROM reception r WHERE 1=1";
        if (StringUtil.isNotEmpty(receptionVo.getReference())) {
            query += " AND c.reference LIKE '%" + receptionVo.getReference() + "%'";
        }
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Reception findByReference(String reference) {
        return receptionDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return receptionDao.deleteByReference(reference);
    }

    @Override
    public int save(Reception reception) {
        receptionDao.save(reception);
        return 1;
    }

    @Override
    public List<Reception> findAll() {
        return receptionDao.findAll();
    }


}
