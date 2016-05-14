package com.opinio.crm;


import com.opinio.crm.config.Application;
import com.opinio.crm.repository.OrderDAO;
import com.opinio.crm.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Vineet on 04/04/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class TestConfiguration {

    @Autowired
    private CustomerService customerService;

    @Autowired
    DataGenerator dataGenerator;

    @Autowired
    private OrderDAO orderDAO;


    @Test
    public void testDataGen() {
        //dataGenerator.cleanData();
        //dataGenerator.generateData();
    }

    @Test
    public void testAggregation() {
        orderDAO.getDayAggByTotalAmount();

    }


}
