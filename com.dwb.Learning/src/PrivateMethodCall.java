import java.lang.reflect.Method;
import java.util.Scanner;

public class PrivateMethodCall {
    public static void main(String[] args) {
        System.out.println(squareOfNumber());

    }




    public static int squareOfNumber()
   // private int squareOfNumber()
    {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num = scanner.nextInt();
        System.out.println("Square is: "+(num*num));
        return num;

    }
}


