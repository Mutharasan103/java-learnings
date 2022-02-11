import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        System.out.println(vowel());
    }
    public static boolean vowel()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Character ");
        char ch = scan.nextLine().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
            return true;
           else return false;
    }
}
