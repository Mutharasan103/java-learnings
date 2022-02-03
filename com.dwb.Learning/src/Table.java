import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner mt = new Scanner(System.in);
        System.out.println("Enter the number for tables");
        int num = mt.nextInt();
       for (int i=1; i<=16; i++)
           System.out.printf("%d*%d=%d",i,num,5*num).println();

    }
}
