package com.opinio.crm.dto;

import com.opinio.crm.entity.BudgetCategory;

/**
 * Created by gainsight on 15/05/16.
 */
public class UserLocationBudgetDTO {
    private String city;
    private int noOfCustomers;
    private BudgetCategory category;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNoOfCustomers() {
        return noOfCustomers;
    }

    public void setNoOfCustomers(int noOfCustomers) {
        this.noOfCustomers = noOfCustomers;
    }

    public BudgetCategory getCategory() {
        return category;
    }

    public void setCategory(BudgetCategory category) {
        this.category = category;
    }
}
