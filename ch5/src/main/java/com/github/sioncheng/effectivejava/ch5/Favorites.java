package com.github.sioncheng.effectivejava.ch5;

import java.util.HashMap;
import java.util.Map;

public class Favorites {

    private Map<Class<?>, Object> classObjectMap = new HashMap<>();

    public <T> T putFavorite(Class<T> clazz, T value) {
        Object v = classObjectMap.put(clazz, value);
        return clazz.cast(v);
    }

    public <T> T getFavorite(Class<T> tClass) {
        return tClass.cast(classObjectMap.get(tClass));
    }
}
