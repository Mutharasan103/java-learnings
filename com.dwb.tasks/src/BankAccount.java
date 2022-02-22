public class BankAccount {
    private double balance;

    public BankAccount() {
        balance=5000;
    }
    //Thread1
    public void deposit(double amount)
    {
        System.out.println("Depositing by Thread 1 " + amount);
        double newBalance = balance + amount;
        System.out.println("New balance by Thread 1 " + newBalance);
        balance = newBalance;
    }
    //Thread2
    public void withdraw(double amount)
    {
        System.out.println("Withdrawing by Thread 2 " + amount);
        double newBalance = balance - amount;
        System.out.println("New balance is " + newBalance);
        balance = newBalance;
    }
    //Thread3
    public void deposit1(double amount)
    {
        System.out.println("Depositing by Thread 3 " + amount);
        double newBalance = balance + amount;
        System.out.println("New balance is " + newBalance);
        balance = newBalance;
    }
    //Thread4
    public void withdraw1(double amount)
    {
        System.out.println("Withdrawing by Thread 4 " + amount);
        double newBalance = balance - amount;
        System.out.println("New balance is " + newBalance);
        balance = newBalance;
    }
}
