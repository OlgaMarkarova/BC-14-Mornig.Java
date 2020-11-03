package day02_modul02;

public class Car {
    String brand;
    String win;
    String color;
    int tiles;
    int doors;
    int mileAge;

    void move(int km) {
        System.out.println("Машина проехла " + km);
        mileAge += km;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car myFirstCar = new Car();
        myFirstCar.brand = "Ferrari";
        myFirstCar.move(100);
        System.out.println("Mileage ist: " + myFirstCar.mileAge);
        myFirstCar.move(300);
        System.out.println("Mileage ist: " + myFirstCar.mileAge);
        myFirstCar.mileAge=0;
        System.out.println("Mileage ist: " + myFirstCar.mileAge);
    }
}