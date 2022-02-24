
class Number1 extends Thread
{
    public void run()
    {
        for (int i=1; i<6; i++)
        {
            System.out.println(i);
        }
    }
}
public class MultithreadingRunnableInterface {
    public static void main(String[] args) {

       //Runnable book1 = new Runnable() {
           Runnable book1 = () -> {//Lambda Expression
                              for (int i = 1; i < 6; i++) {
                   System.out.println("Book is updating");
               }

                  };
        Number1 number1 = new Number1();

        Thread thread = new Thread(book1);
        thread.start();
        number1.start();



    }

}
