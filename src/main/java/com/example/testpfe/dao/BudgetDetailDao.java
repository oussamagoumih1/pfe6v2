package com.example.testpfe.dao;

<<<<<<< HEAD
public interface BudgetDetailDao {
=======
import com.example.testpfe.bean.BudgetDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface BudgetDetailDao extends JpaRepository <BudgetDetail, Long> {

    BudgetDetail findByMtInvReserve (BigDecimal mtInvReserve);

    BudgetDetail findByMtInvReelAndMtInvPayeAndMtInvReserve (BigDecimal mtInvReel, BigDecimal mtInvPaye, BigDecimal mtInvReserve);

    BudgetDetail findByMtInvReserveReliquat (BigDecimal mtInvReserveReliquat);

    BudgetDetail findByMtInvPayeReliquat (BigDecimal mtInvPayeReliquat);

    BudgetDetail findByMtFnctAffecte (BigDecimal mtFnctAffecte);

    BudgetDetail findByMtInvAffecte (BigDecimal mtInvAffecte);

    BudgetDetail findByMtCreditOuvInv (BigDecimal mtCreditOuvInv);

    BudgetDetail findByMtCreditOuvFnct (BigDecimal mtCreditOuvFnct);

    BudgetDetail findByMtInvReel (BigDecimal mtInvReel);

    BudgetDetail findByMtInvPaye (BigDecimal mtInvPaye);

    BudgetDetail findByMtInvReelAndMtInvPaye (BigDecimal mtInvReel, BigDecimal mtInvPaye);

    int deleteByMtInvReserveReliquat (BigDecimal mtInvReserveReliquat);

    int deleteByMtInvPayeReliquat (BigDecimal mtInvPayeReliquat);


>>>>>>> branch 'master' of https://github.com/oussamagoumih1/pfe6v2/
}
