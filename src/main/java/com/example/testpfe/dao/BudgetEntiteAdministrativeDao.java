package com.example.testpfe.dao;

import com.example.testpfe.bean.BudgetEntiteAdministrative;
import com.example.testpfe.bean.EntiteAdministrative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface BudgetEntiteAdministrativeDao extends JpaRepository <BudgetEntiteAdministrative, Long> {

    BudgetEntiteAdministrative findByBudgetDetail (String budgetDetail);

    BudgetEntiteAdministrative findByBudget (String budget);

    BudgetEntiteAdministrative findByEntiteAdministrative (String entiteAdministrative);

    List<BudgetEntiteAdministrative> findByEntiteAdministrativeLibelle (String libelle);

    List<BudgetEntiteAdministrative> findByBudgetAnnee (Integer annee);

    List<BudgetEntiteAdministrative> findByBudgetDetailMtInvReelAndMtInvPayeAndMtInvReserve (BigDecimal mtInvReel, BigDecimal mtInvPaye, BigDecimal mtInvReserve);

    int deleteByEntiteAdministrativeLibelle (String libelle);

    int deleteByBudgetAnnee (Integer annee);

}
