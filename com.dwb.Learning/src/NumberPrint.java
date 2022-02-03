import java.util.Scanner;

public class NumberPrint {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = number.nextInt();
        for(int i=1;i<=15;i++)
        {   for (int j=1;j<=5;j++)
            System.out.print(num);
            System.out.print("\n");
    }

}}
