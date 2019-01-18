package com.lecture.nineteen;

public class Product {
    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

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


}
