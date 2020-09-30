package day17;

import java.util.Scanner;

public class NewThemeScanner {
    public static void main(String[] args) {
        //myPrint();
        myScanner();
    }

    private static void myScanner() {
        Scanner input = new Scanner(System.in);
        int old;
        System.out.println("Сколько тебе лет?");
        old=input.nextInt();
        if (old<18){
            System.out.println("Позовите своих родителей");
        }else {
            System.out.println("Добро пожаловать на сайт");
        }
        input.close();

    }

    private static void myPrint() {
        System.out.println();
        System.out.println("dfsd");
    }
}
