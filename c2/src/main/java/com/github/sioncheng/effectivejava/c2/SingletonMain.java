package com.github.sioncheng.effectivejava.c2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SingletonMain {

    private static final SingletonMain SINGLETON_MAIN = new SingletonMain();

    private Date date;
    private SimpleDateFormat simpleDateFormat;
    private SingletonMain(){
        date = new Date();
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
    }

    public static SingletonMain getInstance() {
        return SINGLETON_MAIN;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
        System.out.println(getInstance());
    }

    @Override
    public String toString() {
        return "SingletonMain created at " + simpleDateFormat.format(date);
    }
}
