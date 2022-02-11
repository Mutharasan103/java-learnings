import java.util.Scanner;

public class Whilecondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number ");
            num = scanner.nextInt();
            System.out.println("Cube is "+(num * num * num));
        } while (num>=0);

    }
}
