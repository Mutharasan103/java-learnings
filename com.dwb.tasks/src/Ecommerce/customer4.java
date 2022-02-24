package Ecommerce;

public class customer4 implements Runnable{
    shop product;

    public customer4(shop product) {
        this.product = product;
    }

    @Override
    synchronized public void run() {
        product.sellProduct3(4);
    }
}
