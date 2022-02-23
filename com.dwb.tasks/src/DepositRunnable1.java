public class DepositRunnable1 implements Runnable {
    private BankAccount account;
    private int amount;
    //Thread 3
    public DepositRunnable1(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
       // this.count = count;
    }

    private int count;

    @Override
    synchronized public void run()
    {

            //for (int i = 1; i <= count; i++) {
                account.deposit1(amount);
              /*  try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
  */
            }




    }


//}