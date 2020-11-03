package day02_modul02;

public class Duck {
    String breed;
    int age;
    String color;
    String name;

    void displayInfo() {
        System.out.println("Race of Duck is: " + breed);
        System.out.println("Age of Duck is: " + age);
        System.out.println("Color of Duck is: " + color);
        System.out.println("Name of Duck is: " + name);
    }

    void swims() {
        System.out.println("Duck swims.");
    }

    void quacks() {
        System.out.println("Duck ");
    }

    void fies() {
        System.out.println();
    }

    void eats() {
        System.out.println();
    }

}
