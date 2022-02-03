import java.util.Scanner;

public class details {
    public static void main(String[] args) {
        Scanner UserDetails = new Scanner(System.in);
        System.out.println("What is Your First Name? ");
        String Fname = UserDetails.nextLine();
        System.out.println("Your First name is " + Fname);
    }
}
