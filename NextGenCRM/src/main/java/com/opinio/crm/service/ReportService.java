package com.opinio.crm.service;

import com.opinio.crm.dto.GenericResponseDTO;
import com.opinio.crm.dto.OrderByLocation;
import com.opinio.crm.dto.UserLocationBudgetDTO;
import com.opinio.crm.entity.*;
import com.opinio.crm.repository.impl.HealthDayAggDAOImpl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Subhodeep on 14/05/16.
 */
public interface ReportService {
    List<HealthDayAgg> getCustomerHealth(Date fromDate, Date toDate);
    List<LocationDayAgg> getCustomerLocation(Date fromDate, Date toDate);
    List<FoodDayAgg> getCustomerFoodCategory(Date fromDate, Date toDate);
    List<SatisfactionDayAgg> getCustomerSatisfaction(Date fromDate, Date toDate);
    List<BudgetDayAgg> getCustomerBudget(Date fromDate, Date toDate);

    List<HashMap> getCustomerOrderCount();

    Map<String, String> getActiveCustomerCount();

    Map<String, List<OrderByLocation>> getLocationBasedOrderCount();

    List<OrderByLocation> getOrderByLocation();

    Map<String, String> getOrdersByFoodCategory();

    List<UserLocationBudgetDTO> getUserLocationBudget();

    List<OrderByLocation> getHealthBasedOnLocation();
}
