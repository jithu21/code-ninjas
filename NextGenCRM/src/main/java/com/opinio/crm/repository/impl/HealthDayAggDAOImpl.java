package com.opinio.crm.repository.impl;

import com.opinio.crm.dto.OrderByLocation;
import com.opinio.crm.dto.UserLocationBudgetDTO;
import com.opinio.crm.entity.BudgetDayAgg;
import com.opinio.crm.entity.FoodDayAgg;
import com.opinio.crm.entity.HealthDayAgg;
import com.opinio.crm.entity.LocationDayAgg;
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
    public List<HashMap> orderCountByDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -10);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("orderDate").count().as("totalCustomer").sum("noOfOrders").as("totalOrders"),
                project("totalOrders", "totalCustomer", "orderDate"),
                sort(Sort.Direction.DESC, "orderDate")
        );

        AggregationResults<HashMap> groupResults
                = mongoTemplate.aggregate(agg, HealthDayAgg.class, HashMap.class);
        List<HashMap> result = groupResults.getMappedResults();
        return result;

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
        return ((Integer) result.get(0).get("totalCustomer"));

    }

    @Override
    public List<OrderByLocation> getOrdersByLocation(int n) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, n);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("city", "area", "orderDate").count().as("totalOrders"),
                project("city", "area", "orderDate", "totalOrders"),
                sort(Sort.Direction.DESC, "orderDate")
        );

        AggregationResults<OrderByLocation> groupResults
                = mongoTemplate.aggregate(agg, LocationDayAgg.class, OrderByLocation.class);
        List<OrderByLocation> result = groupResults.getMappedResults();
        return result;

    }

    @Override
    public List<OrderByLocation> getLocationBasedOrderCount(int n) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, n);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("city", "area").count().as("totalOrders"),
                project("city", "area", "totalOrders"),
                sort(Sort.Direction.DESC, "orderDate")
        );

        AggregationResults<OrderByLocation> groupResults
                = mongoTemplate.aggregate(agg, LocationDayAgg.class, OrderByLocation.class);
        List<OrderByLocation> result = groupResults.getMappedResults();
        return result;

    }


    @Override
    public Map<String, String> getOrdersByFoodCategory(int n) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, n);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("productCategory").count().as("totalOrder"),
                project("totalOrder", "productCategory"),
                sort(Sort.Direction.DESC, "orderDate")

        );

        AggregationResults<HashMap> groupResults
                = mongoTemplate.aggregate(agg, FoodDayAgg.class, HashMap.class);
        List<HashMap> result = groupResults.getMappedResults();
        Map<String, String> response = new HashMap<>();

        for (Map map : result) {
            response.put((String) map.get("productCategory"), (String) map.get("totalOrder"));
        }
        return response;
    }

    @Override
    public List<UserLocationBudgetDTO> getUserLocationBudget() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("city", "budget").count().as("totalCustomer"),
                project("totalCustomer", "city", "budget")
        );

        AggregationResults<UserLocationBudgetDTO> groupResults
                = mongoTemplate.aggregate(agg, BudgetDayAgg.class, UserLocationBudgetDTO.class);
        List<UserLocationBudgetDTO> result = groupResults.getMappedResults();
        return result;
    }

    @Override
    public List<OrderByLocation> getHealthBasedOnLocation(int n) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, n);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("city", "area").count().as("totalOrders"),
                project("city", "area", "totalOrders")
        );

        AggregationResults<OrderByLocation> groupResults
                = mongoTemplate.aggregate(agg, LocationDayAgg.class, OrderByLocation.class);
        List<OrderByLocation> result = groupResults.getMappedResults();
        return result;
    }

}
