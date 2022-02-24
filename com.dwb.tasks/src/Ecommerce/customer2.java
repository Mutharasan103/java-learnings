package Ecommerce;

public class customer2 implements Runnable{
    shop product;

    public customer2(shop product) {
        this.product = product;
    }

    @Override
    synchronized public void run() {
        product.sellProduct1(3);
    }
}


