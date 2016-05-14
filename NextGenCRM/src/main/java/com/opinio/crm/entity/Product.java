package com.opinio.crm.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by Vineet on 14/05/16.
 */
public class Product {

    @Id
    private String id;

    private String name;

    private String description;

    private int price;

    private ProductCategory productCategory;



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
