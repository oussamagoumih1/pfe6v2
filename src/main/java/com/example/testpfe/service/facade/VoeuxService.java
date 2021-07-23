package com.example.testpfe.service.facade;

import com.example.testpfe.Vo.VoeuxVo;
import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.Voeux;

import java.util.List;

public interface VoeuxService {

    Voeux save(Voeux voeux);
    Voeux update(Voeux voeux);
    int deleteByReference(String reference);

    Voeux findByDescription(String description);
    Voeux findByReference(String reference);
    List<Voeux> findByBudgetAnneeAndDescription(Integer annee, String description);
    List<Voeux> findByEntiteAdministrative (String entiteAdministrative);
    List<Voeux> findByEntiteAdministrativeCode(String code);

    List<Voeux> findByEtatVoeuxLibelle(String libelle);

    List<Voeux> findByVoeuxItemsProduit(Produit produit);
    List<Voeux> search(VoeuxVo voeuxVo);
    List<Voeux> findAll();
}
