package com.opinio.crm.service.impl;

import com.opinio.crm.entity.AggregationType;
import com.opinio.crm.repository.OrderDAO;
import com.opinio.crm.service.AggregationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        //orderDAO.
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
