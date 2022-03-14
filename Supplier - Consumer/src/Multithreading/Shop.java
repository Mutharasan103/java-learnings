package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class Shop {
    private int base = 0;
    private int top = 0;
    private int i=0;
    private Product[] products = new Product[10];


    public synchronized Product push(){
        i++;
        Product product = new Product(i);
        while(top==products.length){
            try {
                System.out.println("Shop is full. Waiting...");
                wait();
            }catch (InterruptedException e) {

            }
        }
        products[top] = product;
        top++;
        notifyAll();
        return product;
    }

    public synchronized Product pop() {
        Product product = null;
        while (top == base) {
            try {
                System.out.println("Store house is empty. Waiting...");
                wait();
            } catch (InterruptedException e) {

            }
        }
        top--;
        product = products[top];
        products[top] = null;
        notifyAll();
        return product;
    }
}

