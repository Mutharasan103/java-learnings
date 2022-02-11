import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner timer = new Scanner(System.in);
        System.out.println("Enter the Seconds ou want to convert");
        int seconds = timer.nextInt();

        int p1 = seconds%60;
        int p2 = seconds/60;
        int p3 = p2%60;

        //int p3 = p2%60;
        //p2 = p2/60;
        System.out.println(p2+":"+p3+":"+p1);
    }
}
