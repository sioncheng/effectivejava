package com.github.sioncheng.effectivejava.ch6;

import java.lang.reflect.Method;

public class MyTestRunner<T> {

    private int passed;
    private int failed;
    private T target;

    public MyTestRunner(T target) {
        this.target = target;
    }

    public void run() {
        for (Method m :
                target.getClass().getDeclaredMethods()) {
            if (m.isAnnotationPresent(MyTest.class)) {
                try {
                    m.invoke(target);
                    passed++;
                } catch (Exception ex) {
                    failed++;
                }
            } else if (m.isAnnotationPresent(ExceptionExpectTest.class)) {
                try {
                    m.invoke(target);
                    failed++;
                } catch (Exception ex) {
                    Class<?> clz = m.getAnnotation(ExceptionExpectTest.class).value();
                    if (clz.isInstance(ex.getCause())) {
                        passed++;
                    } else {
                        failed++;
                    }
                }
            }
        }
    }

    public int getPassed() {
        return passed;
    }

    public int getFailed() {
        return failed;
    }
}
