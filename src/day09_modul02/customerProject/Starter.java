package day09_modul02.customerProject;

import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Водка", 100, 40);
        Ingredient rom = new Ingredient("Ром", 100, 35);
        Ingredient martini = new Ingredient("Мартини", 100, 16);
        Ingredient cola = new Ingredient("Кола", 100, 0);
        Ingredient energiser = new Ingredient("RedBull", 100, 0);
        Ingredient aperol = new Ingredient("Апероль", 40, 11);
        Ingredient prosekko = new Ingredient("Просекко", 40, 12);
        Ingredient tonic = new Ingredient("shweppes", 50, 0);
        Ingredient milk = new Ingredient("Молоко", 100, 0);
        Ingredient syrup = new Ingredient("Сироп", 5, 0);
        Ingredient strawberry = new Ingredient("Клубника", 5);
        Ingredient ice = new Ingredient("Лед", 4);
        Ingredient iceCream = new Ingredient("Мороженое", 100, 0);


        Cocktail romCola = new Cocktail("Ром-Кола", rom, cola, ice);
        System.out.println(romCola);
        System.out.println("-----------------");
        Cocktail disco = new Cocktail("Диско", cola, energiser);
        System.out.println(disco);
        System.out.println("-----------------");
        Cocktail milkShake = new Cocktail("Молочный коктейль",
                milk, iceCream, syrup, strawberry);
        System.out.println(milkShake);
        System.out.println("-----------------");
        Cocktail aperolShpric = new Cocktail("Апероль шприц", aperol, prosekko, tonic, ice);
        System.out.println(aperolShpric);

        Cocktail[] bar = new Cocktail[]{milkShake, romCola, aperolShpric, disco};
        System.out.println(Arrays.toString(bar));
    }
}
