package lesson6;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 4, 4, 1};
        System.out.println(findNumber(numbers));
    }

    public static boolean findNumber(int[] numbers) {
        boolean one = false;
        boolean four = false;

        for (int number : numbers) {
            if (number == 1) one = true;
            else if (number == 4) four = true;
            else return false;
        }

        return one && four;
    }
}
/*
    Написать метод, который проверяет состав массива из чисел 1 и 4.
        Если в нем нет хоть одной четверки или единицы, то метод вернет false;
Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        [ 1 1 1 4 4 1 4 4 ] -> true
        [ 1 1 1 1 1 1 ] -> false
        [ 4 4 4 4 ] -> false
        [ 1 4 4 1 1 4 3 ] -> false
*/
