import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner week = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = week.nextInt();
        if (num == 1)
            System.out.println(" This is Monday");
        else if (num == 2)
            System.out.println("This is Tuesday");
        else if (num == 3)
            System.out.println("This is Wednesday");
        else if (num == 4)
            System.out.println("This is Thursday");
        else if (num == 5)
            System.out.println("This is Friday");
        else if (num == 6)
            System.out.println("This is Saturday");
        else if (num == 7)
            System.out.println("THis is Sunday");
      else
        System.out.println("You are entered an incorrect day");

    }
}
