package com.opinio.crm.service.impl;

import com.opinio.crm.entity.Order;
import com.opinio.crm.repository.OrderDAO;
import com.opinio.crm.service.OrderService;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Vineet on 14/05/16.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Override
    public void save(Order order) {
        orderDAO.save(order);

    }

    @Override
    public void save(List<Order> order) {
        orderDAO.save(order);

    }

    @Override
    public Order getOrder(String id) {
        return orderDAO.findOne(id);
    }

    @Override
    public void delete(Order order) {
        orderDAO.delete(order);
    }


}
