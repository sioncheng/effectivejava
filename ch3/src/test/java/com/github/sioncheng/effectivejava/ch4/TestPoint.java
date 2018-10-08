package com.github.sioncheng.effectivejava.ch4;

import com.github.sioncheng.effectivejava.ch3.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class TestPoint {

    @Test
    public void test() {
        Point point1 = new Point(1,2);
        Point point2 = point1.clone();

        Assert.assertFalse(point1 == point2);
        Assert.assertEquals(point1, point2);
        Assert.assertEquals(point2, point1);

        Map<Point, Integer> pointIntegerMap = new HashMap<>();
        pointIntegerMap.put(point1, 1);
        pointIntegerMap.put(point2, 2);

        Assert.assertEquals(1, pointIntegerMap.size());
        Assert.assertEquals(2, pointIntegerMap.get(point1).intValue());

        Assert.assertEquals(point1.compareTo(point2), -1 * point2.compareTo(point1));
    }

}
