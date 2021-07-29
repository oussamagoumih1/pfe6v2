package com.example.testpfe.ws.provided;


import com.example.testpfe.bean.BudgetEntiteAdministrative;
import com.example.testpfe.service.facade.BudgetEntiteAdministrativeService;
import com.example.testpfe.vo.BudgetEntiteAdministrativeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/testpfe/budget-entite-administrative")
public class BudgetEntiteAdministrativeProvidedRest {
    @Autowired
    private BudgetEntiteAdministrativeService budgetEntiteAdministrativeService;

    @GetMapping("/budgetDetail/{budgetDetail}")
    public BudgetEntiteAdministrative findByBudgetDetail(@PathVariable String budgetDetail) {
        return budgetEntiteAdministrativeService.findByBudgetDetail(budgetDetail);
    }

    @GetMapping("/budget/{budget}")
    public BudgetEntiteAdministrative findByBudget(@PathVariable String budget) {
        return budgetEntiteAdministrativeService.findByBudget(budget);
    }

    @GetMapping("/entiteAdministrative/{entiteAdministrative}")
    public BudgetEntiteAdministrative findByEntiteAdministrative(@PathVariable String entiteAdministrative) {
        return budgetEntiteAdministrativeService.findByEntiteAdministrative(entiteAdministrative);
    }

    @GetMapping("/entiteAdministrativeLibelle/{libelle}")
    public List<BudgetEntiteAdministrative> findByEntiteAdministrativeLibelle(@PathVariable String libelle) {
        return budgetEntiteAdministrativeService.findByEntiteAdministrativeLibelle(libelle);
    }

    @GetMapping("/budgetAnnee/{annee}")
    public List<BudgetEntiteAdministrative> findByBudgetAnnee(@PathVariable Integer annee) {
        return budgetEntiteAdministrativeService.findByBudgetAnnee(annee);
    }

    @DeleteMapping("/entiteAdministrativeLibelle/{libelle}")
    public int deleteByEntiteAdministrativeLibelle(@PathVariable String libelle) {
        return budgetEntiteAdministrativeService.deleteByEntiteAdministrativeLibelle(libelle);
    }

    @DeleteMapping("/budgetAnnee/{annee}")
    public int deleteByBudgetAnnee(@PathVariable Integer annee) {
        return budgetEntiteAdministrativeService.deleteByBudgetAnnee(annee);
    }

    @PostMapping("/entiteAdministrativeLibelle/{libelleEntiteAdministrative}")
    public BudgetEntiteAdministrative save(@RequestBody BudgetEntiteAdministrative budgetEntiteAdministrative, @PathVariable String libelleEntiteAdministrative) {
        return budgetEntiteAdministrativeService.save(budgetEntiteAdministrative, libelleEntiteAdministrative);
    }

    /*@PutMapping("/")
    public BudgetEntiteAdministrative update(@RequestBody BudgetEntiteAdministrative budgetEntiteAdministrative) {
        return budgetEntiteAdministrativeService.update(budgetEntiteAdministrative);
    }*/

    @PostMapping("/search")
    public List<BudgetEntiteAdministrative> search(@RequestBody BudgetEntiteAdministrativeVo budgetEntiteAdministrativeVo) {
        return budgetEntiteAdministrativeService.search(budgetEntiteAdministrativeVo);
    }

    @GetMapping("/")
    public List<BudgetEntiteAdministrative> findAll() {
        return budgetEntiteAdministrativeService.findAll();
    }
}
