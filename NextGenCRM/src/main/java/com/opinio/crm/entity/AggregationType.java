package com.opinio.crm.entity;

/**
 * Created by Subhodeep on 14/05/16.
 */
public enum AggregationType {

    CUST_LOCATION("locationDayAgg"), CUST_HEALTH("healthDayAgg"), FOOD_ORDERED("foodDayAgg"), CUST_SATISFACTION("satisfactionDayAgg")
    , BUDGET("budgetDayAgg");

    private String collectionName;

    AggregationType(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCollectionName() {
        return collectionName;
    }
}
