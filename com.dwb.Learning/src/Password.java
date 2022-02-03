import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner pwd = new Scanner(System.in);
        System.out.println("Please Enter Your Username");

        String Username = pwd.nextLine();
        if (Username == "Muthu")
        {
            int password = pwd.nextInt();
            //Scanner user = new Scanner(System.in);
            System.out.println("Enter Your Password");

           // password = user.nextInt();
            if (password == 12345) {
                System.out.println("Access Granted");}
              else
            { System.out.println("*Access Denied* Please check your password");

                }

                }
        else {  System.out.println("Your Username is Incorrect");
            }
        } }





