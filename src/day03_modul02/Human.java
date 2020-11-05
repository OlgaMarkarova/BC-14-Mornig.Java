package day03_modul02;

public class Human {
    private String name;
    public int speed;
    Dog dog;

    //конструктор
    public Human() {

    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, Dog dog) {

    }

    public void setName(String name) {       //изменяет информацию
        this.name = name;
    }

    public String getName() {           //отдают иформацию
        return this.name;
    }

    public void walk(int speed) {
        this.speed = speed;
    }

    public void walkWithDog(int speed) {
        walk(speed);
        dog.runAround(speed*3);
    }
}

class Dog {
    private String nameDog;
    private int speedDog;

    public Dog(String name){
        this.nameDog=name;
    }
    public void runAround(int skorost){
        this.speedDog=skorost;
       // System.out.println("Скорость собаки "+ skorost); //speedDog и то и то можно вызвать
    }
    public void eat(){
        System.out.println("Дай мне мяса");
    }

    public int getSpeedDog() {
        return this.speedDog;
    }
}