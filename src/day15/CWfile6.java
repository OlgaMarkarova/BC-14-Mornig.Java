package day15;

public class CWfile6 {
    public static void main(String[] args) {


        //Реализовать метод, который принимает целое положительное число.
        //Метод должен выводить на экран все положительные числа,
        //на которые заданное число делится без остатка и отображает количество найденных делителей.

        //printDivisors(32);

        //Дано два целых положительных числа от 1 до 99.
        // Реализовать метод, который для каждого числа от a до b печатает строку вида “23 рубля”

        //!!! переписать код с использованием несколькоих методов!!!

        printSumInRub(1, 5);
        printSumInRub(11, 35);

        // звездочка и пробел в шахматном порядке
        //displayChessBoard(8);

    }

    public static boolean check(int number) {
        return number % 2 == 0;
    }

    {

    }

    private static void displayChessBoard(int number) {
        char simbol1, simbol2;
        simbol1 = '*';
        simbol2 = '_';
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (check(i) && !check(j) || !check(i) && check(j)) {
                    System.out.print(simbol1);
                } else {
                    System.out.print(simbol2);
                }

            }
            System.out.println();
        }
    }

    private static void printDivisors(int a) {
        int count = 0;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println("Total divisors: " + count);
    }

    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + "" + rightWordInRussian(i));
        }

    }

    private static String rightWordInRussian(int number) {
        String output = "";
        String input = String.valueOf(number);
        String lastSymbol = "" + input.charAt(input.length() - 1);
        int lastDigit = Integer.parseInt(lastSymbol);
        if (lastDigit == 1) {
            output = "рубль";
        } else if (lastDigit >= 5 || lastDigit == 0) {
            output = "рублей";
        } else {
            output = "рубля";
        }
        return output;
    }
}
