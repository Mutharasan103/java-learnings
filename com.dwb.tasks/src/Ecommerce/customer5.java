package Ecommerce;

public class customer5 implements Runnable{
    shop product;

    public customer5(shop product) {
        this.product = product;
    }

    @Override
    synchronized public void run() {
        product.sellProduct4(5);
    }
}
