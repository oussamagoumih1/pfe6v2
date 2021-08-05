package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Budget;
import com.example.testpfe.bean.BudgetDetail;
import com.example.testpfe.dao.BudgetDao;
import com.example.testpfe.service.facade.BudgetDetailService;
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
    private EntityManager entityManager;

    @Override
    public Object save(Budget budget, BigDecimal mtInvPayeReliquat) {
        BudgetDetail budgetDetail = budgetDetailService.findByMtInvPayeReliquat(mtInvPayeReliquat);
        if (budgetDetail == null) return -1;
        List<Budget> budgets = budgetDao.findByAnnee(budget.getAnnee());
        if (budgets != null) return -2;
        else {
            BigDecimal mt = BigDecimal.valueOf(0);
            Budget budget1 = budgetDao.findByBudgetDetailMtInvPayeReliquat(mtInvPayeReliquat);
            for (Budget myBudget : budgets) {
                mt = mt.add(myBudget.getBudgetDetail().getMtInvReel().subtract(myBudget.getBudgetDetail().getMtInvPaye()));
                mt = mt.add(budget.getBudgetDetail().getMtInvReel().subtract(myBudget.getBudgetDetail().getMtInvPaye()));
            }
            budgetDetail.setMtInvPayeReliquat(mt);
            budgetDetailService.save(budgetDetail);
            budget.setBudgetDetail(budgetDetail);
            budgetDao.save(budget);
            return 1;
        }
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
    public Budget findByBudgetDetail(String budgetDetail) {
        return budgetDao.findByBudgetDetail(budgetDetail);
    }

    @Override
    public Budget findByDescription(String description) {
        return budgetDao.findByDescription(description);
    }

    @Override
    public List<Budget> findByAnnee(Integer annee) {
        return budgetDao.findByAnnee(annee);
    }


    @Override
    public List<Budget> search(BudgetVo budgetVo) {
        String q =  "select b from Budget b where 1=1";
        if(budgetVo.getDescription()!=null){
            q += " And b.description LIKE '%" + budgetVo.getDescription()+"%'";
        }
        if(budgetVo.getAnneeMin()!=null){
            q += " And b.annee >= '%" + budgetVo.getAnneeMin()+"%'";
        }
        if(budgetVo.getAnneeMax()!=null){
            q += " And b.annee <= '%" + budgetVo.getAnneeMax()+"%'";
        }
        if(budgetVo.getBudgetDetail()!=null){
            q += " And b.budgetDetail = '%" + budgetVo.getBudgetDetail()+"%'";
        }
        return entityManager.createQuery(q).getResultList();
    }

    @Override
    public List<Budget> findAll() {
        return budgetDao.findAll();
    }

    @Override
    public Budget findByBudgetDetailMtInvPayeReliquat(BigDecimal mtInvPayeReliquat) {
        return budgetDao.findByBudgetDetailMtInvPayeReliquat(mtInvPayeReliquat);
    }

}
