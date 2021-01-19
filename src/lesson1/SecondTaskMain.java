package lesson1;

import java.util.ArrayList;
import java.util.List;

//Написать метод, который преобразует массив в ArrayList;
public class SecondTaskMain {
    static Integer[] arr = {1, 2, 3, 4, 5};
    static String[] arr2 = {"1","2","3"};

    public static void main(String[] args) {
        List <Integer> arrIntToList = getArrayList(arr);
        List <String> arrStrToList = getArrayList(arr2);
    }

    public static <T> ArrayList<T> getArrayList(T[] a) {
        ArrayList<T> newList = new ArrayList<T>();
        for (T i : a) {
            newList.add(i);
        }
        return newList;
    }
}
