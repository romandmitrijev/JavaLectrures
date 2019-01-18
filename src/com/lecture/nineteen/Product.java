package com.lecture.nineteen;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private String productName;
    private double productPrice;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public boolean validateProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            System.out.println("There is nothing in the list right now");
            return false;
        }return true;

    }
    public Double round(Double val) {
        return new BigDecimal(val.toString()).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }


}
