import java.util.Locale;
import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        //char ch = new Character();
        String str = scanner.nextLine().toUpperCase();
        System.out.println(str);
    }
}
