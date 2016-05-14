package com.opinio.crm.repository;

import com.opinio.crm.entity.Campaign;
import com.opinio.crm.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Vineet on 14/05/16.
 */
public interface CampaignDAO extends MongoRepository<Campaign, String> {

}
