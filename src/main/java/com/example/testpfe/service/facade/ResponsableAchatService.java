package com.example.testpfe.service.facade;


import com.example.testpfe.bean.ResponsableAchat;
import com.example.testpfe.vo.ResponsableAchatVo;

import java.util.List;
import java.util.Optional;

public interface ResponsableAchatService {
    List<ResponsableAchat> findByEntrepriseCode(String code);
    int deleteByEntrepriseCode(String code);
    ResponsableAchat save(ResponsableAchat ResponsableAchat);
    List<ResponsableAchat> search(ResponsableAchatVo ResponsableAchatVo);
    int deleteByCode(String code);
    int deleteByCode(List<ResponsableAchat> ResponsableAchats);
    Optional<ResponsableAchat> findById(Long id);
    ResponsableAchat update(ResponsableAchat ResponsableAchat);
    ResponsableAchat findByCode(String code);
    List<ResponsableAchat> findAll();


}