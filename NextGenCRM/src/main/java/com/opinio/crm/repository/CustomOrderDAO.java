package com.opinio.crm.repository;

import com.opinio.crm.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Vineet on 14/05/16.
 */
public interface CustomOrderDAO extends MongoRepository<Order, String> {

    @Query("aggregate([{\"$group\":{\"_id\":{\"customerId\":\"$customerId\", \"orderDate\":\"$orderDate\"},\"customerId\":{\"$first\":\"$customerId\"},\"cost\":{\"$sum\":\"$totalPrice\"}, \"date\":{\"$first\":\"$orderDate\"}}}, {\"$project\":{\"customerId\":1, \"cost\":1, \"date\":1,\"_id\":0}}])")
    List<Order> getDayAggByTotalAmount();
}
