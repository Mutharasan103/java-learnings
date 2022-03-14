package com.dwb.shopping;

import java.util.Queue;
import java.util.Random;

public class Supplier implements Runnable {

    private String name;
    private Product product;
    private Queue<Product> dataQ = null;
    private boolean stopThread = false;


    public Supplier(String name, Product product, Queue<Product> dataQ) {
        this.name = name;
        this.product = product;
        this.dataQ = dataQ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (!stopThread) {
            Product product = new Product("Dove", 2);
            dataQ.add(product);
            System.out.println("Added product to the queue:  " + "Product name is: "+product.getName()+" " + dataQ.size());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}

//        System.out.println("Producer start producing....");
//        for (int i=1;i<=10;i++) {
//            try {
//                shop.produce(i);
//                dataQ.add(product);
//                System.out.println("Added product to the queue:  " + dataQ.size());
//
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//        for (int i=1; i<=Max_Size;i++)


//            System.out.println("Waiting for customer buy a product");
//            try {
//                dataQ.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }








