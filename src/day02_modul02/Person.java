package day02_modul02;

public class Person {
    String name;
    double weight;
    double height;
    double bmi;
    int age;
    public Person(){

    }
    public Person(String userName, double userWeight, double userHeight,int userAge){
        age=userAge;
        weight = userWeight;
        height = userHeight;
        name = userName;
        findBMI();
    }

    public Person(String userName, double userWeight, double userHeight) {
        weight = userWeight;
        height = userHeight;
        name = userName;
        findBMI();
    }

    public void findBMI() {
        bmi = weight / (height * height);
    }

    public void displayInfo() {
        System.out.println("Имя клиента: " + name);
        System.out.println(" BMI этого клиента: " + bmi);
        System.out.println(" Возраст этого клиента: " + age);
    }

}

class PersonTest {
    public static void main(String[] args) {
        Person hausMeister = new Person();
        hausMeister.name = "Vasili";
        hausMeister.weight = 100;
        hausMeister.height = 200;
        hausMeister.findBMI();
        hausMeister.displayInfo();

        Person user = new Person("Vasili", 100, 200);
        user.displayInfo();
        Person vova=new Person("Vova",76,187);
        vova.displayInfo();
    }


}
