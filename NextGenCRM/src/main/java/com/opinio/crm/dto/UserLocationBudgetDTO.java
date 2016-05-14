package com.opinio.crm.dto;

import com.opinio.crm.entity.BudgetCategory;

/**
 * Created by gainsight on 15/05/16.
 */
public class UserLocationBudgetDTO {
    private String city;
    private int totalCustomer;
    private BudgetCategory budget;

    public int getTotalCustomer() {
        return totalCustomer;
    }

    public void setTotalCustomer(int totalCustomer) {
        this.totalCustomer = totalCustomer;
    }

    public BudgetCategory getBudget() {
        return budget;
    }

    public void setBudget(BudgetCategory budget) {
        this.budget = budget;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
