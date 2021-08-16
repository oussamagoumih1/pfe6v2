package com.example.testpfe.service.facade;

import com.example.testpfe.bean.Budget;
import com.example.testpfe.bean.BudgetDetail;
import com.example.testpfe.vo.BudgetDetailVo;

import java.math.BigDecimal;
import java.util.List;

public interface BudgetDetailService {

    int deleteByMtInvReserveReliquat(BigDecimal mtInvReserveReliquat);

    int deleteByMtInvPayeReliquat(BigDecimal mtInvPayeReliquat);


    int save(BudgetDetail budgetDetail);

    BudgetDetail update(BudgetDetail budgetDetail);

    List<BudgetDetail> search(BudgetDetailVo budgetDetailVo);

    int calculerMtInvPayeReliquat(BigDecimal mtInvReel, BigDecimal mtInvPaye);

    int calculerMtInvReserveReliquat(BigDecimal mtInvReel, BigDecimal mtInvReserve, BigDecimal mtInvPaye);

    List<BudgetDetail> findAll();

    BudgetDetail findByMtInvAffecteAndMtFnctAffecte(BigDecimal mtInvAffecte, BigDecimal mtFnctAffecte);


/*

    int save(Integer annee, BigDecimal mtInvReserve, BigDecimal mtFnctReserve, BigDecimal mtInvPaye, BigDecimal mtFnctPaye, BigDecimal mtInvAffecte, BigDecimal mtFnctAffecte);

int  calculerMtTotal(Integer annne);

    BudgetDetail findByMtInvReserve(BigDecimal mtInvReserve);

    BudgetDetail findByMtFnctReserve(BigDecimal mtFnctReserve);

    BudgetDetail findByMtInvReel(BigDecimal mtInvReel);

    BudgetDetail findByMtInvPaye(BigDecimal mtInvPaye);

    BudgetDetail findByMtFnctPaye(BigDecimal mtFnctPaye);

    BudgetDetail findByMtInvAffecte(BigDecimal mtInvAffecte);

    BudgetDetail findByMtFnctAffecte(BigDecimal mtFnctAffecte);

    BudgetDetail findByMtCreditOuvInv(BigDecimal mtCreditOuvInv);

    BudgetDetail findByMtCreditOuvFnct(BigDecimal mtCreditOuvFnct);

    BudgetDetail findByMtInvReelAndMtInvPaye(BigDecimal mtInvReel, BigDecimal mtInvPaye);

    BudgetDetail findByMtInvReelAndMtInvPayeAndMtInvReserve(BigDecimal mtInvReel, BigDecimal mtInvPaye, BigDecimal mtInvReserve);
*/

}
