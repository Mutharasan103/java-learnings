package Ecommerce;

public class supplier2 implements Runnable {

    shop product;

    public supplier2(shop product) {
        this.product = product;
    }

    @Override
    synchronized public void run() {
        product.getProduct1(5);

    }
}
