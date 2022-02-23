
    public class WithdrawRunnable1 implements Runnable {

        private BankAccount account;
        private int amount;
        private int count;
        //Thread 4
        public WithdrawRunnable1(BankAccount account, int amount) {
            this.account = account;
            this.amount = amount;
           // this.count = count;
        }

        @Override
        synchronized public void run()
        {

                //for (int i = 1; i <= count; i++)
                {
                    account.withdraw1(amount);
                   /* try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    */


                }



        }
    }
