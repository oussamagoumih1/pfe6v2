package com.example.testpfe.service.facade;

import com.example.testpfe.bean.Budget;
import com.example.testpfe.bean.BudgetEntiteAdministrative;
import com.example.testpfe.vo.BudgetEntiteAdministrativeVo;

import java.util.List;

public interface BudgetEntiteAdministrativeService {

    List<BudgetEntiteAdministrative> findByEntiteAdministrativeLibelle(String libelle);

    List<BudgetEntiteAdministrative> findByBudgetAnnee(Integer annee);

    int deleteByEntiteAdministrativeLibelle(String libelle);

    int deleteByBudgetAnnee(Integer annee);

    int save(Budget budget, List<BudgetEntiteAdministrative> budgetEntiteAdministratives);

    BudgetEntiteAdministrative update(BudgetEntiteAdministrative budgetEntiteAdministrative);

    List<BudgetEntiteAdministrative> findAll();

    List<BudgetEntiteAdministrative> search(BudgetEntiteAdministrativeVo budgetEntiteAdministrativeVo);
}
