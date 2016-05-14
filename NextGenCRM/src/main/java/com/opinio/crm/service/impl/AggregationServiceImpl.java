package com.opinio.crm.service.impl;

import com.opinio.crm.entity.AggregationType;
import com.opinio.crm.entity.BudgetCategory;
import com.opinio.crm.entity.BudgetDayAgg;
import com.opinio.crm.entity.Order;
import com.opinio.crm.repository.OrderDAO;
import com.opinio.crm.service.AggregationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Subhodeep on 14/05/16.
 */
@Service
public class AggregationServiceImpl implements AggregationService {

    @Autowired
    private OrderDAO orderDAO;

    public void runAggregation(AggregationType aggType) {
        switch (aggType){
            case CUST_LOCATION: performAggByLocation();
                                break;
            case CUST_HEALTH:   performAggByHealth();
                                break;
            case CUST_SATISFACTION: performAggBySatisfaction();
                                    break;
            case FOOD_ORDERED:  performAggByFood();
                                break;
            case BUDGET:        performAggByBudget();
                                break;
        }
    }

    private void performAggByBudget() {
        List<Order> dayAggOrder = orderDAO.getDayAggByTotalAmount();
        LinkedList<BudgetDayAgg> budgetDayAggs = mapToBudgetDayAgg(dayAggOrder);

    }

    private LinkedList<BudgetDayAgg> mapToBudgetDayAgg(List<Order> dayAggOrder) {
        LinkedList<BudgetDayAgg> budgetDayAggs = new LinkedList<>();
        BudgetDayAgg budgetDayAgg;
        for (Order order : dayAggOrder){
            budgetDayAgg = new BudgetDayAgg();
            budgetDayAgg.setCustId(order.getCustomerId());
            budgetDayAgg.setOrderDate(order.getOrderDate());
            if (order.getTotalPrice()<=300)
                budgetDayAgg.setBudget(BudgetCategory.LOW);
            else if (order.getTotalPrice()<=800)
                budgetDayAgg.setBudget(BudgetCategory.MEDIUM);
            else
                budgetDayAgg.setBudget(BudgetCategory.HIGH);
        }
        return null;
    }

    private void performAggByFood() {

    }

    private void performAggBySatisfaction() {

    }

    private void performAggByHealth() {

    }

    private void performAggByLocation() {

    }
}
