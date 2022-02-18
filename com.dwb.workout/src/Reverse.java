import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner rev = new Scanner(System.in);
        System.out.println("Enter a String ");
        char[] letters = rev.nextLine().toCharArray();
        System.out.println("Reverse String is ");
        for (int i=letters.length-1;i>=0;i--)
        {
            System.out.print(letters[i]);
        }
     }
}
