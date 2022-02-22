
    public class WithdrawRunnable1 implements Runnable {

        private BankAccount account;
        private int amount;
        private int count;
        //Thread 4
        public WithdrawRunnable1(BankAccount account, int amount, int count) {
            this.account = account;
            this.amount = amount;
            this.count = count;
        }

        @Override
        public void run()
        {
            try {
                for (int i = 1; i <= count; i++)
                {
                    account.withdraw1(amount);
                    Thread.sleep(4000);

                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
