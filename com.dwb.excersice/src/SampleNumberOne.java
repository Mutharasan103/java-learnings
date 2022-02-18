import javax.swing.*;
import java.util.Scanner;

public class sampleNumberOne {
    public static void main(String[] args) {
        int ComputerNumber = (int) (Math.random()*100+1);
        //int UserNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int number = scanner.nextInt();
        System.out.println("The Correct Number is " +ComputerNumber);
        int count = 1;

        while (number!=0)
        {
            String response = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100", "Guessing Game", 3);
            number = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "  " + guess(number,ComputerNumber,count));
            count++;
        }
    }
    public static String guess(int number, int ComputerNumber, int count)
    {
        if (number<=0||number>100)
        {
           return "Your Guess is Invalid";
        }
        else if (number==ComputerNumber)
        {
            return "Your guess is right!\nTotal guesses is "+count;
        }
        else if (number>ComputerNumber)
        {
            return "Your guess too High!\nTotal guesses is "+count;
        }
        else if (number<ComputerNumber)
        {
            return "Your guess is too Low\nTotal guesses is "+count;
        }
        else
        {
            final String s = "Your guess is incorrect\n Please try again later " + count;
            return s;
        }

    }
}
