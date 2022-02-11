import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner pwd = new Scanner(System.in);
        System.out.println("Please Enter Your Username");
        String Username = pwd.nextLine();
        //Username = "Muthu";
        if (Username == "Muthu") {
            Scanner pass = new Scanner(System.in);
            System.out.println("Please Enter Your Password");
            int password = pass.nextInt();
            //password = 12345;
            if (password==12345) {
                System.out.println("You are logged in Successfully");
            }else
                System.out.println("You are entered wrong Password");
        }
        else System.out.println("You are entered wrong Username");
    }
}








