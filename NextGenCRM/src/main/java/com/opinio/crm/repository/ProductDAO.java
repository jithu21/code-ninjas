package com.opinio.crm.repository;

import com.opinio.crm.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Vineet on 14/05/16.
 */
public interface ProductDAO extends MongoRepository<Product, String> {




}
