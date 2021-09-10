package com.example.testpfe.service.facade;

import com.example.testpfe.bean.Budget;
import com.example.testpfe.vo.BudgetVo;

import java.util.List;

public interface BudgetService {

    int save(Budget budget);

    Budget update(Budget budget);

    int deleteByAnnee(Integer annee);

    int deleteByAnnee(List<Budget> budgets);

    Budget findByBudgetDetail(String budgetDetail);

    Budget findByDescription(String description);

    Budget findByAnnee(Integer annee);

    List<Budget> search(BudgetVo budgetVo);

    List<Budget> findAll();

}
