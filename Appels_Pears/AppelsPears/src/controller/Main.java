package controller;

import model.Fruit;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Fruit> fruits = new ArrayList<Fruit>();

        Fruit f = new Fruit("mango", 2.45);
        fruits.add(f);
         f = new Fruit("apple", 1.05);
        fruits.add(f);
         f = new Fruit("pear", 0.99);
        fruits.add(f);
        f = new Fruit("banana", 0.79);
        fruits.add(f);

        Collections.sort(fruits); // low to high sort
        Collections.reverse(fruits);// high to low price

        for (Fruit fruit:fruits
             ) {
            System.out.println(String.format("%s costs %.2f ",fruit.getName(), fruit.getPrice()));
        }

        FruitRatingComparer

    }
}
