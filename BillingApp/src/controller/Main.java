package controller;

import model.Client;
import model.Invoice;

public class Main {
    public static void main(String[] args) {

        //test Client format
        Client c1 = new Client("Eskimoo.bv","Mrs.Claus","North Pole Street 1","info@eskimoo.com","South Pole");
c1.format();

// test invoice
        Invoice i1 = new Invoice();
        i1.format();
    }
}