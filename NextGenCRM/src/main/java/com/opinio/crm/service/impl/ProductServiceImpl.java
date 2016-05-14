package com.opinio.crm.service.impl;

import com.opinio.crm.entity.Product;
import com.opinio.crm.repository.ProductDAO;
import com.opinio.crm.service.ProductService;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Vineet on 14/05/16.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;


    @Override
    public void save(Product product) {
        productDAO.save(product);

    }

    @Override
    public void save(List<Product> product) {
        productDAO.save(product);

    }

    @Override
    public Product getProduct(String id) {
        return productDAO.findOne(id);
    }

    @Override
    public void delete(Product product) {
        productDAO.delete(product);
    }
    @Override
    public java.util.List<Product> getProducts(){
        return productDAO.findAll();
    }

}
