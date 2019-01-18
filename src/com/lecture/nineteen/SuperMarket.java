package com.lecture.nineteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuperMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome admin.");

        while (true){
        System.out.println("What do you want to do: Add, Remove, Done ?");
        String customerInput = scanner.next();
         if (customerInput.equalsIgnoreCase("done")){
             break;
         }else if (customerInput.equalsIgnoreCase("add")){
             System.out.println("Please enter product name");
             String productName = scanner.next();
             if ()

         }






        List<Product> productList = new ArrayList<>();





    }

}
