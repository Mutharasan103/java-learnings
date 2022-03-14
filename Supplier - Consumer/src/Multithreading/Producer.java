package Multithreading;

public class Producer implements Runnable {
    private String producerName ;
    private Shop shop;

    public Producer(String producerName, Shop shop) {
        this.producerName = producerName;
        this.shop = shop;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public void run() {
        produce();
    }

    private void produce() {
        while(true){
            Product product = shop.push();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println(getProducerName() + " produced " + product);
        }
    }
}
