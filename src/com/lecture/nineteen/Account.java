package com.lecture.nineteen;

import com.lecture.twelve.SuperMarketUtilities;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;

    List<Product> listOfBoughtProducts = new ArrayList<>();

    public  void addUpdateProducts (String productName, int amount){
        for (Product boughtExistingProduct: listOfBoughtProducts){
            if (boughtExistingProduct.getName().equalsIgnoreCase(productName)){
                int updatedAmount = boughtExistingProduct.getQuantity()+amount;
                boughtExistingProduct.setQuantity(updatedAmount);
                return;
            }
        }
        Product newProduct = new Product();
        newProduct.setName(productName);
        newProduct.setQuantity(amount);
        listOfBoughtProducts.add(newProduct);
    }
    public boolean deduct(double cost) {
        double threshold = .0001;
        com.lecture.twelve.SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        if (Math.abs(balance - cost) < threshold) {
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;
        } else if (balance > cost) {
            balance = balance - cost;
            balance = superMarketUtilities.round(balance);
            return true;
        } else {
            System.out.println("There is not enough money");
            return false;
        }
    }

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Product> getListOfBoughtProducts() {
        return listOfBoughtProducts;
    }

    public void setListOfBoughtProducts(List<Product> listOfBoughtProducts) {
        this.listOfBoughtProducts = listOfBoughtProducts;
    }
    public void printAccountInfo(){
        System.out.println("--------------");
       for (Product boughtProduct:listOfBoughtProducts){
           System.out.println("Product name:"+boughtProduct.getName()+" Quantity:"+boughtProduct.getQuantity());
       }
        System.out.println("Last Balance:" +balance);
        System.out.println("--------------");
    }
}
