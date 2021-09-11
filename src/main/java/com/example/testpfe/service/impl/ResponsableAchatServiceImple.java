package com.example.testpfe.service.impl;

import com.example.testpfe.bean.ResponsableAchat;
import com.example.testpfe.dao.ResponsableAchatDao;
import com.example.testpfe.service.facade.ResponsableAchatService;
import com.example.testpfe.service.util.StringUtil;
import com.example.testpfe.vo.ResponsableAchatVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ResponsableAchatServiceImple implements ResponsableAchatService {

    @Autowired
    private  ResponsableAchatDao  responsableAchatDao;
    @Autowired
    private EntityManager entityManager;



    public ResponsableAchat save(ResponsableAchat responsableAchat){
        if(findByCode(responsableAchat.getCode())!=null) {
            return null;
            }else {
                responsableAchatDao.save(responsableAchat);
                return responsableAchat;
            }
        }

    public List<ResponsableAchat> search(ResponsableAchatVo responsableAchatVo){
        String query = "SELECT ra FROM ResponsableAchat ra where 1=1";
        if(StringUtil.isNotEmpty(responsableAchatVo.getCode())){
            query+=" AND c.code LIKE '%" + responsableAchatVo.getCode() + "%'";
        }if(StringUtil.isNotEmpty(responsableAchatVo.getLibelle())){
            query+= " AND c.libelle LIKE '%" + responsableAchatVo.getLibelle() + "%'";
        }if(StringUtil.isNotEmpty(responsableAchatVo.getDescription())){
            query+=" AND c.description LIKE '%" + responsableAchatVo.getDescription() + "%'";
        }
        return  entityManager.createQuery(query).getResultList();
    }


    public ResponsableAchat update(ResponsableAchat responsableAchat){
        return  responsableAchatDao.save(responsableAchat);}



    @Transactional
    public int deleteByCode(String code) {
        return responsableAchatDao.deleteByCode(code);
    }

    @Override
    public Optional<ResponsableAchat> findById(Long id) {
        return responsableAchatDao.findById(id);
    }


    @Override
    public ResponsableAchat findByCode(String code) {
        return responsableAchatDao.findByCode(code);
    }

    public List<ResponsableAchat> findAll() {
        return responsableAchatDao.findAll();
    }
}