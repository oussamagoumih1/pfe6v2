package com.example.testpfe.service.facade;

import com.example.testpfe.bean.EtatVoeux;
import com.example.testpfe.vo.EtatVoeuxVo;

import java.util.List;

public interface EtatVoeuxService {

    EtatVoeux save(EtatVoeux etatVoeux);

    EtatVoeux update(EtatVoeux etatVoeux);

    EtatVoeux findByLibelle(String libelle);

    EtatVoeux findByCode(String code);

    int deleteByCode(String code);

    List<EtatVoeux> search(EtatVoeuxVo etatVoeuxVo);

    List<EtatVoeux> findAll();
}
