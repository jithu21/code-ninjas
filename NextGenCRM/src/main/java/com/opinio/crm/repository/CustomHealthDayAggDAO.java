package com.opinio.crm.repository;

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

    List<HealthDayAggDAOImpl.OrderByLocation> getOrdersByLocation(int n);

    Map<String,String> getOrdersByFoodCategory(int i);
}
