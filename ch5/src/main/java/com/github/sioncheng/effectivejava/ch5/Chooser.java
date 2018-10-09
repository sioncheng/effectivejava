package com.github.sioncheng.effectivejava.ch5;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser {

    public static <T> T randomChoose(List<T> list) {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list == null || list.isEmpty()) return null;

        T result = null;
        for (T e :
                list) {
            if (result == null || e.compareTo(result) > 0) {
                result = e;
            }
        }

        return result;
    }

    public static void consumeNumber(Number t) {
        System.out.println(t);
    }

    public static void consumeAllNumber(List<? extends Number> list) {
        for (Number n :
                list) {
            consumeNumber(n);
        }
    }

    public static <T> void transfer(List<T> list, List<? super T> dest) {
        for (T i :
                list) {
            dest.add(i);
        }
    }
}
