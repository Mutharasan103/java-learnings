import java.util.Scanner;

public class Primedemo {
    public static void main(String[] args) {
        int i,m=0,num=0;
        //int n=10;
        Scanner factor = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= factor.nextInt();

        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            m=n/2;
             for(i=2;i<=m;i++)

                {
                if(n%i==0){
                    System.out.println(n+" is not prime number");

                      }
            }
            if(num==0)  { System.out.println(n+" is prime number"); }
        }
    }
}


       /* Scanner number = new Scanner(System.in);
        System.out.println("Enter a Number");
        float num = number.nextFloat();

        if (num == 0 && num == 1)
            System.out.println("It is not a Prime Number");

        else {
            num/=2;
          // for(int i=2;i<=num;i++)
           if(num==0 && num==1.0) {

                    System.out.println("It is a Prime Number");
                }

        //else
          // System.out.println("It is not a Prime Number");

    }
}}
*/