package Ecommerce;

public class customer3 implements Runnable{
    shop product;

    public customer3(shop product) {
        this.product = product;
    }

    @Override
    synchronized public void run() {
        product.sellProduct2(5);
    }
}
