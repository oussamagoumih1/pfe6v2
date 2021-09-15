/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.facade;

import com.example.testpfe.vo.ReceptionVo;
import com.example.testpfe.bean.Reception;

import java.util.List;


/**
 *
 * @author admin
 */
public interface ReceptionService {

    List<Reception> search(ReceptionVo receptionVo);

    public Reception findByReference(String reference);

    public int deleteByReference(String reference);

    public int save(Reception reception);

    List<Reception> findAll();
}
