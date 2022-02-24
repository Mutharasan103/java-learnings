package Ecommerce;

public class EcommerceRunner {
    public static void main(String[] args) throws InterruptedException {

        shop currentStock = new shop();

        supplier1 s1 = new supplier1(currentStock);
        supplier2 s2 = new supplier2(currentStock);
        customer1 c1 = new customer1(currentStock);
        customer2 c2 = new customer2(currentStock);
        customer3 c3 = new customer3(currentStock);
        customer4 c4 = new customer4(currentStock);
        customer5 c5 = new customer5(currentStock);


        Thread t1 =new  Thread(s1);
        Thread t2 =new  Thread(s2);
        Thread t3 =new  Thread(c1);
        Thread t4 =new  Thread(c2);
        Thread t5 =new  Thread(c3);
        Thread t6 =new  Thread(c4);
        Thread t7 =new  Thread(c5);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();
        t6.start();
        t6.join();
        t7.start();
        t7.join();





    }
}
