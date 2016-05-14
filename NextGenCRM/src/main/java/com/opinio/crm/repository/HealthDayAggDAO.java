package com.opinio.crm.repository;

import com.opinio.crm.entity.HealthDayAgg;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;

/**
 * Created by Subhodeep on 14/05/16.
 */
public interface HealthDayAggDAO extends MongoRepository<HealthDayAgg, String> {

    List<HealthDayAgg> findByOrderDateBetween(Date fromDate, Date toDate);
}
