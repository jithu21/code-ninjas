package com.opinio.crm.service;

import com.opinio.crm.entity.Customer;

import java.util.List;

/**
 * Created by Vineet on 14/05/16.
 */
public interface CustomerService {


    void create(Customer customer);

    List<Customer> getCustomers();

    void deleteAll();
}
