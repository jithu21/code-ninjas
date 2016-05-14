package com.opinio.crm.service;

import com.opinio.crm.entity.Campaign;
import com.opinio.crm.entity.Order;
import com.sun.tools.javac.util.List;

/**
 * Created by Vineet on 14/05/16.
 */
public interface CampaignService {

    void save(Campaign campaign);

    void save(List<Campaign> campaign);

    Campaign getCampaign(String id);

    void delete(Campaign campaign);

    void deleteAll();

    java.util.List<Campaign> getAll();
}
