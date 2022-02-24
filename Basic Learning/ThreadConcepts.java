class Book extends Thread
{
    //void updateBook()
    public void run()
    {
        for (int i=1;i<6;i++)
        {
            System.out.println("Book is updating");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
    class Number extends Thread
    {
       // void print()
        public void run()
        {
            for (int i =1; i<6; i++)
            {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

public class ThreadConcepts {
    public static void main(String[] args) {
        Book book = new Book();
        Number num = new Number();

       // book.updateBook();
        book.start(); //searching run thread
        //num.print();
        num.start();
        if (book.isAlive())
        {
            System.out.println("Still Executing");
        }


        try {
            book.join(); //waiting until execution is complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            num.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The End");
    }

}
