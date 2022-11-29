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
        System.out.print("Enter start time (hh:mm): ");
        String time = input.nextLine();
        System.out.print("Enter end time (hh:mm): ");
        String time2 = input.nextLine();
        System.out.print("Enter break time (hh:mm): ");
        String time3 = input.nextLine();
        System.out.println();

        DateFormat dateLayout =new SimpleDateFormat("hh:mm");
        Date d1 = dateLayout.parse(time);
        Date d2 = dateLayout.parse(time2);
        Date d3 = dateLayout.parse(time3);

        long timeDuration = d2.getTime() - d1.getTime()- d3.getTime();
        System.out.println("duration: "+ timeDuration);

        System.out.println("Time: " + dateLayout.format(d1));
        System.out.println("Time: " + dateLayout.format(d2));
        System.out.println("Time: " + dateLayout.format(d3));

        System.out.println("Time: " + sdf.format(d2));
        
        if(d1.after(d2)){
            long diffMs = d1.getTime() - d2.getTime();
            long diffSec = diffMs / 1000;
            long min = diffSec / 60;
            long sec = diffSec % 60;
            System.out.println("The difference is "+min+" minutes and "+sec+" seconds.");
        }

        if(d1.before(d2)){
            long diffMs = d2.getTime() - d1.getTime();
            long diffSec = diffMs / 1000;
            long min = diffSec / 60;
            long sec = diffSec % 60;
            System.out.println("The difference is "+min+" minutes and "+sec+" seconds.");
        }

        if(d1.equals(d2)){
            System.out.println("The difference is 0 minutes and 0 seconds.");
        }

    }
}

