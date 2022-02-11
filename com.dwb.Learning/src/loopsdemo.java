import java.util.Scanner;

public class loopsdemo {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        System.out.println("Enter the number you want multiplication Table ");
        int num = demo.nextInt();
        //int i =1;
       // while (true)
        for (int i=1;i<=20;i++)

            System.out.printf("%d*%d=%d", num, i, num * i).println();
    }
}
