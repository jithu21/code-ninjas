package com.opinio.crm.repository;

import com.opinio.crm.entity.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Vineet on 14/05/16.
 */
public interface CustomOrderDAO {

    List<Order> getDayAggByTotalAmount();

    List<FoodDayAgg> getDayAggByFood();

    List<SatisfactionDayAgg> getDayAggBySatisfaction();

    List<HealthDayAgg> getDayAggByHealth();

    List<LocationDayAgg> getDayAggByLocation();




}
