package day09_modul02.customerProject;

import java.util.Arrays;

//Добавить несколько разных коктейлей.
//Вывести крепость(perCent) и объём(Volume) коктейлей. (через добавленные ингредиенты)
//Сделать детские, молочные коктейли.
//Создайте Bar (array[]) с напитками
//Подумайте какие поля ещё интересны (цена ect)

public class Cocktail {
    private String name;
    private Ingredient[] ingredients;
    private int volumeCocktail;
    private int perCent;


    public Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
        this.volumeCocktail = volumeOfCocktail(ingredients);
        this.perCent = perCentAlcohol(ingredients);
    }

    public int volumeOfCocktail(Ingredient... ingredients) {
        for (Ingredient element : ingredients) {
            volumeCocktail = volumeCocktail + element.getVolume();
        }
        return volumeCocktail;
    }

    public int perCentAlcohol(Ingredient... ingredients) {
        for (Ingredient element : ingredients) {
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Cocktail{" +
                "name='" + name + '\'' +
                ", volumeCocktail=" + volumeCocktail + ", " +
                "ingredient=" + Arrays.toString(ingredients) +
                '}';
    }
}
