import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        System.out.println("Enter Number you want to reverse");
        int num = rs.nextInt();
        int remainder,reverse=0;
        while (num!=0)
        {
            remainder = num%10;
            //reverse=remainder;
            reverse = reverse*10+remainder;
            num=num/10;

        }
       // reverse = reverse
        System.out.println("Reverse Number is: " +reverse);
        //System.out.printf(reverse);
    }
}
