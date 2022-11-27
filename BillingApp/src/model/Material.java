package model;

import java.time.LocalDate;
import java.util.Locale;

public class Material implements Formatibel {
    private String projectName; // TODO moet dit gekoppled worden met Project class
    private String materialName;
    private String description;
    private LocalDate date;
    private int amount; //TODO is deze varible wel nodig?
    private double price;
    private double materialPrice;

    public double materialPrice(int amount, double price){
        materialPrice = amount * price;
        return materialPrice;
    }

    @Override
    public String format() {
        return null;
        //TODO alle printen in een rij
    }
}
