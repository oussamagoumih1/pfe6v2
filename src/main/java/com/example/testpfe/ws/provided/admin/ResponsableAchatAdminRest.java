package com.example.testpfe.ws.provided.admin;

import com.example.testpfe.bean.ResponsableAchat;
import com.example.testpfe.service.facade.ResponsableAchatService;
import com.example.testpfe.vo.ResponsableAchatVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "pfe/admin/responsable-achat")
public class ResponsableAchatAdminRest {
    @Autowired
    private ResponsableAchatService responsableAchatService;

    public ResponsableAchat save(ResponsableAchat ResponsableAchat) {
        return responsableAchatService.save(ResponsableAchat);
    }

    public List<ResponsableAchat> search(ResponsableAchatVo responsableAchatVO) {
        return responsableAchatService.search(responsableAchatVO);
    }

    public int deleteByCode(String code) {
        return responsableAchatService.deleteByCode(code);
    }

    public Optional<ResponsableAchat> findById(Long id) {
        return responsableAchatService.findById(id);
    }

    public ResponsableAchat update(ResponsableAchat client) {
        return responsableAchatService.update(client);
    }

    public ResponsableAchat findByCode(String code) {
        return responsableAchatService.findByCode(code);
    }

    public List<ResponsableAchat> findAll() {
        return responsableAchatService.findAll();
    }
}
