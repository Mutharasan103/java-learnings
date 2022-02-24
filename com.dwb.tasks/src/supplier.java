import Ecommerce.shop;

public class supplier implements Runnable {
    shop product;

    shop supplier1 = new shop();
    shop supplier2 = new shop();

    public supplier(shop product) {
        this.product = product;
    }

    @Override
    public void run() {
        supplier1.getProduct(10);
        supplier2.getProduct(5);

    }

}
