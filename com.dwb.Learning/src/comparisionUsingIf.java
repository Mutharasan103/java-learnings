import java.util.Scanner;

public class comparisionUsingIf {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner compare = new Scanner(System.in);
        System.out.println("Enter  num1");
        num1=compare.nextInt();
        System.out.println("Enter  num2");
        num2=compare.nextInt();
        System.out.println("Enter  num3");
        num3=compare.nextInt();
        if (num1>num2 && num1>num3)
        {
          System.out.println("Num1 is Max");
        }
        else
            if (num2>num3)
            {
                System.out.println(" Num2 is max");
            }
            else {
                System.out.println(" Num3 is Max");
            }
            }
    }


