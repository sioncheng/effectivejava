package com.github.sioncheng.effectivejava.c2;

public class NutritionFactsMain {

    public static void main(String[] args) {

        NutritionFacts nutritionFacts =  new NutritionFacts.Builder(100, 10)
            .calories(1).fat(1).solium(1).carbohydrate(1).build();

        System.out.println(nutritionFacts.getServingSize());
        System.out.println(nutritionFacts.getServings());
        System.out.println(nutritionFacts.getFat());
        System.out.println(nutritionFacts.getCalories());
        System.out.println(nutritionFacts.getSodium());
        System.out.println(nutritionFacts.getCarbohydrate());
    }
}
