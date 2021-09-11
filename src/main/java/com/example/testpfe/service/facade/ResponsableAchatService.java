package com.example.testpfe.service.facade;

import com.example.testpfe.bean.ResponsableAchat;
import com.example.testpfe.vo.ResponsableAchatVo;

import java.util.List;
import java.util.Optional;

public interface ResponsableAchatService {
    ResponsableAchat save(ResponsableAchat ResponsableAchat);
    List<ResponsableAchat> search(ResponsableAchatVo responsableAchatVO);
    int deleteByCode(String code);
    Optional<ResponsableAchat> findById(Long id);
    ResponsableAchat update(ResponsableAchat client);
    ResponsableAchat findByCode(String code);
    List<ResponsableAchat> findAll();
}
