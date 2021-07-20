package com.example.testpfe.service.impl;

import com.example.testpfe.Vo.VoeuxVo;
import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.Voeux;
import com.example.testpfe.dao.VoeuxDao;
import com.example.testpfe.service.facade.VoeuxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class VoeuxServiceImpl implements VoeuxService {

    @Autowired
    private VoeuxDao voeuxDao;
    @Autowired
    private EntityManager entityManager;



    @Override
    public Voeux save(Voeux voeux) {
        if (findByReference(voeux.getReference()) ==null)
            voeuxDao.save(voeux);
        return voeux;
    }

    @Override
    public Voeux update(Voeux voeux) {
        return voeuxDao.save(voeux);
    }

    @Override
    public int deleteByReference(String reference) {
        return voeuxDao.deleteByReference(reference);
    }

    @Override
    public int deleteByReference(List<Voeux> voeuxes) {
        int res = 0;
        for (int i = 0; i < voeuxes.size(); i++) {
            res += deleteByReference(voeuxes.get(i).getReference());
        }
        return res;
    }

    @Override
    public Voeux findByDescription(String description) {
        return voeuxDao.findByDescription(description);
    }

    @Override
    public Voeux findByReference(String reference) {
        return voeuxDao.findByReference(reference);
    }

    @Override
    public List<Voeux> findByBudgetAnneAndDescription(Integer annee, String description) {
        return voeuxDao.findByBudgetAnneAndDescription(annee, description);
    }

    @Override
    public List<Voeux> findByEtatVoeuxLibelleAndCode(String libelle, String code) {
        return voeuxDao.findByEtatVoeuxLibelleAndCode(libelle, code);
    }

    @Override
    public List<Voeux> findByEntiteAdministrativeLibelleAndCode(String libelle, String code) {
        return voeuxDao.findByEntiteAdministrativeLibelleAndCode(libelle,code);
    }

    @Override
    public List<Voeux> findByVoeuxItemsProduit(Produit produit) {
        return voeuxDao.findByVoeuxItemsProduit(produit);
    }

    @Override
    public List<Voeux> search(VoeuxVo voeuxVo) {
        String q = "select v from Voeux v where 1=1";
        if (voeuxVo.getReference() != null){
            q += " And v.reference LIKE '%" + voeuxVo.getReference() + "%'";
        }
        if (voeuxVo.getDescription() != null){
            q += " And v.description LIKE '%" + voeuxVo.getDescription() + "%'";
        }
return entityManager.createQuery(q).getResultList();
    }

    @Override
    public List<Voeux> findAll() {
        return voeuxDao.findAll();
    }
}
