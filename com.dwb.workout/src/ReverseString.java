import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner rev = new Scanner(System.in);
        System.out.print("Enter a String:" );
        rev.nextLine();
        char[] Letters = rev.nextLine().toCharArray();
        System.out.println("Reverse string:" );
        for (int i=Letters.length-1;i>=0;i--)
        {
            System.out.print(Letters[i]);
        }

    }
}

