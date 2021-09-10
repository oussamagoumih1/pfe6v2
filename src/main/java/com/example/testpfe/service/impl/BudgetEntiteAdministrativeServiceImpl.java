package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Budget;
import com.example.testpfe.bean.BudgetEntiteAdministrative;
import com.example.testpfe.dao.BudgetEntiteAdministrativeDao;
import com.example.testpfe.service.facade.BudgetEntiteAdministrativeService;
import com.example.testpfe.service.facade.BudgetService;
import com.example.testpfe.service.facade.EntiteAdministrativeService;
import com.example.testpfe.vo.BudgetEntiteAdministrativeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@SuppressWarnings("ALL")
@Service
public class BudgetEntiteAdministrativeServiceImpl implements BudgetEntiteAdministrativeService {
    @Autowired
    private BudgetEntiteAdministrativeDao budgetEntiteAdministrativeDao;
    @Autowired
    private BudgetService budgetService;
    @Autowired
    private EntiteAdministrativeService entiteAdministrativeService;
    @Autowired
    private EntityManager entityManager;


    @Override
    public List<BudgetEntiteAdministrative> findByEntiteAdministrativeLibelle(String libelle) {
        return budgetEntiteAdministrativeDao.findByEntiteAdministrativeLibelle(libelle);
    }

    @Override
    public List<BudgetEntiteAdministrative> findByBudgetAnnee(Integer annee) {
        return budgetEntiteAdministrativeDao.findByBudgetAnnee(annee);
    }

    @Override
    public int deleteByEntiteAdministrativeLibelle(String libelle) {
        return budgetEntiteAdministrativeDao.deleteByEntiteAdministrativeLibelle(libelle);
    }

    @Override
    public int deleteByBudgetAnnee(Integer annee) {
        return budgetEntiteAdministrativeDao.deleteByBudgetAnnee(annee);
    }

    @Override
    public int save(Budget budget, List<BudgetEntiteAdministrative> budgetEntiteAdministratives ) {
        for (BudgetEntiteAdministrative budgetEntiteAdministrative : budgetEntiteAdministratives) {
            Budget budget1 = budgetService.findByAnnee(budgetEntiteAdministrative.getBudget().getAnnee());
            budgetEntiteAdministrative.setBudget(budget1);
            if (budget1 != null) {
                budgetEntiteAdministrative.setBudget(budget);
                budgetEntiteAdministrativeDao.save(budgetEntiteAdministrative);
            }
        }
        return 1;

    }

    @Override
    public BudgetEntiteAdministrative update(BudgetEntiteAdministrative budgetEntiteAdministrative) {
        return budgetEntiteAdministrativeDao.save(budgetEntiteAdministrative);
    }

    @Override
    public List<BudgetEntiteAdministrative> search(BudgetEntiteAdministrativeVo budgetEntiteAdministrativeVo) {
        String q =  "select bea from BudgetEntiteAdministrative bea where 1=1";
        if(budgetEntiteAdministrativeVo.getBudget()!=null){
            q += " And bea.budget LIKE '%" + budgetEntiteAdministrativeVo.getBudget()+"%'";
        }
        if(budgetEntiteAdministrativeVo.getEntiteAdministrative()!=null){
            q += " And bea.entiteAdministrative = '%" + budgetEntiteAdministrativeVo.getEntiteAdministrative()+"%'";
        }
        if(budgetEntiteAdministrativeVo.getBudgetDetail()!=null){
            q += " And bea.budgetDetail = '%" + budgetEntiteAdministrativeVo.getBudgetDetail()+"%'";
        }
        return entityManager.createQuery(q).getResultList();
    }

    @Override
    public List<BudgetEntiteAdministrative> findAll() {
        return budgetEntiteAdministrativeDao.findAll();
    }


}
