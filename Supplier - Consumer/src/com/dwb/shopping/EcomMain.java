package com.dwb.shopping;

import java.util.LinkedList;
import java.util.Queue;

public class EcomMain {
    public static void main(String[] args) {
        System.out.println("Starting ECommerce Application");

        Queue<Product> dataQ = new LinkedList<>();
//        Queue<Product> customerQ = new LinkedList<>();


            Product soap = new Product("Dove", 5);
//             Product powder = new Product("Jasmine",10);

            Shop shop = new Shop("Myshop",dataQ);


            Supplier supplier = new Supplier("Arasan", soap, dataQ);
//            Supplier supplier1 = new Supplier("Muthu", powder, supplierQ);

            Consumer consumer = new Consumer("Consumer1", dataQ);
/*
            Consumer consumer2 = new Consumer("Consumer2", dataQueue);
            Consumer consumer3 = new Consumer("Consumer3", dataQueue);
            Consumer consumer4 = new Consumer("Consumer4", dataQueue);
            Consumer consumer5 = new Consumer("Consumer5", dataQueue);
*/

        Thread shopThread = new Thread(shop);
               Thread sup1 = new Thread(supplier);
//            Thread sup2 = new Thread(supplier1);

              Thread cons1 = new Thread(consumer);
/*
            Thread cons2 = new Thread(consumer);
            Thread cons3 = new Thread(consumer);
            Thread cons4 = new Thread(consumer);
            Thread cons5 = new Thread(consumer);
*/


        shopThread.start();

            sup1.start();
//            sup2.start();

            cons1.start();
/*
            cons2.start();
            cons3.start();
            cons4.start();
            cons5.start();
*/


    }

    }

