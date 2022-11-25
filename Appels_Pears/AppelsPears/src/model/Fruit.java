package model;

public class Fruit implements Comparable<Fruit> {
     private String name;
     private double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int compareTo(Fruit fr) {
        if (price == fr.price) {
            return 0;
        }else if (price > fr.price) {
            return 1;
        } else
            return -1;
    }
}