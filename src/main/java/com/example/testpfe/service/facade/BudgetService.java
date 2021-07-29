package com.example.testpfe.service.facade;

import com.example.testpfe.bean.Budget;
import com.example.testpfe.vo.BudgetVo;

import java.util.List;

public interface BudgetService {

    Budget save(Budget budget);

    Budget update(Budget budget);

    int deleteByAnnee(Integer annee);

    Budget findByBudgetDetail(String budgetDetail);

    Budget findByDescription(String description);

    List<Budget> findByAnnee(Integer annee);

    List<Budget> search(BudgetVo budgetVo);

    List<Budget> findAll();

}
