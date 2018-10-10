package com.github.sioncheng.effectivejava.ch7;

import java.math.BigInteger;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {
        Integer a = Integer.valueOf(3);

        Scanner scanner = new Scanner() {
            @Override
            public <T> void scan(T o) {
                System.out.println(o);
            }
        };

        scanner.scan(a);

        "Hello world".chars().forEach(x -> System.out.println(x));

        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .map(x -> x * 3)
                .filter(x -> x % 2 == 0)
                .limit(2)
                .forEach(System.out::println);

        long c = LongStream.rangeClosed(2, 100)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
        System.out.println(c);
    }
}
