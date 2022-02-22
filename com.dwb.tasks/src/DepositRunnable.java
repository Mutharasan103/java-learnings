public class DepositRunnable implements Runnable {

        private BankAccount account;
        private int amount;
    //Thread 1
    public DepositRunnable(BankAccount account, int amount, int count) {
        this.account = account;
        this.amount = amount;
        this.count = count;
    }

    private int count;

    @Override
    public void run()
    {
        try {
            for (int i = 1; i <= count; i++) {
                account.deposit(amount);
                Thread.sleep(3000);
            }
        }catch (InterruptedException exception) {}

    }


}
