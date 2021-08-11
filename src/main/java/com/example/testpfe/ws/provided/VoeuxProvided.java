package com.example.testpfe.ws.provided;

import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.Voeux;
import com.example.testpfe.service.facade.VoeuxService;
import com.example.testpfe.vo.VoeuxVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pfe1/voeux")

public class VoeuxProvided {
    @Autowired
    private VoeuxService voeuxService;

    @PostMapping("/")
    public Voeux save(@RequestBody Voeux voeux) {
        return voeuxService.save(voeux);
    }

    @PutMapping("/")
    public Voeux update(@RequestBody Voeux voeux) {
        return voeuxService.update(voeux);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return voeuxService.deleteByReference(reference);
    }

    @GetMapping("/description/{description}")
    public Voeux findByDescription(@PathVariable String description) {
        return voeuxService.findByDescription(description);
    }

    @GetMapping("/reference/{reference}")
    public Voeux findByReference(@PathVariable String reference) {
        return voeuxService.findByReference(reference);
    }

    @GetMapping("/budget/annee/{annee}/description/{description}")
    public List<Voeux> findByBudgetAnneeAndDescription(@PathVariable Integer annee, String reference) {
        return voeuxService.findByBudgetAnneeAndDescription(annee, reference);
    }

    @GetMapping("/etatVoeux/libelle/{libelle}")
    public List<Voeux> findByEtatVoeuxLibelleAndCode(@PathVariable String libelle) {
        return voeuxService.findByEtatVoeuxLibelle(libelle);
    }

    @GetMapping("/entiteAdministrative/libelle/{libelle}/code/{code}")
    public List<Voeux> findByEntiteAdministrativeLibelleAndCode(@PathVariable String libelle, String code) {
        return voeuxService.findByEntiteAdministrativeCode(code);
    }

    @GetMapping("/voeuxItem/produit/{produit}")
    public List<Voeux> findByVoeuxItemsProduit(@PathVariable Produit produit) {
        return voeuxService.findByVoeuxItemsProduit(produit);
    }

    @PostMapping("/search")
    public List<Voeux> search(@RequestBody VoeuxVo voeuxVo) {
        return voeuxService.search(voeuxVo);
    }

    @GetMapping("/")
    public List<Voeux> findAll() {
        return voeuxService.findAll();
    }
}
