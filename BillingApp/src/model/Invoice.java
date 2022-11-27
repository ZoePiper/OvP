package model;
/*@ZoePiper
This class describes an invoice of hours worked on projects
 */

import java.util.ArrayList;

public class Invoice implements Formatibel {

    private Client client;
    private ArrayList<Formatibel> projects;
    private ArrayList<Formatibel> materials;
    private double totalHours;
    private double totalPrice;
    private PaymentStatus paymentStatus;

    //Constructor all elements to format
    // calculate total hours
    //calculate total price
    // format the invoice
    //update


    public Invoice(Client client, ArrayList<Formatibel> projects, ArrayList<Formatibel> materials, double totalHours, double totalPrice) {
        this.client = client;
        this.projects = projects;
        this.materials = materials;
        this.totalHours = totalHours;
        this.totalPrice = totalPrice;
    }

    public Invoice() {
    }

    public double calculateTotalTime() {
        //TODO get total from project array, add them.
        return totalHours;
    }

    public double calculateTotalPrice() {
        //TODO get total price from array, add them
        return totalPrice;
    }

    public PaymentStatus changePaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return paymentStatus;
    }

    @Override
    public String format() {
        return String.format("Invoice info");
        //TODO print en test versie
    }


}


