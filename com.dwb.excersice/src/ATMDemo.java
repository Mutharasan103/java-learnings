import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        int balance = 5000;
        int deposit, withdraw;

        while (true)
        {
            System.out.println("Please Enter your option to perform");
            System.out.println("Enter option 1 for Withdraw");
            System.out.println("Enter option 2 for Deposit");
            System.out.println("Enter option 3 for Check Balance");
            System.out.println("Enter option 4 for Exit");
            Scanner scanner = new Scanner(System.in);


            int option = scanner.nextInt();
            switch (option)
            {
                case 1:
                {
                    System.out.println("Enter money to withdraw");
                    withdraw = scanner.nextInt();

                    if (balance>=withdraw)
                    {

                        balance = balance-withdraw;
                        System.out.println("Please collect your cash");
                    } else
                    {
                        System.out.println("Low Balance");
                    }

                    break;
                }
                case 2:
                {
                    System.out.println("Enter money to Deposit");
                    deposit = scanner.nextInt();
                    System.out.println("Your money deposited Successfully ");
                    break;
                }
                case 3:
                {
                    System.out.println("Your balance is: " + balance);
                    break;
                }
                case 4:
                {
                    System.exit(0);
                    break;
                }
            }

        }
    }
}
