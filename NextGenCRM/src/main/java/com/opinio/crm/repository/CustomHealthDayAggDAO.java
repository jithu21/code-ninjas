package com.opinio.crm.repository;

import java.util.Map;

/**
 * Created by gainsight on 14/05/16.
 */
public interface CustomHealthDayAggDAO {
    Map<String, String> orderCountByDate();
    int getActiveCustomerCount(int n);
}
