package com.opinio.crm.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;

/**
 * Created by Subhodeep on 14/05/16.
 */
public class BudgetDayAgg {

    @Id
    private String id;
    private String custId;
    @Indexed
    private Date orderDate;
    @Indexed
    private BudgetCategory budget;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BudgetCategory getBudget() {
        return budget;
    }

    public void setBudget(BudgetCategory budget) {
        this.budget = budget;
    }
}
