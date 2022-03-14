package com.dwb.shopping;


import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Shop implements Runnable {
    private String name;
    private Map<String, Product> products = new HashMap<>();
    private boolean stopThread = false;
    private Queue<Product> dataQ = null;
    private Queue<Product> customerQ = null;

    public Shop(String name, Queue<Product> dataQ) {
        this.name = name;
        this.dataQ = dataQ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Queue<Product> getDataQ() {
        return dataQ;
    }

    public void setDataQ(Queue<Product> dataQ) {
        this.dataQ = dataQ;
    }

    public Queue<Product> getCustomerQ() {
        return customerQ;
    }

    public void setCustomerQ(Queue<Product> customerQ) {
        this.customerQ = customerQ;
    }

    public void run() {
        while (!stopThread) {

           // System.out.println(" Shop is running :" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



//    public Shop(String name, Queue<Product> supplierQ, Queue<Product> customerQ) {
//        this.name = name;
//        this.supplierQ = supplierQ;
//        this.customerQ = customerQ;
//    }
    //       public Shop(String name, Queue<Product> dataQ) {
//        this.name = name;
//        this.supplierQ = dataQ;
//    }
//
//    public Queue<Product> getCustomerQ() {
//        return customerQ;
//    }
//
//    public void setCustomerQ(Queue<Product> customerQ) {
//        this.customerQ = customerQ;
//    }
//
//    public Shop(Queue<Product> customerQ) {
//        this.customerQ = customerQ;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//   synchronized void produce(Product product) throws InterruptedException {
//        if (stopThread)
//        {
//            System.out.println("Producer is waiting to produce a product");
//            wait();
//        }
//
//        stopThread = true;
//        notify();
//    }
//   synchronized void consume(Product product) throws InterruptedException {
//        if (!stopThread)
//        {
//            System.out.println("Consumer is waiting to produce a product");
//            wait();
//        }
//        //item = product;
//        stopThread = false;
//        notify();
//    }




