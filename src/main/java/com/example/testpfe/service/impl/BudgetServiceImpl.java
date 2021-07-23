package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Budget;
import com.example.testpfe.dao.BudgetDao;
import com.example.testpfe.service.facade.BudgetService;
import com.example.testpfe.vo.BudgetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Service
public class BudgetServiceImpl implements BudgetService {
    @Autowired
    private BudgetDao budgetDao;
    @Autowired
    private EntityManager entityManager;

    @Override
    public Budget save(Budget budget) {
        if (findByAnnee(budget.getAnnee())==null)
        budgetDao.save(budget);
        return budget;
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
        if(budgetVo.getAnnee()!=null){
            q += " And b.annee LIKE '%" + budgetVo.getAnnee()+"%'";
        }
        if(budgetVo.getDescription()!=null){
            q += " And b.description = '%" + budgetVo.getDescription()+"%'";
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

}
