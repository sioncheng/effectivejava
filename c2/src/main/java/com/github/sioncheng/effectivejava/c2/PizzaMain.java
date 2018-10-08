package com.github.sioncheng.effectivejava.c2;

public class PizzaMain {

    public static void main(String[] args) {
        Pizza pizza = new NyPizza.Builder()
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.MUSHROOM)
                .build();

        Pizza pizza1 = new CalPizza.Builder()
                .sauceInside()
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.ONION)
                .addTopping(Pizza.Topping.PEPPER)
                .build();

        System.out.println(pizza.toppings);
        System.out.println(pizza1.toppings);
    }
}
