package com.example.testpfe.dao;


import com.example.testpfe.bean.BudgetEntiteAdministrative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface BudgetEntiteAdministrativeDao extends JpaRepository<BudgetEntiteAdministrative, Long> {

    List<BudgetEntiteAdministrative> findByEntiteAdministrativeLibelle(String libelle);

    List<BudgetEntiteAdministrative> findByBudgetAnnee(Integer annee);

    int deleteByEntiteAdministrativeLibelle(String libelle);

    int deleteByBudgetAnnee(Integer annee);

}
