package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Material implements Formatibel {
    private String projectName; // TODO moet dit gekoppled worden met Project class
    private String materialName;
    private String description;
    private Date date = new Date();
    private int amount; //TODO is deze varible wel nodig?
    private double price;
    private double materialPrice;

    public Material(String projectName, String materialName, String description, Date date, int amount, double price, double materialPrice) {
        this.projectName = projectName;
        this.materialName = materialName;
        this.description = description;
        this.date = date;
        this.amount = amount;
        this.price = price;
        this.materialPrice = materialPrice;
    }

    public Material() {
    }

    public static Material createMaterial(String projectName, String materialName, String description, Date date, int amount, double price, double materialPrice) {
        return new Material(projectName, materialName, description, date, amount, price, materialPrice);
    }

    public double materialPrice(int amount, double price){
        materialPrice = amount * price;
        return materialPrice;
    }

    @Override
    public String format() {
    return String.format("%s\n%s\n%s\n%s\n%d\2.f",projectName,materialName,description,date,amount,materialPrice);
        //TODO alle printen in een rij
    }
}
