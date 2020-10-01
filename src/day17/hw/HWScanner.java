package day17.hw;

import java.util.Scanner;

public class HWScanner {
    public static void main(String[] args) {
        //Напишите программу, которой надо представиться.
        //Данные, которые спрашивает машина: имя, фамилия, пол, возраст, e-mail.
        //Для считывания данных типа String используйте метод next(): input.next()
        //introduceYourself();

        //Компьютер загадывает число от 1 до n.
        // У пользователя k попыток отгадать.
        // После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
        // В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).
        guessNumber(5);
    }

    private static void guessNumber(int k) {
        Scanner input = new Scanner(System.in);

        int min = 1;
        int max = 10;
        int n = (int) ((Math.random() * (max - min) + 1) + min);
        //System.out.println(n);

        for (int i = k; i > 0; i--) {
            System.out.println("Осталось попыток: " + i);
            int attempt;
            System.out.println("Угадайте число");
            attempt = input.nextInt();
            if (attempt < n) {
                System.out.println("Я загадал больше");
            } else if (attempt > n) {
                System.out.println("Я загадал меньше");
            } else  {
                System.out.println("Вы угадали!!!");
            }
        }
        if (k==0){
        System.out.println("Попытки закончились");
        }
        input.close();
    }


    private static void introduceYourself() {
        Scanner input = new Scanner(System.in);
        String name;
        String surname;
        String gender;
        int age;
        String email;
        System.out.println("Представьтесь, пожалуйста. " + "\n Введите Ваше имя");
        name = input.next();
        System.out.println("Введите Вашу фамилию");
        surname = input.next();
        System.out.println("Введите Ваш пол");
        gender = input.next();
        System.out.println("Введите Ваш возраст");
        age = input.nextInt();
        System.out.println("Введите Ваш email");
        email = input.next();

        System.out.println("Вы ввели");
        System.out.println("Ваше имя - " + name);
        System.out.println("Ваша фамилия - " + surname);
        System.out.println("Ваш пол - " + gender);
        System.out.println("Ваш возраст - " + age);
        System.out.println("Ваш email - " + email);
        input.close();
    }
}
