package day06;

public class HelloString {
    public static void main(String[] args) {
       String student1,student2;
       student1 = "Elene Prekrasnay";
       student2 = "Ivan Durak";

        helloUser(student1);
        helloUser(student2);
        helloUser("Andrey");
        char c1 = 150;
        char c2 = (char) (c1+20);
        System.out.println("" + c1 + 10);
        System.out.println("" + c2 +10);

    }

    private static void helloUser(String userName) {
        System.out.println("Hello " + userName + "!");
    }
}
