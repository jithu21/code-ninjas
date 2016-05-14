package com.opinio.crm.repository;

import com.opinio.crm.dto.OrderByLocation;
import com.opinio.crm.dto.UserLocationBudgetDTO;
import com.opinio.crm.repository.impl.HealthDayAggDAOImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gainsight on 14/05/16.
 */
public interface CustomHealthDayAggDAO {
    List<HashMap> orderCountByDate();
    int getActiveCustomerCount(int n);

    List<OrderByLocation> getOrdersByLocation(int n);

    List<OrderByLocation> getLocationBasedOrderCount(int n);

    Map<String,String> getOrdersByFoodCategory(int i);

    List<UserLocationBudgetDTO> getUserLocationBudget();

    List<OrderByLocation> getHealthBasedOnLocation(int i);
}
