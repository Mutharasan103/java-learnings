package com.dwb.ecommerce;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Shop implements Runnable{
    private String name;
    private Map<String, Product> products = new HashMap<>();
    private boolean stopThread = false;
    private Queue<Product> dataQ = null;


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

    @Override
    public void run() {
        while(!stopThread) {

            //System.out.println(" Shop is running :" + Thread.currentThread().getName());

            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
