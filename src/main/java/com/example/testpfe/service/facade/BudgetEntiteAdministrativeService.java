package com.example.testpfe.service.facade;

import com.example.testpfe.bean.BudgetEntiteAdministrative;
import com.example.testpfe.vo.BudgetEntiteAdministrativeVo;

import java.util.List;

public interface BudgetEntiteAdministrativeService {

    BudgetEntiteAdministrative findByBudgetDetail(String budgetDetail);

    BudgetEntiteAdministrative findByBudget(String budget);

    BudgetEntiteAdministrative findByEntiteAdministrative(String entiteAdministrative);

    List<BudgetEntiteAdministrative> findByEntiteAdministrativeLibelle(String libelle);

    List<BudgetEntiteAdministrative> findByBudgetAnnee(Integer annee);

    int deleteByEntiteAdministrativeLibelle(String libelle);

    int deleteByBudgetAnnee(Integer annee);

    BudgetEntiteAdministrative save(BudgetEntiteAdministrative budgetEntiteAdministrative, String libelleEntiteAdministrative);

    BudgetEntiteAdministrative update(BudgetEntiteAdministrative budgetEntiteAdministrative);

    List<BudgetEntiteAdministrative> findAll();

    List<BudgetEntiteAdministrative> search(BudgetEntiteAdministrativeVo budgetEntiteAdministrativeVo);
}
