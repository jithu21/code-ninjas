package com.opinio.crm.service.impl;

import com.opinio.crm.entity.Campaign;
import com.opinio.crm.repository.CampaignDAO;
import com.opinio.crm.service.CampaignService;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
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
    public java.util.List<Campaign> getAll(){
        return campaignDAO.findAll();
    }



}
