package com.opinio.crm.service;

import com.opinio.crm.entity.AggregationType;

/**
 * Created by Subhodeep on 14/05/16.
 */
public interface AggregationService {

    void runAggregation(AggregationType aggType);
}
