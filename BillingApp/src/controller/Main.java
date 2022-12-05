package controller;

import model.Client;
import model.Invoice;
import model.Material;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

//        //test Client format
//        Client c1 = new Client("Eskimoo.bv","Mrs.Claus","North Pole Street 1","info@eskimoo.com","South Pole");
//c1.format();
//
//// test invoice
//        Invoice i1 = new Invoice();
//        System.out.println (i1.format());
//

        //Material Class

        // Fill in input
        // Link input to variable
        // format input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start time (HH:mm): ");
        String time = input.nextLine();
        System.out.print("Enter end time (HH:mm): ");
        String time2 = input.nextLine();
        System.out.print("Enter break time (HH:mm): ");
        String time3 = input.nextLine();
        System.out.println();

        // make a time of input.
        DateFormat dateLayout = new SimpleDateFormat("HH:mm");
        Date d1 = dateLayout.parse(time);
        Date d2 = dateLayout.parse(time2);
        Date d3 = dateLayout.parse(time3);

        //Calculate duration
        long durationMillSec = (d2.getTime() + d3.getTime()) - d1.getTime();
        long durationSec = durationMillSec / 1000;
        long durationMin = durationSec / 60;
        long durationHour = durationMin / 60;
        long restOfMin = durationMin % 60;
        System.out.println("millisec " + durationMillSec);
        System.out.println("Min " + durationMin);
        System.out.println(" hours:" + durationHour + " minutes " + restOfMin);

        // Given Times
        System.out.println("Time: " + dateLayout.format(d1));
        System.out.println("Time: " + dateLayout.format(d2));
        System.out.println("Time: " + dateLayout.format(d3));


//TODO Error
        // if(d1.equals(d2)){
        System.out.println("The difference is 0 minutes and 0 seconds.");
    }

}
}

