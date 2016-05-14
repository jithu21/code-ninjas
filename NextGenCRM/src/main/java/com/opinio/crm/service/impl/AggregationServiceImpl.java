package com.opinio.crm.service.impl;

import com.opinio.crm.entity.*;
import com.opinio.crm.repository.*;
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
    @Autowired
    private BudgetDayAggDAO budgetDayAggDAO;
    @Autowired
    private FoodDayAggDAO foodDayAggDAO;
    @Autowired
    private HealthDayAggDAO healthDayAggDAO;
    @Autowired
    private LocationDayAggDAO locationDayAggDAO;
    @Autowired
    private SatisfactionDayAggDAO satisfactionDayAggDAO;

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
        List<BudgetDayAgg> budgetDayAggs = mapToBudgetDayAgg(dayAggOrder);
        budgetDayAggDAO.insert(budgetDayAggs);
    }

    private List<BudgetDayAgg> mapToBudgetDayAgg(List<Order> dayAggOrder) {
        List<BudgetDayAgg> budgetDayAggs = new LinkedList<>();
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
            budgetDayAggs.add(budgetDayAgg);
        }
        return budgetDayAggs;
    }

    private void performAggByFood() {
        List<FoodDayAgg> foodDayAggs = orderDAO.getDayAggByFood();
        foodDayAggDAO.insert(foodDayAggs);
    }

    private void performAggBySatisfaction() {
        List<SatisfactionDayAgg> satisfactionDayAggs = orderDAO.getDayAggBySatisfaction();
        satisfactionDayAggDAO.insert(satisfactionDayAggs);
    }

    private void performAggByHealth() {
        List<HealthDayAgg> healthDayAggs = orderDAO.getDayAggByHealth();
        healthDayAggDAO.insert(healthDayAggs);
    }

    private void performAggByLocation() {
        List<LocationDayAgg> locationDayAggs = orderDAO.getDayAggByLocation();
        locationDayAggDAO.insert(locationDayAggs);
    }
}
