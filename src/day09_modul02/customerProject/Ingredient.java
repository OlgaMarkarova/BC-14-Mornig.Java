package day09_modul02.customerProject;

class Ingredient {
    private String name;
    private boolean alcohol;
    private int volume;
    private int perCent;
    private int piece;

    public int getVolume() {
        return volume;
    }

    public int getPerCent() {
        return perCent;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public Ingredient(String name, int piece) {
        this.name = name;
        this.piece = piece;
    }

    public Ingredient(String name, int volume, int perCent) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "\nIngredient{" +
                "name='" + name + '\'' +
                ", alcohol=" + alcohol +
                ", volume=" + volume +
                ", perCent=" + perCent +
                '}';
    }
}
