public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1,  n = 20;
        System.out.println(n1+ " " +n2);
        for (int i = 2; i <= n; i++) {
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

        }
    }

