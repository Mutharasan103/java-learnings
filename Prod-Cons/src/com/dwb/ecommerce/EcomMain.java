package com.dwb.ecommerce;

import java.util.LinkedList;
import java.util.Queue;

public class EcomMain {
    public static void main(String[] args) {
        System.out.println("Starting ECommerce Appln");

        Queue<Product> dataQueue = new LinkedList<>();


        Product soap = new Product("Dove",5);


        Supplier supplier = new Supplier("Arasan",soap,dataQueue);

        Consumer consumer = new Consumer("Consumer1",dataQueue);

         Shop shop = new Shop("MyShop",dataQueue);

        Thread sup1 = new Thread(supplier);

        Thread cons = new Thread(consumer);

        sup1.start();

        cons.start();



    }

}
