package com.example.testpfe.bean;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity

public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer annee;
    private String description;
    private BigDecimal mt;
    private BigDecimal mtTotal;
    private BigDecimal mtPaye;
    private BigDecimal mtReste;
    private BigDecimal mtReserve;

    @OneToOne
    private BudgetDetail budgetDetail;

    public Budget() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getMt() {
        return mt;
    }

    public void setMt(BigDecimal mt) {
        this.mt = mt;
    }

    public BigDecimal getMtTotal() {
        return mtTotal;
    }

    public void setMtTotal(BigDecimal mtTotal) {
        this.mtTotal = mtTotal;
    }

    public BigDecimal getMtPaye() {
        return mtPaye;
    }

    public void setMtPaye(BigDecimal mtPaye) {
        this.mtPaye = mtPaye;
    }

    public BigDecimal getMtReste() {
        return mtReste;
    }

    public void setMtReste(BigDecimal mtReste) {
        this.mtReste = mtReste;
    }

    public BigDecimal getMtReserve() {
        return mtReserve;
    }

    public void setMtReserve(BigDecimal mtReserve) {
        this.mtReserve = mtReserve;
    }

    public BudgetDetail getBudgetDetail() {
        return budgetDetail;
    }

    public void setBudgetDetail(BudgetDetail budgetDetail) {
        this.budgetDetail = budgetDetail;
    }
}
