package com.opinio.crm.service.impl;

import com.opinio.crm.entity.Customer;
import com.opinio.crm.repository.CustomerDAO;
import com.opinio.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vineet on 14/05/16.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;


    @Override
    public void create(Customer customer) {
        customerDAO.save(customer);

    }

    @Override
    public List<Customer> getCustomers() {
        return customerDAO.findAll();
    }

    @Override
    public void deleteAll(){
        customerDAO.deleteAll();
    }


}
