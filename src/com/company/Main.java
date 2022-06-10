package com.company;

public class Main {

    public static void main(String[] args) {
        // Variables
        int itemPrice = 50;
        double shippingCost = 0.0;
        double totalPrice = 0.0;

        if (itemPrice >= 100) {
            totalPrice = itemPrice + shippingCost;
            System.out.println("Your shipping is free!");
            System.out.println("Your total price is: " + totalPrice);
        } else {

            shippingCost = itemPrice * .02;
            totalPrice = itemPrice + shippingCost;
            System.out.println("Your shipping cost is: " + shippingCost);
            System.out.println("Your total price is: " + totalPrice);

        }
    }
}
