package com.github.sioncheng.effectivejava.ch5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChooserTest {

    @Test
    public void test() {
        List<Integer>  integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(2);

        Integer chosenInteger = Chooser.randomChoose(integerList);
        Assert.assertNotNull(chosenInteger);
        Assert.assertTrue(chosenInteger.intValue() <= 3);

        Integer maxInteger = Chooser.max(integerList);
        Assert.assertNotNull(maxInteger);
        Assert.assertEquals(3, maxInteger.intValue());

        Chooser.consumeAllNumber(integerList);

        List<Long> longList = new ArrayList<>();
        longList.add(4L);
        longList.add(5L);

        Chooser.consumeAllNumber(longList);

        List<Number> numberList = new ArrayList<>();
        Chooser.transfer(longList, numberList);

        List<Object> objectList = new ArrayList<>();
        Chooser.transfer(integerList, objectList);
    }
}
