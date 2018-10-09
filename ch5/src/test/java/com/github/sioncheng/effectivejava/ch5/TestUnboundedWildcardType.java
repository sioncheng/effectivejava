package com.github.sioncheng.effectivejava.ch5;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TestUnboundedWildcardType {

    @Test
    public void test() {
        Set<Integer> integerSet = new HashSet<>();
        Set<String> stringSet = new HashSet<>();

        Assert.assertEquals(0, UnboundedWildcardType.numElements(integerSet));
        Assert.assertEquals(0, UnboundedWildcardType.numElements(stringSet));
    }
}
