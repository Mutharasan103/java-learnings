public class Bankingdemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        final int amount = 1000;
        //final int REPETITIONS = 5;
       // final int THREADS = 1000;
        int count=2;
        for (int i = 1; i <= count; i++)
        {
            DepositRunnable d = new DepositRunnable(account, amount, count);
            WithdrawRunnable w = new WithdrawRunnable(account, amount, count);
            DepositRunnable1 d1 = new DepositRunnable1(account,amount,count);
            WithdrawRunnable1 w1 = new WithdrawRunnable1(account,amount,count);
            Thread dt = new Thread(d);
            Thread wt = new Thread(w);
            Thread dt1 = new Thread(d1);
            Thread wt1 = new Thread(w1);

            dt.start();
            wt.start();
            dt1.start();
            wt1.start();
        }

    }
}



