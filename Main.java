package workhome3;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println("Всего в первой коробке яблок :" + appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        System.out.println("Всего в первой коробке апельсинов :" + orangeBox.getWeight());


        System.out.println(orangeBox.compareTo(appleBox));


        Box<Apple> appleBox2 = new Box<>();

        appleBox.pourOver(appleBox2);
        System.out.println("В первой коробке сейчас :" + appleBox.getFruitList());
        System.out.println("Во второй коробке сейчас :" + appleBox2.getFruitList());

    }
}

