package com.example.testpfe.service.facade;

import com.example.testpfe.Vo.VoeuxVo;
import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.Voeux;

import java.util.List;

public interface VoeuxService {

    Voeux save(Voeux voeux);
    Voeux update(Voeux voeux);
    int deleteByReference(String reference);
    int deleteByReference(List<Voeux> voeuxes);
    Voeux findByDescription(String description);
    Voeux findByReference(String reference);
    List<Voeux> findByBudgetAnneAndDescription(Integer annee, String description);
    List<Voeux> findByEtatVoeuxLibelleAndCode(String libelle, String code);
    List<Voeux> findByEntiteAdministrativeLibelleAndCode(String libelle, String code);
    List<Voeux> findByVoeuxItemsProduit(Produit produit);
    List<Voeux> search(VoeuxVo voeuxVo);
    List<Voeux> findAll();
}
