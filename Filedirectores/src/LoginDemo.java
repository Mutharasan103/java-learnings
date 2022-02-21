import java.util.Scanner;

import static java.lang.System.exit;

public class LoginDemo {
    public static void main(String[] args) {
        CreateUsername();
        CreatePassword();
        Login();

    }

    private static void UpdatePassword() {
    }


    private static void UpdateUsername()
    {

    }

   public static void CreatePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Create Your Password");
        String pwd = scanner.nextLine();
        System.out.println("Your password is: "+pwd);
        System.out.println("Your password created successfully");
    }



    public static  void CreateUsername()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Create Your Username");
        String userName = scanner.nextLine();
        System.out.println("Your User name is: "+userName);
        System.out.println("Username Created Successfully");
    }





    private static void Logout()
    {
        System.out.println("Logout Successfully");
    }


    public static void Login()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Username");
        String name = scanner.nextLine();

            if (name=="Mutharasan")
            {

                System.out.println("Please Enter Your password");
                String pwd = scanner.nextLine();
                if (pwd=="Arasan@103")
                {
                    System.out.println("Login Successfully");
                } else System.out.println("Wrong Password");

            }else System.out.println("Please Check your Username");
        }




    private static String getName(String name) {
        return name;
    }
}
