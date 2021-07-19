package com.example.testpfe.service.facade;

import com.example.testpfe.bean.Budget;
import com.example.testpfe.bean.BudgetDetail;
import com.example.testpfe.vo.BudgetVo;

import java.math.BigDecimal;
import java.util.List;

public interface BudgetService {

    Budget save (Budget budget);

    Budget update (Budget budget);

    int deleteByAnnee (Integer annee);

    int deleteByAnnee (List<Budget> budgets);

    Budget findByBudgetDetail (String budgetDetail);

    Budget findByDescription(String description);

    List<Budget> findByAnnee (Integer annee);

    List <Budget> findByBudgetDetailMtInvReelAndMtInvPayeAndMtInvReserve (BigDecimal mtInvReel, BigDecimal mtInvPaye, BigDecimal mtInvReserve);

    List <Budget> findByBudgetDetailMtInvReelAndMtInvPaye (BigDecimal mtInvReel, BigDecimal mtInvPaye);

    List<Budget> search (BudgetVo budgetVo);

    List<Budget> findAll () ;

}
