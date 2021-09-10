package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Budget;
import com.example.testpfe.bean.BudgetEntiteAdministrative;
import com.example.testpfe.dao.BudgetDao;
import com.example.testpfe.service.facade.BudgetDetailService;
import com.example.testpfe.service.facade.BudgetEntiteAdministrativeService;
import com.example.testpfe.service.facade.BudgetService;
import com.example.testpfe.vo.BudgetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

@Service
public class BudgetServiceImpl implements BudgetService {
    @Autowired
    private BudgetDao budgetDao;
    @Autowired
    private BudgetDetailService budgetDetailService;
    @Autowired
    private BudgetEntiteAdministrativeService budgetEntiteAdministrativeService;
    @Autowired
    private EntityManager entityManager;

    @Override
    public int save(Budget budget) {
      if (findByAnnee(budget.getAnnee()) != null){
          return -1;
      } else if (budget.getMtTotal().compareTo(budget.getMtPaye())  <0) {
          return -2;
      } else {
          calculerTotal(budget, budget.getBudgetEntiteAdministratives());
            budgetDao.save(budget);
          budgetEntiteAdministrativeService.save(budget, budget.getBudgetEntiteAdministratives());
            return 1;
        }
    }

    private void calculerTotal(Budget budget, List<BudgetEntiteAdministrative> budgetEntiteAdministratives) {
        BigDecimal mtTotal = BigDecimal.valueOf(0);
        for (BudgetEntiteAdministrative budgetEntiteAdministrative : budgetEntiteAdministratives) {
            mtTotal = mtTotal.add(budgetEntiteAdministrative.getBudgetDetail().getMtInvAffecte().add(budgetEntiteAdministrative.getBudgetDetail().getMtFnctAffecte()));
        }
        budget.setMtTotal(mtTotal);
    }
    private void calculerTotalPaye(Budget budget, List<BudgetEntiteAdministrative> budgetEntiteAdministratives) {
        BigDecimal mtPaye = BigDecimal.valueOf(0);
        for (BudgetEntiteAdministrative budgetEntiteAdministrative : budgetEntiteAdministratives) {
            mtPaye = mtPaye.add(budgetEntiteAdministrative.getBudgetDetail().getMtInvPaye().add(budgetEntiteAdministrative.getBudgetDetail().getMtFnctPaye()));
        }
        budget.setMtTotal(mtPaye);
    }
    private void calculerTotalReserve(Budget budget, List<BudgetEntiteAdministrative> budgetEntiteAdministratives) {
        BigDecimal mtReserve = BigDecimal.valueOf(0);
        for (BudgetEntiteAdministrative budgetEntiteAdministrative : budgetEntiteAdministratives) {
            mtReserve = mtReserve.add(budgetEntiteAdministrative.getBudgetDetail().getMtInvReserve().add(budgetEntiteAdministrative.getBudgetDetail().getMtFnctReserve()));
        }
        budget.setMtTotal(mtReserve);
    }
    private void calculerTotalReste(Budget budget, List<BudgetEntiteAdministrative> budgetEntiteAdministratives) {
        BigDecimal mtReste = BigDecimal.valueOf(0);
        for (BudgetEntiteAdministrative budgetEntiteAdministrative : budgetEntiteAdministratives) {
            mtReste = mtReste.add(budgetEntiteAdministrative.getBudgetDetail().getMtInvAffecte().add(budgetEntiteAdministrative.getBudgetDetail().getMtFnctAffecte())).subtract(budgetEntiteAdministrative.getBudgetDetail().getMtInvPaye().add(budgetEntiteAdministrative.getBudgetDetail().getMtFnctPaye()));
        }
        budget.setMtTotal(mtReste);
    }


    @Override
    public List<Budget> search(BudgetVo budgetVo) {
        String q = "select b from Budget b where 1=1";
        if (budgetVo.getDescription() != null) {
            q += " And b.description LIKE '%" + budgetVo.getDescription() + "%'";
        }
        if (budgetVo.getAnneeMin() != null) {
            q += " And b.annee >= '%" + budgetVo.getAnneeMin() + "%'";
        }
        if (budgetVo.getAnneeMax() != null) {
            q += " And b.annee <= '%" + budgetVo.getAnneeMax() + "%'";
        }
        if (budgetVo.getBudgetDetail() != null) {
            q += " And b.budgetDetail = '%" + budgetVo.getBudgetDetail() + "%'";
        }
        return entityManager.createQuery(q).getResultList();
    }

    @Override
    public Budget update(Budget budget) {
        return budgetDao.save(budget);
    }

    @Override
    public int deleteByAnnee(Integer annee) {
        return budgetDao.deleteByAnnee(annee);
    }

    @Override
    public int deleteByAnnee(List<Budget> budgets) {
        int res=0;
        for (int i = 0; i < budgets.size(); i++) {
            res+=deleteByAnnee(budgets.get(i).getAnnee());
        }
        return res;
    }


    @Override
    public Budget findByBudgetDetail(String budgetDetail) {
        return budgetDao.findByBudgetDetail(budgetDetail);
    }

    @Override
    public Budget findByDescription(String description) {
        return budgetDao.findByDescription(description);
    }

    @Override
    public Budget findByAnnee(Integer annee) {
        return budgetDao.findByAnnee(annee);
    }


    @Override
    public List<Budget> findAll() {
        return budgetDao.findAll();
    }


    /* private void calculerTotal(Budget budget, List<BudgetDetail> budgetDetails) {
        BigDecimal mtTotal = BigDecimal.valueOf(0);
        for (BudgetDetail bd :budgetDetails) {
            mtTotal = mtTotal.add(bd.getMtFnctAffecte().add(bd.getMtInvAffecte()));
        }
        budget.setMtTotal(mtTotal);
    }*/


}
