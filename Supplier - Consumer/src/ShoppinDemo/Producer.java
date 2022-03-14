package ShoppinDemo;

import java.util.Queue;

public class Producer implements Runnable {
    private String supplierName;
    //    private Product product;
    private Queue<Product> supplierQ = null;
    private final boolean stopThread = false;
    Shop shop = new Shop();


    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }

    public Queue<Product> getSupplierQ() {
        return supplierQ;
    }

    public void setSupplierQ(Queue<Product> supplierQ) {
        this.supplierQ = supplierQ;
    }

    public Producer(String supplierName, Queue<Product> supplierQ) {
        this.supplierName = supplierName;
        this.supplierQ = supplierQ;
    }

    @Override
    synchronized public void run() {
        while (!stopThread) {
            if (shop.capacity==0)
            {
                try {
                    shop.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

//                if (supplierQ.size()==0)
//                {
//                    System.out.println("Queue is Empty");
//
//                }
//                else
//
//                    shop.produce();
//
//
//                  System.out.println("Supplier start supply a product to shop");

//                Product product = new Product("Soap", 2);
//                supplierQ.add(product);
//                System.out.println("Product added to the shop: " + supplierQ.size());
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

//            }
//
//
//
//        }
//
//    }
//


