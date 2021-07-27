package com.example.testpfe.ws.provided;

import com.example.testpfe.Vo.EtatComandeVo;
import com.example.testpfe.bean.EtatComande;
import com.example.testpfe.service.facade.EtatCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testpfe/etat-commande")

public class EtatCommandeProvided {
    @Autowired
    private EtatCommandeService etatCommandeService;

    @PostMapping("/")
    public EtatComande save(@RequestBody EtatComande etatComande) {
        return etatCommandeService.save(etatComande);
    }

    @PutMapping("/")
    public EtatComande update(@RequestBody EtatComande etatComande) {
        return etatCommandeService.update(etatComande);
    }

    @PostMapping("/search")
    public List<EtatComande> search(@RequestBody EtatComandeVo etatComandeVo) {
        return etatCommandeService.search(etatComandeVo);
    }

    @GetMapping("/")
    public List<EtatComande> findAll() {
        return etatCommandeService.findAll();
    }

    @GetMapping("/libelle/{libelle}")
    public EtatComande findByLibelle(@PathVariable String libelle) {
        return etatCommandeService.findByLibelle(libelle);
    }

    @GetMapping("/code/{code}")
    public EtatComande findByCode(@PathVariable String code) {
        return etatCommandeService.findByCode(code);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return etatCommandeService.deleteByLibelle(libelle);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return etatCommandeService.deleteByCode(code);
    }
}
