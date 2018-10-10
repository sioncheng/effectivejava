package com.github.sioncheng.effectivejava.ch7;

@FunctionalInterface
public interface Scanner {
    <T> void scan(T o);
}
