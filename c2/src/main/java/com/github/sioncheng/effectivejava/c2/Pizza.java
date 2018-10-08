package com.github.sioncheng.effectivejava.c2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }

    protected final Set<Topping> toppings;

    abstract static class Builder <T extends Builder<T>> {
        private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping t) {
            toppings.add(Objects.requireNonNull(t));

            return self();
        }

        abstract T self();

        abstract Pizza build();
    }

    Pizza(Builder builder) {
        toppings = builder.toppings.clone();
    }
}
