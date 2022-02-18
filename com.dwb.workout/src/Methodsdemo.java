
public class Methodsdemo {
static int sumOfDigits(int a,int b, int c) {
    int sum;
    sum = a + b + c;
    //System.out.println("Sum of digits is " + sum);
    return sum;
}
    public static void main(String[] args) {
        //*System.out.println(" The sum of three values is ");
        sumOfDigits(10,11,12);
        sumOfDigits(20,21,23);//*

        System.out.println(sumOfDigits(10,11,12));
        System.out.println(sumOfDigits(15,11,12));
        System.out.println(sumOfDigits(20,50,12));
        System.out.println(sumOfDigits(30,100,12));
        System.out.println(sumOfDigits(40,155,1133));
        System.out.println(sumOfDigits(45,21,12));
        System.out.println(sumOfDigits(10,21,200));
        System.out.println(sumOfDigits(10,20,100));

    }
}


