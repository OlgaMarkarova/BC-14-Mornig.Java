package day10;

public class HW10 {
    public static void main(String[] args) {
        //Напишите программу, которая находит чётные числа между a и b.
        //evenNumbers(1, 10);

        //Напишите программу, которая находит нечётные числа между a и b.
        //oddNumbers(1,10);

        //Напишите программу, которая находит числа кратные 11 между a и b.
        //multiple(11, 65);

        //Напишите программу, которая проверяет год на високосность. Кратный четырём.(с дополнениями)
        //год, номер которого кратен 400, — високосный;
        //остальные годы, номер которых кратен 100 — невисокосные (например, гoды 1700, 1800, 1900, 2100);
        //остальные годы, номер которых кратен 4, — високосные[5].
        System.out.println(leapYear(1600, 2000));

        //Дано число меньше 3000.
        //При делении числа на 32 получается остаток 30, при делении на 58 - остаток 44.
        //Найдите число или числа.
        //myDigit(3000);
    }

    private static void myDigit(double a) {
        for (int i = 0; i <= a; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.print(i + " ");
            }
        }

    }

    private static String leapYear(int a, int b) {
        String result = " ";
        for (int i = a; i <= b; i++) {
            if (i % 100 == 0 && i % 400 != 0) { // отметаем невисокосные года
                System.out.println();
            } else if (i % 4 == 0) {
                result = result + " " + "\n" + i;
            }
        }
        return result;
    }

    private static void multiple(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 11 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void oddNumbers(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    private static void evenNumbers(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
