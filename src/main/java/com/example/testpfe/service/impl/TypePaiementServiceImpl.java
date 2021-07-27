package com.example.testpfe.service.impl;

import com.example.testpfe.Vo.TypePaiementVo;
import com.example.testpfe.bean.TypePaiement;
import com.example.testpfe.dao.TypePaimentDao;
import com.example.testpfe.service.facade.TypePaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class TypePaiementServiceImpl implements TypePaiementService {
    @Autowired
    private TypePaimentDao typePaimentDao;

    @Autowired
    private EntityManager entityManager;

    @Override
    public TypePaiement save(TypePaiement typePaiement) {
        if (findByRef(typePaiement.getRef()) == null)
            typePaimentDao.save(typePaiement);
        return typePaiement;
    }

    @Override
    public TypePaiement update(TypePaiement typePaiement) {
        return typePaimentDao.save(typePaiement);
    }

    @Override
    public List<TypePaiement> search(TypePaiementVo typePaiementVo) {
        String q = "select tp from TypePaiement tp where 1=1";
        if (typePaiementVo.getLibelle() != null) {
            q += " And tp.libelle LIKE '%" + typePaiementVo.getLibelle() + "%'";
        }
        if (typePaiementVo.getRef() != null) {
            q += " And tp.ref LIKE '%" + typePaiementVo.getRef() + "%'";
        }
        return entityManager.createQuery(q).getResultList();
    }

    @Override
    public List<TypePaiement> findAll() {
        return typePaimentDao.findAll();
    }

    @Override
    public TypePaiement findByRef(String ref) {
        return typePaimentDao.findByRef(ref);
    }

    @Override
    public TypePaiement findByLibelle(String libelle) {
        return typePaimentDao.findByLibelle(libelle);
    }

    @Override
    public int deleteByRef(String ref) {
        return typePaimentDao.deleteByRef(ref);
    }

    @Override
    public int deleteByLibelle(String libelle) {
        return typePaimentDao.deleteByLibelle(libelle);
    }


}