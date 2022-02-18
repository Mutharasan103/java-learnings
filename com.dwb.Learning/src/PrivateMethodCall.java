import java.util.Scanner;

public class PrivateMethodCall {
    public static void main(String[] args) {

        System.out.println(squareOfNumber());
        System.out.println(cubeOfNumber());

    }


    public static int squareOfNumber()
    //private int squareOfNumber()
    {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num = scanner.nextInt();
        System.out.println("Square is: "+(num*num));
        //Field field = scanner.getClass()
        return 0;
    }
     public static int cubeOfNumber()

    {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num = scanner.nextInt();
        System.out.println("Cube is: "+(num*num*num));
        return 0;
    }
}


