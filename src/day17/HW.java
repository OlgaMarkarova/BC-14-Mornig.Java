package day17;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
      // myNextInt();
        myPersident();
    }


    private static void myPersident() {
        int vote1;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите процент голосов отданных за кандидата 1");
        vote1 = input.nextInt();
        System.out.println("Введите процент голосов отданных за кандидата 2");
        int vote2 = input.nextInt();

        if (vote1 > vote2 && vote1 > 50) {
            System.out.println("победил кандидат 1");
        } else if (vote2 > vote1 && vote2 > 50) {
            System.out.println("победил кандидат 2");
        } else {
            System.out.println("президент не определён, возможно нужны перевыборы");
            input.close();
        }

        }
    private static void myNextInt() {
        int userAge;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        userAge = input.nextInt();
        System.out.println("Правильно, что ваш возраст " + userAge);
        boolean b = input.nextBoolean();
        System.out.println("Записано " + true);
        input.close();
    }
}
