package Multithreading;

public class Consumer implements Runnable {
    private String consumerName = null;

    private Shop shop = null;

    public Consumer(String consumerName, Shop shop) {
        this.consumerName = consumerName;
        this.shop = shop;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void Consume() {
        while (true) {
            Product product = shop.pop();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println(getConsumerName() + " consumed " + product);
        }
    }

    @Override
    public void run() {
        Consume();
    }
}

