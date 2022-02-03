import java.util.Scanner;

public class Userdemo {
    public static void main(String[] args) {
        Scanner UserDetails = new Scanner(System.in);
        System.out.println("What is your first name ");
        String Fname = UserDetails.nextLine();
        System.out.println("What is your last name ");
        String Lname = UserDetails.nextLine();
        System.out.println("Enter Your Age ");
        int Age = UserDetails.nextInt();
        UserDetails.nextLine();
        System.out.println("Enter Your Email Id ");
        String mail = UserDetails.nextLine();
        System.out.println("Your First name is " +Fname);
        System.out.println("Your Last name is " +Lname);
        System.out.println("Your Age is " +Age);
        System.out.println("Your Mail Id is " +mail);
        System.out.println("Your data saved Successfully");
    }
}