import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = days.nextInt();
        switch (num) {
            case 1:
                System.out.println("This is Monday");
                break;
            case 2:
                System.out.println("This is Tuesday");
            case 3:
                System.out.println("This is Wednesday");
                break;
            case 4:
                System.out.println("This is Thursday");
                break;
            case 5:
                System.out.println("This is Friday");
                break;
            case 6:
                System.out.println("This is Saturday");
                break;
            case 7:
                System.out.println("This is Sunday");
                break;
            default:
                System.out.println("You are entered in incorrect day");
        }
    }
}