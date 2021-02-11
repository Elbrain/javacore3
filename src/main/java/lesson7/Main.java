package lesson7;

import lesson7.handler.TestHandler;

public class Main {
    public static void main(String[] args)  {
        TestClass testClass = new TestClass();
        try {
            System.out.println("Test of the start() method that needs only a Class \n");
            TestHandler.start(testClass.getClass());
            System.out.println();
            System.out.println("Test of the start() method that needs name of the Class \n");
            TestHandler.start(testClass.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}