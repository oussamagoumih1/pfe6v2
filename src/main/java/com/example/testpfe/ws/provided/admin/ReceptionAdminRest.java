/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.ws.provided.admin;

import com.example.testpfe.bean.Reception;
import com.example.testpfe.service.facade.ReceptionService;
import com.example.testpfe.vo.ReceptionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/pfe/admin/reception")
public class ReceptionAdminRest {

    @Autowired
    private ReceptionService receptionService;

    @PostMapping("/search/")
    public List<Reception> search(@RequestBody ReceptionVo receptionVo) {
        return receptionService.search(receptionVo);
    }

    @GetMapping("/reference/{reference}")
    public Reception findByReference(@PathVariable String reference) {
        return receptionService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return receptionService.deleteByReference(reference);
    }

    @PostMapping("/")
    public int save(@RequestBody Reception reception) {
        return receptionService.save(reception);
    }

    @GetMapping("/")
    public List<Reception> findAll() {
        return receptionService.findAll();
    }

}
