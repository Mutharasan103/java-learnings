package BusReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Booking {
    String PassengerName;
    int BusNo;
    Date date;

    Booking()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        PassengerName = scanner.nextLine();
        System.out.println("Enter Bus Number: ");
        BusNo = scanner.nextInt();
        System.out.println("Enter a Date dd-mm-yyyy: ");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<BusClass> buses) {
        int capacity = 0;
        int booked = 0;
        for (BusClass bus : buses) {
            if (BusNo == bus.getBusNumber()) {
                capacity = bus.getCapacity();
            }
            booked = 0;
            for (Booking b : bookings) {
                if (b.BusNo == BusNo && b.date.equals(date))
                    booked++;
            }
        }
        return booked < capacity ? true : false;
    }
}
