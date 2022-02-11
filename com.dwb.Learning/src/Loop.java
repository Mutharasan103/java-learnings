import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int i=1;
        Scanner print = new Scanner(System.in);
        System.out.println("enter the value of N" );
        int n = print.nextInt();


        do {
            System.out.println((i*2)-1);
            i++;
        }while (i<=n);
    }
}
