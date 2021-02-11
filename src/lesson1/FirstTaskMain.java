package lesson1;
//1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
public class FirstTaskMain {
    public static void main(String[] args) {
        MyArray strArr = new MyArray<String>("one", "two", "three", "four");
        MyArray intArr = new MyArray<Integer>(1,2,3,4);
        strArr.changePosition(0, 3);
        intArr.changePosition(2, 3);
        for (int i = 0; i < strArr.getArr().length; i++) {
            System.out.println(intArr.getArr()[i]);
        }
    }
}
class MyArray<T>{
    private T[] arr;

    public MyArray(T... arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public T[] changePosition(int firstObj, int secObj){
        T box;
        box = arr[firstObj];
        arr[firstObj] = arr[secObj];
        arr[secObj] = box;
        return arr;
    }

}
