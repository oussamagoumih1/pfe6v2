package com.example.testpfe.dao;

import com.example.testpfe.bean.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface BudgetDao extends JpaRepository <Budget, Long> {

    Budget findByBudgetDetail (String budgetDetail);

    Budget findByDescription(String description);

    List <Budget> findByAnnee (Integer annee);

    List <Budget> findByBudgetDetailMtInvReelAndMtInvPayeAndMtInvReserve (BigDecimal mtInvReel, BigDecimal mtInvPaye, BigDecimal mtInvReserve);

    List <Budget> findByBudgetDetailMtInvReelAndMtInvPaye (BigDecimal mtInvReel, BigDecimal mtInvPaye);

    int deleteByAnnee(Integer annee);

    int deleteByAnnee (List<Budget> budgets);
}
