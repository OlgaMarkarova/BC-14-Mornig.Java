package day03_modul02;

class TestCat {
    public static void main(String[] args) {
        Cat kitty = new Cat("Пушок");
        Cat siam1 = new Cat("Фараон",
                "2020-11-04", "Мальчик", "Silver", 100);

        Address siam1Address = new Address("Berlin", "K-dam");
        // siam1Address.city="Berlin";    - так теперь невозможно. приватное поле
        siam1Address.houseNumber = 56;
        siam1Address.zip = "000000";

        siam1.address = siam1Address;
        Address adr = new Address("", "");

        Cat barsik = new Cat("Барсик", new Address("", "")); // редко ипользуется
        Cat puzic = new Cat("", adr);
    }
}

public class Cat {          //это поля конструктора
    private String name;        //кличка
    String birthDay;    // Д.Р.
    String breed;       //порода
    String color;
    int chipID;
    String gender;
    double weight;
    double height;
    double price;
    boolean passport;
    Address address;
    double bmiIndex;

    Long version = 2020_11_04_00_10_07L;   //версионирование, java, ubuntu

    Cat(String name) {
    }

    Cat(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    Cat(String name, String breed) {
    }

    Cat(String name, String birthDay, String gender, String color, double price) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.color = color;
        this.price = price;
        this.setBmiIndex();
    }

    Cat(String catName, String catBirthDay, String catGender, String catColor) {
        name = catName;
        birthDay = catBirthDay;
        gender = catGender;
        color = catColor;
    }

    void setBmiIndex() {
        this.bmiIndex = price * price;
    }
}

class Address {
    private String city;            // их теперь невозможно поменять
    private String street;
    int houseNumber;
    String zip;

    Address(String City, String street) {
    }
}
