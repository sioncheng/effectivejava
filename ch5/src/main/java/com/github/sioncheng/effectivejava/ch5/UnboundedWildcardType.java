package com.github.sioncheng.effectivejava.ch5;

import java.util.Set;

public class UnboundedWildcardType {

    public static int numElements(Set<?> set) {
        return set.size();
    }
}
