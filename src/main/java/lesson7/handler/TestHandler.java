package lesson7.handler;
import lesson7.annotation.AfterSuite;
import lesson7.annotation.BeforeSuite;
import lesson7.annotation.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestHandler {

    public static void start(Class testedClass) throws Exception {
        Method[] methods = testedClass.getDeclaredMethods();

        Constructor constructor = testedClass.getConstructor();
        Object object = constructor.newInstance();

        int countOfBeforeSuites = 0;
        int countOfAfterSuites = 0;

        ArrayList<Method> arrayList = new ArrayList<>();

        for (Method m : methods) {
            if (m.isAnnotationPresent(Test.class)) arrayList.add(m);

            else if (m.isAnnotationPresent(AfterSuite.class)) {
                if (countOfAfterSuites==1) throw new RuntimeException("Cant be two methods with @AfterSuite annotation");
                arrayList.add(m);
                countOfAfterSuites++;
            }

            else if (m.isAnnotationPresent(BeforeSuite.class)) {
                if (countOfBeforeSuites==1) throw new RuntimeException("Cant be two methods with @BeforeSuite annotation");
                arrayList.add(0, m);
                countOfBeforeSuites++;
            }
        }

        arrayList.sort((o1, o2) -> {
            if (o1.isAnnotationPresent(Test.class) && o2.isAnnotationPresent(Test.class)) {
                if (o1.getAnnotation(Test.class).priority() < o2.getAnnotation(Test.class).priority()) return -1;
                else if (o1.getAnnotation(Test.class).priority() > o2.getAnnotation(Test.class).priority()) return 1;
            }
            else if (o1.isAnnotationPresent(Test.class) && o2.isAnnotationPresent(AfterSuite.class)) {
                return -1;
            }
            else if (o1.isAnnotationPresent(AfterSuite.class) && o2.isAnnotationPresent(Test.class)) {
                return 1;
            }
            return 0;
        });

        arrayList.forEach((method -> {
            try {
                method.invoke(object);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }));

    }

    public static void start(String testedClassName) throws Exception {
        Class c = Class.forName(testedClassName);
        Constructor constructor = c.getConstructor();
        Object object = constructor.newInstance();
        Method[] methods = c.getDeclaredMethods();

        int countOfBeforeSuites = 0;
        int countOfAfterSuites = 0;

        ArrayList<Method> arrayList = new ArrayList<>();

        for (Method m : methods) {

            if (m.isAnnotationPresent(Test.class)) arrayList.add(m);

            else if (m.isAnnotationPresent(AfterSuite.class)) {
                if (countOfAfterSuites==1) throw new RuntimeException("Cant be two methods with @AfterSuite annotation");
                arrayList.add(m);
                countOfAfterSuites++;
            }

            else if (m.isAnnotationPresent(BeforeSuite.class)) {
                if (countOfBeforeSuites==1) throw new RuntimeException("Cant be two methods with @BeforeSuite annotation");
                arrayList.add(0, m);
                countOfBeforeSuites++;
            }
        }

        arrayList.sort((o1, o2) -> {
            if (o1.isAnnotationPresent(Test.class) && o2.isAnnotationPresent(Test.class)) {
                if (o1.getAnnotation(Test.class).priority() < o2.getAnnotation(Test.class).priority()) return -1;
                else if (o1.getAnnotation(Test.class).priority() > o2.getAnnotation(Test.class).priority()) return 1;
            }
            else if (o1.isAnnotationPresent(Test.class) && o2.isAnnotationPresent(AfterSuite.class)) {
                return -1;
            }
            else if (o1.isAnnotationPresent(AfterSuite.class) && o2.isAnnotationPresent(Test.class)) {
                return 1;
            }
            return 0;
        });

        arrayList.forEach((method -> {
            try {
                method.invoke(object);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }));


    }

}