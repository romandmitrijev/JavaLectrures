package com.lecture.nineteen;


import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
    private List<Product> listOfProducts = new ArrayList<>();

    public void printAllProducts() {
        for (int counter = 0; counter < listOfProducts.size(); counter++) {

            Product exstingProduct = listOfProducts.get(counter);
            System.out.println(exstingProduct.getName() + " " + exstingProduct.getPrice());

        }
    }

    /**
     * This method will insert product. If product exists it will not add.
     * It will print an error
     */
    public void insertProduct(Product incomingProduct) {
        listOfProducts.add(incomingProduct);

    }

    public void removeProduct(int indexOfProduct){
        listOfProducts.remove(indexOfProduct);

    }


    public int getIndexOfProduct(String incomingProductName) {
        for (int counter = 0; counter < listOfProducts.size(); counter++) {
            Product product = listOfProducts.get(counter);
            String nameOfThisProduct = product.getName();
            if (product.getName().equalsIgnoreCase(incomingProductName)) {
                return counter;
            }
        }
        return -1;


    }

}