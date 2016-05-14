package com.opinio.crm.repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by gainsight on 14/05/16.
 */
public interface CustomHealthDayAggDAO {
    List<HashMap> orderCountByDate();
    int getActiveCustomerCount(int n);
}
