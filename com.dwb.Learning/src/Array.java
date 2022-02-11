import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a[]=new int[10];
        Scanner array = new Scanner(System.in);
        System.out.println("Enter 10 elements of array");
        for (int i=0; i<a.length;i++)
            a[i]= array.nextInt();
        for (int i=0; i<a.length;i++)
        System.out.println(a[i]);
    }}
