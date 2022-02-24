package Ecommerce;

public class supplier1 implements Runnable {

    shop product;

    public supplier1(shop product) {
        this.product = product;
    }

    @Override
    synchronized public void run() {
        product.getProduct(10);

    }
}
