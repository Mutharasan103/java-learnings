package Multithreading;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Producer producer = new Producer("Producer", shop);

        Consumer consumer = new Consumer("Consumer", shop);

        Thread producerThread = new Thread(producer);

        Thread consumerThread = new Thread(consumer);

        producerThread.start();

        consumerThread.start();



    }
}

