package com.example.testpfe.dao;

<<<<<<< HEAD
public interface BudgetEntiteAdministrativeDao {
=======
import com.example.testpfe.bean.BudgetEntiteAdministrative;
import com.example.testpfe.bean.EntiteAdministrative;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface BudgetEntiteAdministrativeDao extends JpaRepository <BudgetEntiteAdministrative, Long> {

    BudgetEntiteAdministrative findByBudgetDetail (String budgetDetail);

    BudgetEntiteAdministrative findByBudget (String budget);

    BudgetEntiteAdministrative findByEntiteAdministrative (String entiteAdministrative);

    List<BudgetEntiteAdministrative> findByEntiteAdministrativeLibelle (String libelle);

    List<BudgetEntiteAdministrative> findByBudgetAnnee (Integer annee);

    List<BudgetEntiteAdministrative> findByBudgetDetailMtInvReelAndMtInvPayeAndMtInvReserve (BigDecimal mtInvReel, BigDecimal mtInvPaye, BigDecimal mtInvReserve);

    int deleteByEntiteAdministrativeLibelle (String libelle);

    int deleteByBudgetAnnee (Integer annee);

>>>>>>> branch 'master' of https://github.com/oussamagoumih1/pfe6v2/
}
