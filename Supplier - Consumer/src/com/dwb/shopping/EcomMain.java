package com.dwb.ecommerce;

import java.util.LinkedList;
import java.util.Queue;

public class EcomMain {
    public static void main(String[] args) {
        System.out.println("Starting ECommerce Appln");

        Queue<Product> dataQueue = new LinkedList<>();
        //Queue<Product> dataQueue1 = new LinkedList<>();

        Product soap = new Product("Dove",5);
//        Product perfume = new Product("Perfume",2);

        Supplier supplier = new Supplier("Arasan",soap,dataQueue);
//        Supplier supplier2 = new Supplier("Muthu",perfume,dataQueue);


        Consumer consumer = new Consumer("Consumer1",dataQueue);
//        Consumer consumer2 = new Consumer("Consumer2",dataQueue1);
//        Consumer consumer3 = new Consumer("Consumer3",dataQueue1);
//        Consumer consumer4 = new Consumer("Consumer4",dataQueue1);
//        Consumer consumer5 = new Consumer("Consumer5",dataQueue1);

         Shop shop = new Shop("MyShop",dataQueue);

        Thread sup1 = new Thread(supplier);
//        Thread sup2 = new Thread(supplier2);
        Thread cons = new Thread(consumer);
//        Thread cons2 = new Thread(consumer2);
//        Thread cons3 = new Thread(consumer3);
//        Thread cons4 = new Thread(consumer4);
//        Thread cons5 = new Thread(consumer5);
//        Thread shopThread = new Thread(shop);
        sup1.start();
//        sup2.start();
        cons.start();
//        cons2.start();
//        cons3.start();
//        cons4.start();
//        cons5.start();
//        shopThread.start();

    }

}
