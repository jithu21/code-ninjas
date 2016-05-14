package com.opinio.crm.repository.impl;

import com.opinio.crm.entity.HealthDayAgg;
import com.opinio.crm.repository.CustomHealthDayAggDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.*;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

/**
 * Created by gainsight on 14/05/16.
 */
@Repository
public class HealthDayAggDAOImpl implements CustomHealthDayAggDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Map<String, String> orderCountByDate() {
        Aggregation agg = newAggregation(
                group("orderDate").sum("1").as("totalCustomer").sum("noOfOrders").as("totalOrders"),
                project("totalOrders", "totalCustomer", "orderDate"),
                sort(Sort.Direction.DESC, "orderDate")

        );

        AggregationResults<HashMap> groupResults
                = mongoTemplate.aggregate(agg, HealthDayAgg.class, HashMap.class);
        List<HashMap> result = groupResults.getMappedResults();
        return (Map<String, String>) result;

    }

    @Override
    public int getActiveCustomerCount(int n) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, n);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("orderDate").count().as("totalCustomer"),
                project("totalCustomer")
        );

        AggregationResults<HashMap> groupResults
                = mongoTemplate.aggregate(agg, HealthDayAgg.class, HashMap.class);
        List<HashMap> result = groupResults.getMappedResults();
        return Integer.parseInt((String) result.get(0).get("totalCustomer"));

    }
}
