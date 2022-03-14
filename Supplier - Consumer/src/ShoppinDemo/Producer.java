package ShoppinDemo;

import com.dwb.shopping.Product;

import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Integer> dataQ;


    public Consumer(Queue<Integer> dataQ) {
        this.dataQ = dataQ;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (dataQ) {
                System.out.println("Consumer is waiting for producer produce a product ");
                try {
                    dataQ.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int data = dataQ.poll();
            System.out.println("Consumer consumed: " + data);
            dataQ.notify();


        }
    }
}

