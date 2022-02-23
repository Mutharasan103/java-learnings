public class Bankingdemo {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();
        //int amount =0;

        int count=4;
        for (int i = 1; i <=count; i++)
        {
            DepositRunnable d = new DepositRunnable(account,  count);
            WithdrawRunnable w = new WithdrawRunnable(account,  count);
            DepositRunnable1 d1 = new DepositRunnable1(account,count);
            WithdrawRunnable1 w1 = new WithdrawRunnable1(account,count);
            Thread dt = new Thread(d);
            Thread wt = new Thread(w);
            Thread dt1 = new Thread(d1);
            Thread wt1 = new Thread(w1);


            dt.start();
            dt.join();
            wt.start();
            wt.join();
            dt1.start();
            dt1.join();
            wt1.start();
            wt1.join();

        }

    }
}



