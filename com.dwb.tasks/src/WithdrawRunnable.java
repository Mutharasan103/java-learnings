public class WithdrawRunnable implements Runnable {

    private BankAccount account;
    private int amount;
    private int count;
    //Thread 2
    public WithdrawRunnable(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
       // this.count = count;
    }

    @Override
    synchronized public void run() {

        //for (int i = 1; i <= count; i++) {
            account.withdraw(amount);
           /* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            */


        }

    }
//}
