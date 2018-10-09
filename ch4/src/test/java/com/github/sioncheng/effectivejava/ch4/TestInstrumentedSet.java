package com.github.sioncheng.effectivejava.ch4;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestInstrumentedSet {

    @Test
    public void test() {
        Set<Integer> s = new HashSet<>();
        InstrumentedSet<Integer> integers = new InstrumentedSet<>(s);
        integers.add(1);
        integers.add(2);

        Assert.assertEquals(2, integers.size());
        Assert.assertEquals(2, integers.getAddCount());

        integers.remove(2);

        Assert.assertEquals(1, integers.size());
        Assert.assertEquals(2, integers.getAddCount());
    }
}
