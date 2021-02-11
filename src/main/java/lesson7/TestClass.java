package lesson7;

import lesson7.annotation.AfterSuite;
import lesson7.annotation.BeforeSuite;
import lesson7.annotation.Test;

public class TestClass {

    public void test1(){
        System.out.println("Test1 no annotation");
    }

    @Test(priority = 22)
    public void test2(){
        System.out.println("Test2 priority 22");
    }

    @Test(priority = 1)
    public void test3(){
        System.out.println("Test3 priority 1");
    }

    @Test(priority = 1)
    public void test3_1(){
        System.out.println("Test3_1 priority 1");
    }

    @Test
    public void test4(){
        System.out.println("Test4 default priority 5");
    }

    @Test(priority = 4)
    public void test5(){
        System.out.println("Test5 priority 4");
    }

    @BeforeSuite
    public void test6(){
        System.out.println("Test6 BeforeSuite");
    }

    @AfterSuite
    public void test7(){
        System.out.println("Test7 AfterSuite");
    }

//    @BeforeSuite
//    public void test8(){
//        System.out.println("Test8 BeforeSuite2");
//    }

    @Test(priority = 33)
    public void test9(){
        System.out.println("Test9 priority 33");
    }

}