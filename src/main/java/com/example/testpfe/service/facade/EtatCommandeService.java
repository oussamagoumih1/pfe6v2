package com.example.testpfe.service.facade;

import com.example.testpfe.vo.EtatComandeVo;
import com.example.testpfe.bean.EtatComande;


import java.util.List;

public interface EtatCommandeService {
    EtatComande save(EtatComande etatComande);

    EtatComande update(EtatComande etatComande);

    List<EtatComande> search(EtatComandeVo etatComandeVo);

    List<EtatComande> findAll();

    EtatComande findByLibelle(String libelle);

    EtatComande findByCode(String code);

    int deleteByLibelle(String libelle);

    int deleteByCode(String code);
}
