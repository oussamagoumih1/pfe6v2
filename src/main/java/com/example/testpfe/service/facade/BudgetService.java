package com.example.testpfe.service.facade;

import com.example.testpfe.bean.Budget;
import com.example.testpfe.vo.BudgetVo;

import java.math.BigDecimal;
import java.util.List;

public interface BudgetService {

    int save(Budget budget, BigDecimal mtInvPayeReliquat);

    Budget update(Budget budget);

    int deleteByAnnee(Integer annee);

    Budget findByBudgetDetail(String budgetDetail);

    Budget findByDescription(String description);

    Budget findByAnnee(Integer annee);

    List<Budget> search(BudgetVo budgetVo);

    List<Budget> findAll();


    Budget findByMtTotal(BigDecimal mtTotal);

    Budget findByMtPaye(BigDecimal mtPaye);

    Budget findByMtReserve(BigDecimal mtReserve);

    Budget findByMtReste(BigDecimal mtReste);

    Budget findByMt(BigDecimal mt);

}
