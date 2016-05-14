package com.opinio.crm.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;

/**
 * Created by Subhodeep on 14/05/16.
 */
public class FoodDayAgg {

    @Id
    private String id;
    private String customerId;
    @Indexed
    private Date orderDate;
    @Indexed
    private ProductCategory productCategory;

    public FoodDayAgg(String customerId, Date orderDate, ProductCategory productCategory) {
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.productCategory = productCategory;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
