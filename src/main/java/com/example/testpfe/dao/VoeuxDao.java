package com.example.testpfe.dao;


import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.Voeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoeuxDao extends JpaRepository<Voeux, Long> {

    Voeux findByDescription(String description);
    Voeux findByReference(String reference);
    List<Voeux> findByBudgetAnneAndDescription(Integer annee, String description);
    List<Voeux> findByEtatVoeuxLibelleAndCode(String libelle, String code);
    List<Voeux> findByEntiteAdministrativeLibelleAndCode(String libelle, String code);
    List<Voeux> findByVoeuxItemsProduit(Produit produit);
    int deleteByReference(String reference);
    int deleteByReference(List<Voeux> voeuxes);

}
