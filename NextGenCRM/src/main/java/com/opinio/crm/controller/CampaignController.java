package com.opinio.crm.controller;

import com.opinio.crm.entity.Campaign;
import com.opinio.crm.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static org.springframework.http.ResponseEntity.ok;

/**
 * Created by Vineet on 14/05/16.
 */

@RestController("/campaign")
@CrossOrigin
public class CampaignController {
    @Autowired
    private CampaignService campaignService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity.BodyBuilder createCampaign(@RequestBody Campaign campaign) {
        campaignService.save(campaign);
        return ResponseEntity.ok();

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Campaign> getCampaigns() {
        return campaignService.getAll();

    }


    @RequestMapping(value = "/campaignByFoodCategory", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Campaign> getCampaignByFoodCategory() {
        return campaignService.getCampaignByFoodCategory();

    }

    @RequestMapping(value = "/campaignByLocation", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Campaign> getCampaignByLocation() {
        return campaignService.getCampaignByLocation();

    }

}
