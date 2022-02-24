package com.dwb.ecommerce;

import java.util.Queue;
import java.util.Random;

public class Consumer implements Runnable {

    private String name;
    private Product product;
    private boolean stopThread = false;
    private Queue<Product> dataQ = null;

    public Consumer(String name, Queue<Product> dataQ) {
        this.name = name;
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

        while(!stopThread){
//            System.out.println("Consumer thread is running : "+ Thread.currentThread().getName());


            Product product = dataQ.poll();
            if(product == null){
                System.out.println("Queue is empty");
            }
            else{
                System.out.println("**********************************");
                System.out.println("Product name:"+product.getName()+" Quantity: "+product.getQuantity() + " Size:"+dataQ.size());
                System.out.println("**********************************");
            }


            try {
                int max = 5;
                int min = 1;
                Random r = new Random();
                final int interval = r.nextInt(max - min + 1) + min;
                Thread.sleep(interval*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
