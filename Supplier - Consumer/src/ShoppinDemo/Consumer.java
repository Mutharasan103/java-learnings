package ShoppinDemo;

import java.util.LinkedList;
import java.util.Queue;

public class Consumer implements Runnable {
    private String consumerName;
    private Queue<Product> consumerQ = null;
    private boolean stopThread = false;
    Shop shop = new Shop();


    public Queue<Product> getConsumerQ() {
        return consumerQ;
    }

    public void setConsumerQ(Queue<Product> consumerQ) {
        this.consumerQ = consumerQ;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }


    public Consumer(String consumerName, Queue<Product> consumerQ) {
        this.consumerName = consumerName;
        this.consumerQ = consumerQ;
    }

    @Override
    public void run() {
        // System.out.println("Consumer consume a product: " + Thread.currentThread().getName());
        while (!stopThread) {

            try {
                shop.consume();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




//           Product product = consumerQ.poll();
//
//            if (product == null)
//            {
//                System.out.println("Queue is Empty: ");
//            }
//
//            else
//            {
//                System.out.println("----------------------------------------------------------------------------------");
//                System.out.println("Customer buying a product");
//               // product = consumerQ.poll();
//                System.out.println("Product Name: " + product.getName() + " Product Quantity: " + product.getQuantity() +" Size: " + consumerQ.size());
//                System.out.println("----------------------------------------------------------------------------------");
//            }
//
//            try {
//                int max = 5;
//                int min = 1;
//                Random r = new Random();
//                final int interval = r.nextInt(max - min + 1) + min;
//                Thread.sleep(interval*2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        }
//    }
// if (consumerQ.isEmpty())
//           {
//               try {
//                   consumerQ.wait();
//               } catch (InterruptedException e) {
//                   e.printStackTrace();
//               }
//           }

