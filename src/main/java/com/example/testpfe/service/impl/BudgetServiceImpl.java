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
    public int save(Budget budget, BigDecimal mtInvPayeReliquat) {
        BudgetDetail budgetDetail = budgetDetailService.findByMtInvPayeReliquat(mtInvPayeReliquat);
        if (budgetDetail == null) return -1;
        Budget b = budgetDao.findByAnnee(budget.getAnnee());
        if (b != null) return -2;
        BigDecimal somme = (budgetDetail.getMtInvPaye().add(b.getMt()));
        BigDecimal mtTotal = (budgetDetail.getMtInvAffecte().add(budgetDetail.getMtFnctAffecte()));

        if (somme.compareTo(mtTotal) > 0)
            return -3;
        else {
            budgetDetail.setMtInvPaye(somme);
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
    public Budget findByAnnee(Integer annee) {
        return budgetDao.findByAnnee(annee);
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
    public List<Budget> findAll() {
        return budgetDao.findAll();
    }


    @Override
    public Budget findByMtTotal(BigDecimal mtTotal) {
        return budgetDao.findByMtTotal(mtTotal);
    }

    @Override
    public Budget findByMtPaye(BigDecimal mtPaye) {
        return budgetDao.findByMtPaye(mtPaye);
    }

    @Override
    public Budget findByMtReserve(BigDecimal mtReserve) {
        return budgetDao.findByMtReserve(mtReserve);
    }

    @Override
    public Budget findByMtReste(BigDecimal mtReste) {
        return budgetDao.findByMtReste(mtReste);
    }

    @Override
    public Budget findByMt(BigDecimal mt) {
        return budgetDao.findByMt(mt);
    }

}
