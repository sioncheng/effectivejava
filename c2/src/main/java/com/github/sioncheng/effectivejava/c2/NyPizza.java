package com.github.sioncheng.effectivejava.c2;

public class NyPizza extends Pizza {

    public static class Builder extends Pizza.Builder<Builder> {

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Pizza build() {
            return new NyPizza(this);
        }
    }

    public NyPizza(Builder builder) {
        super(builder);
    }
}
