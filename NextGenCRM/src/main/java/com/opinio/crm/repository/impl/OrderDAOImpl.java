package com.opinio.crm.repository.impl;

import com.mongodb.CommandResult;
import com.opinio.crm.entity.Order;
import com.opinio.crm.repository.CustomOrderDAO;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

/**
 * Created by Vineet on 14/05/16.
 */
@Repository
public class OrderDAOImpl implements CustomOrderDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Order> getDayAggByTotalAmount() {
        Aggregation agg = newAggregation(
                group("customerId", "orderDate").sum("totalPrice").as("total"),
                project("customerId", "orderDate", "total"),
                sort(Sort.Direction.DESC, "orderDate")

        );

        AggregationResults<Order> groupResults
                = mongoTemplate.aggregate(agg, Order.class, Order.class);
        List<Order> result = groupResults.getMappedResults();
        return result;
    }
}
