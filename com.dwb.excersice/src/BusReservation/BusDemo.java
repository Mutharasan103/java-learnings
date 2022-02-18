package BusReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<BusClass> buses = new ArrayList<BusClass>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new BusClass(1,true,2));
        buses.add(new BusClass(2,true,52));
        buses.add(new BusClass(3,true,55));
        buses.add(new BusClass(4,true,60));

        int UserOption=1;
        Scanner scanner = new Scanner(System.in);
        for (BusClass b:buses)
        {
            b.displayBusInfo();
        }
        while (UserOption==1)
        {
            System.out.println("Enter 1 for Booking and 2 for Exit");
            UserOption=scanner.nextInt();

            if (UserOption==1)
            {
               Booking booking = new Booking();
               if (booking.isAvailable(bookings,buses))
                {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }
                else
                System.out.println("Sorry. Bus Ticket is full try another bus");

            }
        }
    }
}
