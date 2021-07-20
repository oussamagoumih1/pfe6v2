package com.example.testpfe.vo;

public class BudgetVo {
    private Long id;
    private Integer annee;
    private String description;
    private BudgetDetailVo budgetDetail;

    public BudgetVo() {
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

    public BudgetDetailVo getBudgetDetail() {
        return budgetDetail;
    }

    public void setBudgetDetail(BudgetDetailVo budgetDetail) {
        this.budgetDetail = budgetDetail;
    }
}
