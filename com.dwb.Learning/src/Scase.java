import java.util.Scanner;

public class Scase {
    public static void main(String[] args) {
        System.out.println(switchCaseOperations());
    }
    public static int switchCaseOperations()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number ");
        int num = scanner.nextInt();
        System.out.println("Enter the Second  number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Third number ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the Fourth number ");
        int num3 = scanner.nextInt();
        System.out.println("Enter the Performance you need");
        int performance = scanner.nextInt();
        switch (performance)
        {
            case 1:
            {
                System.out.println("Result is " +(num+num1+num2+num3));
                break;
            }
            case 2:
            {
                System.out.println("Result is " +(num-num1-num2-num3));
                break;
            }
        }

        return performance;
    }
}
