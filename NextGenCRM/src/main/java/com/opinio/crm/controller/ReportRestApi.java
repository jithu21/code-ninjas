package com.opinio.crm.controller;

import com.opinio.crm.entity.HealthDayAgg;
import com.opinio.crm.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Subhodeep on 14/05/16.
 */
@RestController("/report")
@CrossOrigin
public class ReportRestApi {

    @Autowired
    private ReportService reportService;

    @RequestMapping(value = "/customerHealth/{fromDate}/{toDate}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getCustomerHealth(@PathVariable @DateTimeFormat(pattern = "ddMMyyyy") Date fromDate, @PathVariable @DateTimeFormat(pattern = "ddMMyyyy") Date toDate) {
        return new ResponseEntity(reportService.getCustomerHealth(fromDate, toDate), HttpStatus.OK);
    }

    @RequestMapping(value = "/customerBudget/{fromDate}/{toDate}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getCustomerBudget(@PathVariable @DateTimeFormat(pattern = "ddMMyyyy") Date fromDate, @PathVariable @DateTimeFormat(pattern = "ddMMyyyy") Date toDate) {
        return new ResponseEntity(reportService.getCustomerBudget(fromDate, toDate), HttpStatus.OK);
    }

    @RequestMapping(value = "/customerFoodCategory/{fromDate}/{toDate}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getCustomerFoodCategory(@PathVariable @DateTimeFormat(pattern = "ddMMyyyy") Date fromDate, @PathVariable @DateTimeFormat(pattern = "ddMMyyyy") Date toDate) {
        return new ResponseEntity(reportService.getCustomerFoodCategory(fromDate, toDate), HttpStatus.OK);
    }

    @RequestMapping(value = "/customerLocation/{fromDate}/{toDate}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getCustomerLocation(@PathVariable @DateTimeFormat(pattern = "ddMMyyyy") Date fromDate, @PathVariable @DateTimeFormat(pattern = "ddMMyyyy") Date toDate) {
        return new ResponseEntity(reportService.getCustomerLocation(fromDate, toDate), HttpStatus.OK);
    }

    @RequestMapping(value = "/customerSatisfaction/{fromDate}/{toDate}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getCustomerSatisfaction(@PathVariable @DateTimeFormat(pattern = "ddMMyyyy") Date fromDate, @PathVariable @DateTimeFormat(pattern = "ddMMyyyy") Date toDate) {
        return new ResponseEntity(reportService.getCustomerSatisfaction(fromDate, toDate), HttpStatus.OK);
    }

    @RequestMapping(value = "/customerOrderCount", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getCustomerOrderCount() {
        return new ResponseEntity(reportService.getCustomerOrderCount(), HttpStatus.OK);
    }

    @RequestMapping(value = "/activeCustomerCount", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getActiveCustomerCount() {
        return new ResponseEntity(reportService.getActiveCustomerCount(), HttpStatus.OK);
    }

    @RequestMapping(value = "/ordersByFoodCategory", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getOrdersByFoodCategory() {
        return new ResponseEntity(reportService.getOrdersByFoodCategory(), HttpStatus.OK);
    }

    @RequestMapping(value = "/ordersBasedOnLocation", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getOrdersBasedOnLocation() {
        return new ResponseEntity(reportService.getLocationBasedOrderCount(), HttpStatus.OK);
    }


    @RequestMapping(value = "/healthBasedOnLocation", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getHealthBasedOnLocation() {
        return new ResponseEntity(reportService.getHealthBasedOnLocation(), HttpStatus.OK);
    }


    @RequestMapping(value = "/userLocationBudget", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getUserLocationBudget() {
        return new ResponseEntity(reportService.getUserLocationBudget(), HttpStatus.OK);
    }


}
