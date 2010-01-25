package com.sun.javaee.blueprints.petstore.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")

public class Product implements Serializable {

	private static final long serialVersionUID = 4314723962982287372L;

	private String productID;
    private String categoryID;
    private String name;
    private String description;
    private String imageURL;

    public Product() { }

    public Product(String productID,
            String categoryID,
            String name,
            String description,
            String imageURL) {

        this.productID = productID;
        this.categoryID = categoryID;
        this.name = name;
        this.description =  description;
        this.imageURL = imageURL;
    }

    @Id
    public String getProductID() {
        return this.productID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

}



