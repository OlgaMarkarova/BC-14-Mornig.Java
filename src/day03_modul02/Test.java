package day03_modul02;

public class Test {
    public static void main(String[] args) {
        Human dame = new Human("Екатерина");
        //dame.name="Авдофья";
        dame.setName("Авдофья");
        System.out.println(dame.getName());
        dame.walk(3);
        System.out.println("Скорость дамы "+dame.speed);
        Dog dog=new Dog("Тузик");
        dame.dog=dog;
        dame.walkWithDog(10);
        System.out.println("Скорость собаки " +dog.getSpeedDog());
    }
}
