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
        Method method = cls.getMethod("myMeth", int.class, int.class);
        method.setAccessible(true);
        MyAnnot ma = method.getAnnotation(MyAnnot.class);

        System.out.println(method.invoke(int.class, ma.a(), ma.b()));
    }

}

class MyClass {
    @MyAnnot(a = 2, b = 3)
    public static int myMeth(int a, int b) {
        return a + b;
    }
}
