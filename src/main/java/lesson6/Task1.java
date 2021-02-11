package lesson6;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 6, 3, 14, 4, 9, 11};
        numbers = arrayAfterFour(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static int[] arrayAfterFour(int[] numbers){
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == 4){
                return sliceAndReturn(numbers, i+1);
            }
        }
        throw  new RuntimeException();
    }

    public static int[] sliceAndReturn(int[] numbers, int index){
     int[] newNumbers = new int[numbers.length - index];
        for (int i = index, y = 0; i < numbers.length ; i++, y++) {
            newNumbers[y] = numbers[i];
        }
        return newNumbers;
    }
}


/*
        Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
        Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
        Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
        Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
*/
