package com.opinio.crm.repository;

import com.opinio.crm.entity.SatisfactionDayAgg;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by Subhodeep on 14/05/16.
 */
public interface SatisfactionDayAggDAO extends MongoRepository<SatisfactionDayAgg, String> {
    List<SatisfactionDayAgg> findByOrderDateBetween(Date fromDate, Date toDate);

}
