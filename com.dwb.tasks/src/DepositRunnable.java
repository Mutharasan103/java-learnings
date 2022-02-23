public class DepositRunnable implements Runnable {

        private BankAccount account;
        private int amount;
    //Thread 1
    public DepositRunnable(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
        //this.count = count;
    }

    private int count;

    @Override
    synchronized public void run() {

       // for (int i = 1; i <= count; i++) {
            account.deposit(amount);
            /*try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

             */

        }

    }
//}
