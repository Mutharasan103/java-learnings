
public class ThreadTask {
    public static void main(String[] args) {

        Print odd = new Print();

        Print1 even = new Print1();

        //odd.oddNumbers();
        odd.start();

        //even.EvenNumbers();
        even.start();

    }

}
class Print extends Thread
{
    //Thread 1
//public void oddNumbers()
    public void run()
{
for (int i=1; i<=100;i++)
{
    if (i%2==1)
    {
        System.out.println("Odd Numbers by Thread  1: " +i );
        try
        {
            Thread.sleep(2000);
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
}
}
class Print1 extends Thread
{
    //Thread 2
    //public void EvenNumbers()
    public void run()
    {
        for (int i=1; i<=100;i++)
        {
            if (i%2==0)
            System.out.println("Even Numbers by Thread 2: " +i);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}

