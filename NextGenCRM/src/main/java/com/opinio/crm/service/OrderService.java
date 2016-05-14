package com.opinio.crm.service;

import com.opinio.crm.entity.Order;
import com.sun.tools.javac.util.List;

/**
 * Created by Vineet on 14/05/16.
 */
public interface OrderService {
    void save(Order order);

    void save(List<Order> order);

    Order getOrder(String id);

    void delete(Order order);
}
