package com.opinio.crm.service;

import com.opinio.crm.entity.Product;
import com.sun.tools.javac.util.List;

/**
 * Created by Vineet on 14/05/16.
 */
public interface ProductService {
    void save(Product product);

    void save(List<Product> product);

    Product getProduct(String id);

    void delete(Product product);

    java.util.List<Product> getProducts();
}
