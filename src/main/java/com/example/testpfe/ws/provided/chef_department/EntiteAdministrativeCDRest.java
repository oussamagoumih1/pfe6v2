package com.example.testpfe.ws.provided.chef_department;

import com.example.testpfe.bean.EntiteAdministrative;
import com.example.testpfe.service.facade.EntiteAdministrativeService;
import com.example.testpfe.vo.EntiteAdministrativeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pfe/chef-department/entite-administrative")
public class EntiteAdministrativeCDRest {
    @Autowired
    private EntiteAdministrativeService entiteAdministrativeService;

    @GetMapping("/code/{code}")
    public EntiteAdministrative findByCode(@PathVariable String code) {
        return entiteAdministrativeService.findByCode(code);
    }

    @GetMapping("/libelle/{libelle}")
    public EntiteAdministrative findByLibelle(@PathVariable String libelle) {
        return entiteAdministrativeService.findByLibelle(libelle);
    }

    @GetMapping("/code/{code}/libelle/{libelle}")
    public EntiteAdministrative findByCodeAndLibelle(@PathVariable String code, @PathVariable String libelle) {
        return entiteAdministrativeService.findByCodeAndLibelle(code, libelle);
    }

    @PostMapping("/")
    public EntiteAdministrative save(@RequestBody EntiteAdministrative entiteAdministrative) {
        return entiteAdministrativeService.save(entiteAdministrative);
    }

    @PutMapping("/")
    public EntiteAdministrative update(@RequestBody EntiteAdministrative entiteAdministrative) {
        return entiteAdministrativeService.update(entiteAdministrative);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return entiteAdministrativeService.deleteByLibelle(libelle);
    }


    @PostMapping("/search")
    public List<EntiteAdministrative> search(@RequestBody EntiteAdministrativeVo entiteAdministrativeVo) {
        return entiteAdministrativeService.search(entiteAdministrativeVo);
    }

    @GetMapping("/")
    public List<EntiteAdministrative> findAll() {
        return entiteAdministrativeService.findAll();
    }
}
