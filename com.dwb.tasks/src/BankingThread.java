public class BankingThread {

    public static void main(String[] args) {
        int balance = 10000;
        int deposit,withdraw;

        Deposit thread1 = new Deposit();
        Withdraw thread2 = new Withdraw();
        Deposit1 thread3 = new Deposit1();
        Withdraw1 thread4 = new Withdraw1();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

    }
    //Thraed 1
    class Deposit extends Thread
    {

        public void run()
        {



        }

    }
    // Thread 2
    class Withdraw extends Thread
    {
        public void run()
        {
            System.out.println();
        }

    }
    //Thread 3
    class Deposit1 extends Thread
    {
        public void run()
        {
            System.out.println();
        }
    }
    //Thread 4
    class Withdraw1 extends Thread
    {
        public void run()
        {
            System.out.println();
        }
    }




