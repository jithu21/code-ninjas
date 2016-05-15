package com.opinio.crm.repository.impl;

import com.opinio.crm.entity.*;
import com.opinio.crm.repository.CustomOrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
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
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("customerId", "orderDate", "city").sum("totalPrice").as("total"),
                project("customerId", "orderDate", "total", "city"),
                sort(Sort.Direction.DESC, "orderDate")

        );

        AggregationResults<Order> groupResults
                = mongoTemplate.aggregate(agg, Order.class, Order.class);
        List<Order> result = groupResults.getMappedResults();
        return result;
    }

    @Override
    public List<FoodDayAgg> getDayAggByFood() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("productInfoList.productCategory", "customerId", "orderDate"),
                project("productInfoList.productCategory", "customerId", "orderDate"),
                sort(Sort.Direction.DESC, "orderDate")

        );

        AggregationResults<FoodDayAggResult> groupResults
                = mongoTemplate.aggregate(agg, Order.class, FoodDayAggResult.class);
        List<FoodDayAggResult> result = groupResults.getMappedResults();
        List<FoodDayAgg> foodDayAggs = new LinkedList<>();
        result.stream().forEach(foodDayAggResult -> {
            foodDayAggResult.productCategory.forEach(productCategory ->
                    foodDayAggs.add(new FoodDayAgg(foodDayAggResult.customerId, foodDayAggResult.orderDate, productCategory)));
        });
        return foodDayAggs;
    }

    private class FoodDayAggResult {
        private String customerId;
        private Date orderDate;
        private List<ProductCategory> productCategory;

        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public Date getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
        }

        public List<ProductCategory> getProductCategory() {
            return productCategory;
        }

        public void setProductCategory(List<ProductCategory> productCategory) {
            this.productCategory = productCategory;
        }
    }

    @Override
    public List<SatisfactionDayAgg> getDayAggBySatisfaction() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("customerId", "orderDate").avg("customerRating").as("customerRating"),
                project("customerId", "orderDate", "customerRating"),
                sort(Sort.Direction.DESC, "orderDate")

        );

        AggregationResults<SatisfactionDayAgg> groupResults
                = mongoTemplate.aggregate(agg, Order.class, SatisfactionDayAgg.class);
        List<SatisfactionDayAgg> result = groupResults.getMappedResults();
        return result;
    }

    @Override
    public List<HealthDayAgg> getDayAggByHealth() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("customerId", "orderDate").count().as("noOfOrders"),
                project("customerId", "orderDate", "noOfOrders"),
                sort(Sort.Direction.DESC, "orderDate")

        );

        AggregationResults<HealthDayAgg> groupResults
                = mongoTemplate.aggregate(agg, Order.class, HealthDayAgg.class);
        List<HealthDayAgg> result = groupResults.getMappedResults();
        return result;
    }

    @Override
    public List<LocationDayAgg> getDayAggByLocation() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date startDate = cal.getTime();
        Aggregation agg = newAggregation(
                match(Criteria.where("orderDate").gt(startDate)),
                group("customerId", "city", "area", "orderDate"),
                project("customerId", "city", "area", "orderDate"),
                sort(Sort.Direction.DESC, "orderDate")

        );

        AggregationResults<LocationDayAgg> groupResults
                = mongoTemplate.aggregate(agg, Order.class, LocationDayAgg.class);
        List<LocationDayAgg> result = groupResults.getMappedResults();
        return result;
    }
}
