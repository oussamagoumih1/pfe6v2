package com.example.testpfe.service.facade;

import com.example.testpfe.Vo.TypePaiementVo;
import com.example.testpfe.bean.TypePaiement;

import java.util.List;

public interface TypePaiementService {
    TypePaiement save(TypePaiement typePaiement);

    TypePaiement update(TypePaiement typePaiement);

    List<TypePaiement> search(TypePaiementVo typePaiementVo);

    List<TypePaiement> findAll();

    TypePaiement findByRef(String ref);

    TypePaiement findByLibelle(String libelle);

    int deleteByRef(String ref);

    int deleteByLibelle(String libelle);
}
