package ThreadConcurrency;

public class ThreadOddEven {
    int counter = 1;
    static int n;

    public static void main(String[] args) {
        n=100;
        ThreadOddEven oddEven = new ThreadOddEven();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddEven.PrintOddNumber();
            }
        },"Odd Number by Thread 1: ");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddEven.PrintEvenNumber();
            }
        },"Even Number by Thread 2: ");

        t1.start();
        t2.start();
    }

    private void PrintOddNumber() {
        synchronized (this) {
            while (counter < n) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + counter);
                counter++;
                notify();
            }
        }
    }

    private void PrintEvenNumber() {
        synchronized (this) {
            while (counter < n) {
                while (counter % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + counter);
                counter++;
                notify();
            }
        }
    }
}
