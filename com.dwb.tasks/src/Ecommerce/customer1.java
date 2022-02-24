package Ecommerce;

public class customer1 implements Runnable{
    shop product;

    public customer1(shop product) {
        this.product = product;
    }

    @Override
    synchronized public void run() {
        product.sellProduct(2);
    }

}
