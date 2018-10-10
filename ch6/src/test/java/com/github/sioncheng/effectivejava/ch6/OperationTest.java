package com.github.sioncheng.effectivejava.ch6;

import org.junit.Assert;
import org.junit.Test;

public class OperationTest {

    @Test
    public void test() {
        Assert.assertEquals(0, BasicOperation.MINUS.apply(1,1), 0);
        BasicOperation operation = BasicOperation.valueOf("MINUS");
        System.out.println(operation);
        System.out.println(BasicOperation.fromString("-"));
    }
}
