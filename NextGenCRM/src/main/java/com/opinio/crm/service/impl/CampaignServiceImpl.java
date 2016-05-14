package com.opinio.crm.service.impl;

import com.opinio.crm.entity.Campaign;
import com.opinio.crm.repository.CampaignDAO;
import com.opinio.crm.repository.HealthDayAggDAO;
import com.opinio.crm.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vineet on 14/05/16.
 */
@Service
public class CampaignServiceImpl implements CampaignService {

    @Autowired
    private CampaignDAO campaignDAO;

    @Override
    public void save(Campaign campaign) {
        campaignDAO.save(campaign);

    }

    public void save(List<Campaign> campaign) {
        campaignDAO.save(campaign);

    }

    @Override
    public Campaign getCampaign(String id) {
        return campaignDAO.findOne(id);
    }

    @Override
    public void delete(Campaign campaign) {
        campaignDAO.delete(campaign);
    }

    @Override
    public void deleteAll(){
        campaignDAO.deleteAll();
    }

    @Override
    public List<Campaign> getAll(){
        return campaignDAO.findAll();
    }

    @Override
    public Map<String, Campaign> getCampaignByFoodCategory() {
        List<Campaign> campaigns = campaignDAO.findAll();
        Map<String, Campaign> map = new HashMap<>();
        for (Campaign campaign : campaigns){
            map.put(campaign.getCategory().toString(), campaign);
        }
        return map;
    }

    @Override
    public Map<String, Campaign> getCampaignByLocation() {
        List<Campaign> campaigns = campaignDAO.findAll();
        Map<String, Campaign> map = new HashMap<>();
        for (Campaign campaign : campaigns){
            map.put(campaign.getCity(), campaign);
        }
        return map;
    }


}
