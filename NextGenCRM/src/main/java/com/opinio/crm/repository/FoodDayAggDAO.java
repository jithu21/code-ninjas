package com.opinio.crm.repository;

import com.opinio.crm.entity.FoodDayAgg;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by Subhodeep on 14/05/16.
 */
public interface FoodDayAggDAO extends MongoRepository<FoodDayAgg, String> {
    List<FoodDayAgg> findByOrderDateBetween(Date fromDate, Date toDate);
}
