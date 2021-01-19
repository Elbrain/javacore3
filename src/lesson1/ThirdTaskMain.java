package lesson1;

import java.util.ArrayList;

public class ThirdTaskMain {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        ArrayList<Orange> oranges = new ArrayList<>();
        ArrayList<Apple> apples = new ArrayList<>();
        ArrayList<Orange> orangesEmpty = new ArrayList<>();

        oranges.add(orange);
        oranges.add(orange);


        apples.add(apple);
        apples.add(apple);
        apples.add(apple);

        ThirdTaskBox<Apple> appleBox = new ThirdTaskBox(apples);
        ThirdTaskBox<Orange> orangeBox = new ThirdTaskBox(oranges);
        ThirdTaskBox<Orange> anotherOrangeBox = new ThirdTaskBox(orangesEmpty);
        float weight = 0.0f;
        System.out.println("Apple box weight " + appleBox.getWeight());
        System.out.println("Orange box weight " + orangeBox.getWeight());
        System.out.println("Empty box weight " + anotherOrangeBox.getWeight());
        System.out.println("Compare weights of Apple and Orange boxes " + appleBox.compare(orangeBox));

        orangeBox.swapFruits(anotherOrangeBox);
        System.out.println("ex-Empty orange box weight after swap " + anotherOrangeBox.getWeight());
        System.out.println("ex-full orange box weight after swap " + orangeBox.getWeight());
    }
}
