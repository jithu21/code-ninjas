package com.opinio.crm.repository;

import com.opinio.crm.entity.LocationDayAgg;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Subhodeep on 14/05/16.
 */
public interface LocationDayAggDAO extends MongoRepository<LocationDayAgg, String> {
}
