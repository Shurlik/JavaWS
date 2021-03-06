package com.company;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnot {
    int a();
    int b();
}

public class Main {

    public static void main(String[] args) throws Exception {

        Class cls = MyClass.class;
        Method[] methods = cls.getMethods();

        for (Method method:methods){
            if(method.isAnnotationPresent(MyAnnot.class)){
                method.setAccessible(true);
                MyAnnot ma = method.getAnnotation(MyAnnot.class);
                System.out.println(method.invoke(int.class, ma.a(), ma.b()));
            }

        }

    }

}

class MyClass {
    public static int myMeth2(int a, int b) {
        return a - b;
    }
    @MyAnnot(a = 2, b = 3)
    public static int myMeth(int a, int b) {

        return a + b;
    }

}
