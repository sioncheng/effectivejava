package com.github.sioncheng.effectivejava.ch5;

import org.junit.Assert;
import org.junit.Test;

public class FavoritesTest {

    @Test
    public void test() {
        Favorites favorites = new Favorites();
        favorites.putFavorite(String.class, "12");
        favorites.putFavorite(String.class, "22");

        Assert.assertEquals("22", favorites.getFavorite(String.class));
    }
}
