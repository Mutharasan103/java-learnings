package com.dwb.ecommerce;

import java.util.Queue;
import java.util.Random;

public class Supplier implements Runnable{

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

        while(!stopThread) {
//            System.out.println("Supplier thread is running :" + Thread.currentThread().getName());
            Product product = new Product("My Soap",2);
            dataQ.add(product);
            System.out.println("Added product to the queue");
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
