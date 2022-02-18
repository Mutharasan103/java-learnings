import java.util.Scanner;

public class Palindraome {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter a number you want as Palindrome");
        int n = Num.nextInt();
        int remainder,sum = 0,reverse = n;
         while(n>0){
            remainder=n%10;
            sum=(sum*10)+remainder;
            n=n/10;
        }
        if(reverse==sum)
            System.out.println(reverse+ " ia a palindrome number ");
        else
            System.out.println(reverse+ " is not a palindrome number");
    }
}
