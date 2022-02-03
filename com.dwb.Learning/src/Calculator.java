import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Scanner calc = new Scanner(System.in);
        //System.out.println(" Enter the value of N ");
        for (int i=1; i<=100; i=(i+2)%i)
            System.out.println(i);

    }
}
