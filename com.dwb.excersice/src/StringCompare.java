import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        int result = str1.compareTo(str2);
       // result=scanner.nextInt();
        if (result<0)
        {
            System.out.println(str1+ " is less then "+ str2);
        }
        else if (result==0)
        {
            System.out.println(str1+" is equal to "+str2);
        }
        else
        {
            System.out.println(str1+ " is greater than "+str2);
        }

    }
}
