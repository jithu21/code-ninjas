package com.opinio.crm.service.impl;

import com.opinio.crm.dto.GenericResponseDTO;
import com.opinio.crm.entity.*;
import com.opinio.crm.repository.*;
import com.opinio.crm.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Subhodeep on 14/05/16.
 */
@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private HealthDayAggDAO healthDayAggDAO;
    @Autowired
    private LocationDayAggDAO locationDayAggDAO;
    @Autowired
    private FoodDayAggDAO foodDayAggDAO;
    @Autowired
    private SatisfactionDayAggDAO satisfactionDayAggDAO;
    @Autowired
    private BudgetDayAggDAO budgetDayAggDAO;

    @Override
    public List<HealthDayAgg> getCustomerHealth(Date fromDate, Date toDate) {
        return healthDayAggDAO.findByOrderDateBetween(fromDate, toDate);
    }

    @Override
    public List<LocationDayAgg> getCustomerLocation(Date fromDate, Date toDate) {
        return locationDayAggDAO.findByOrderDateBetween(fromDate, toDate);
    }

    @Override
    public List<FoodDayAgg> getCustomerFoodCategory(Date fromDate, Date toDate) {
        return foodDayAggDAO.findByOrderDateBetween(fromDate, toDate);
    }

    @Override
    public List<SatisfactionDayAgg> getCustomerSatisfaction(Date fromDate, Date toDate) {
        return satisfactionDayAggDAO.findByOrderDateBetween(fromDate, toDate);
    }

    @Override
    public List<BudgetDayAgg> getCustomerBudget(Date fromDate, Date toDate) {
        return budgetDayAggDAO.findByOrderDateBetween(fromDate, toDate);
    }

    @Override
    public Map<String, String> getCustomerOrderCount() {
        return (Map<String, String>) healthDayAggDAO.orderCountByDate();
    }

    @Override
    public Map<String, String> getActiveCustomerCount() {
        int countlast7Days = healthDayAggDAO.getActiveCustomerCount(-7);
        int countlast14Days = healthDayAggDAO.getActiveCustomerCount(-14);
        Map<String, String> map = new HashMap<>();
        map.put("Last7Days", countlast7Days + "");
        map.put("Last14Days", countlast14Days + "");
        return map;
    }

    @Override
    public Map<String, String> getOrdersByFoodCategory() {
        Map<String, String> map = healthDayAggDAO.getOrdersByFoodCategory(-7);
        return map;
    }

}
