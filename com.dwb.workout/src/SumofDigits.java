import java.util.Scanner;

public class SumofDigits {

    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = digit.nextInt();
        System.out.println("The sum of given digits is " + SumDigits(num));
    }
    public static int SumDigits(int num)
    {
        int sum=0;
        while (num!=0) {
            sum = sum+num%10;
            num = num/10;
        }


        return sum;
    }


}
