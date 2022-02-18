import java.util.Scanner;

public class Sumofthreedigits {
    public static void main(String[] args) {
        Scanner digits = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num = digits.nextInt();
        System.out.println("The sum of given integer digits " +sumDigit(num));
        }

    public static int sumDigit(int n) {
        int sum = 0;
        while (n != 0) {

            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}
