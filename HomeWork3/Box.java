package workhome3;

import workhome2new.MyArraySizeException;

import javax.swing.*;
import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();

    public Box() {
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }


    public void setFruitList(ArrayList<T> fruitList) {

        this.fruitList = fruitList;
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);}


    public float getWeight() {
        return fruitList.size() * fruitList.get(0).getWeight();
    }

    public boolean compareTo(Box toCompare) {
        return getWeight() == toCompare.getWeight();
    }

    public void pourOver(Box<T> box) {
        box.getFruitList().addAll(fruitList);
        fruitList.clear();
    }
}




