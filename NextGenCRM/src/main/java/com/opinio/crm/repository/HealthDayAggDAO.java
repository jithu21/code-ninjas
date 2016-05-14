package com.opinio.crm.repository;

import com.opinio.crm.entity.HealthDayAgg;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Subhodeep on 14/05/16.
 */
public interface HealthDayAggDAO extends MongoRepository<HealthDayAgg, String>,CustomHealthDayAggDAO {

    List<HealthDayAgg> findByOrderDateBetween(Date fromDate, Date toDate);
}
