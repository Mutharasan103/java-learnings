package ShoppinDemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Shop {
    private String name;
    private boolean stopThread = false;
    public Queue<Product> supplierQ = new LinkedList<>();
    private Queue<Product> ConsumerQ = new LinkedList<>();
    public int capacity = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Queue<Product> getSupplierQ() {
        return supplierQ;
    }

    public void setSupplierQ(Queue<Product> supplierQ) {
        this.supplierQ = supplierQ;
    }


    synchronized public void produce() throws InterruptedException {
        while (!stopThread) {
            //   if (supplierQ.size()==0)
            {
                Product product = new Product("Soap", 1);
                supplierQ.add(product);
                System.out.println("Product added to the shop " + supplierQ.size());
                capacity = supplierQ.size();
                System.out.println(" Total Capacity of shop " + capacity);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    synchronized public void consume() throws InterruptedException {
        while (!stopThread) {
                Product product = ConsumerQ.poll();
                if (product==null)
                {
                    System.out.println("Queue is Empty");
                }
                else
                {
                    System.out.println("Consumer consume product from shop: " + supplierQ.size());
                    capacity = supplierQ.size();
                    System.out.println("The size of shop is " + capacity);
                    notifyAll();
                }



            try {
                int max = 5;
                int min = 1;
                Random r = new Random();
                final int interval = r.nextInt(max - min + 1) + min;
                Thread.sleep(interval * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}



//}
//}
//    public void produce(Product product) {
//        while (!stopThread) {
//            if (supplierQ.size() == 0) {
//                System.out.println("Shop is Empty");
//                try {
//                    supplierQ.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            } else {
//                int counter = 1;
//                supplierQ.add(product);
//                System.out.println("Product added to the shop: " + supplierQ.size());
//                counter = supplierQ.size();
//            }
//            supplierQ.notify();
//        }
//
//    }
//
//    public void consume(Product product) {
//        while (!stopThread) {
//            product = consumerQ.poll();
//            if (product==null)
//            {
//                System.out.println("Queue is Empty: ");
//            }
//            else {
//                System.out.println("----------------------------------------------------------------------------------");
//                System.out.println("Customer buying a product");
//                // product = consumerQ.poll();
//                System.out.println("Product Name: " + product.getName() + " Product Quantity: " + product.getQuantity() +" Size: " + consumerQ.size());
//                System.out.println("----------------------------------------------------------------------------------");
//            }
//            try {
//                consumerQ.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//
//    }
//}

//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }

//    public Shop(String name, int count) {
//        this.name = name;
//        this.count = count;
//    }
//    public void incrementCount()
//    {
//        count++;
//    }

    //     synchronized void produce(int maxSize)
//      {
//          System.out.println("Producer produces a product to shop");
//          if (maxSize<supplierQ.size())
//          {
//              System.out.println("Shop is full");
//              try {
//                  wait();
//              } catch (InterruptedException e) {
//                  e.printStackTrace();
//              }
//          }
//          maxSize = maxSize - supplierQ.size();
//          System.out.println("Producer produce a product");


//            Queue<Product> dataQ = new LinkedList<>();  
//            Product product = new Product("Soap",10);
//            dataQ.add(product);
//            if (dataQ.size()>maxSize)
//            {
//                System.out.println("Shop is full");
//                try {
//                   producer.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            dataQ.poll();
//            notify();
//            int counter = 0;
//            for (int i=0; i<=maxSize;i++)
//            {
//               int size = supplierQ.size();
//                System.out.println("The size of Shop is: "+size);
//                counter++;
//            }
           //System.out.println("SHop is running");
//        }




