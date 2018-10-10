package com.github.sioncheng.effectivejava.ch6;

import org.junit.Assert;
import org.junit.Test;

public class MyTestRunnerTest {

    static class MyTestObject {

        @MyTest
        public void test1() {
            Assert.assertEquals(1,1);
        }

        @MyTest
        public void test2() {
            Assert.assertEquals(1,2);
        }

        @ExceptionExpectTest(IllegalArgumentException.class)
        public void test3() {
            throw new IllegalArgumentException();
        }
    }

    @Test
    public void test() {
        MyTestObject myTestObject = new MyTestObject();
        MyTestRunner<MyTestObject> myTestObjectMyTestRunner = new MyTestRunner<>(myTestObject);
        myTestObjectMyTestRunner.run();
        Assert.assertEquals(2, myTestObjectMyTestRunner.getPassed());
        Assert.assertEquals(1, myTestObjectMyTestRunner.getFailed());
    }
}
