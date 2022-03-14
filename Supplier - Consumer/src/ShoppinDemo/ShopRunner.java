package ShoppinDemo;

import java.util.LinkedList;
import java.util.Queue;

public class ShopRunner {
    public static void main(String[] args) {
        System.out.println("Application is started: ");

        Queue<Product> dataQ = new LinkedList<>();

        Producer supplier1 = new Producer("Supplier1", dataQ);

        Consumer consumer = new Consumer("Arasan", dataQ);

        Thread sup1 = new Thread(supplier1);

        Thread consumerThread = new Thread(consumer);


        sup1.start();

        consumerThread.start();



//        Queue<Product> dataQ = new LinkedList<>();
//
//
//       // Shop shop = new Shop("My shop",10);
//
//        Producer producer = new Producer("Supplier-1 ",dataQ);
//
//        Consumer consumer = new Consumer("Muthu", dataQ);
//
//
//        Thread supplierThread = new Thread(producer);
//        Thread consumerThread = new Thread(consumer);
//
//
//        supplierThread.start();
//        consumerThread.start();


    }
}
