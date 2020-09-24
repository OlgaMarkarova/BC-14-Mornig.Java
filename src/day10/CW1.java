package day10;

public class CW1 {
    public static void main(String[] args) {
        //10. Дано два целых положительных числа от 1 до 99.
        // Реализовать метод, который для каждого числа от a до b печатает строку вида “23 рубля”
        //Пример: printSumInRub(1,5) ->
        //1 рубль
        //2 рубля
        //3 рубля
        //4 рубля
        //5 рублей
        //multiplicationTable(6);

        //Когда белки собираются на вечеринку, они любят сигары.
        //Беличья вечеринка считается успешной,
        // когда количество сигар от 40 до 60 включительно.
        // Если это не выходные дни, и в этом случае ограничение на количество сигар не ограничено.
        //Вернуть истину, если партия с данными значениями успешна, или ложь в противном случае.

        //System.out.println(cigarParty(30, false));// → false
        //System.out.println(cigarParty(50, false));// → true
        //System.out.println(cigarParty(70, true));// → true

        //Вы едете слишком быстро, и вас останавливает полицейский.
        // Напишите код для вычисления результата,
        // закодированного как значение типа int: 0 = нет билета, 1 = маленький билет, 2 = большой билет.
        // Если скорость 60 или меньше, результат равен 0.
        // Если скорость составляет от 61 до 80 включительно, результат будет 1.
        // Если скорость 81 или больше, результат будет 2.
        // Если это ваш день рождения - в этот день ваш во всех случаях скорость может быть на 5 меньше.

        //System.out.println(caughtSpeeding(60, false));// → 0
        //System.out.println(caughtSpeeding(65, false));// → 1
        //System.out.println(caughtSpeeding(65, true));// → 0

        //Вернуть истину, если данное неотрицательное число на 1 или 2 больше,
        // чем кратное 20. См. Также: Введение в мод.
        //Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
        // See also: Introduction to Mod

        System.out.println(more20(20));// → false
        System.out.println(more20(21));// → true
        System.out.println(more20(22));// → true
    }

    private static boolean more20(int number) {
        return (number % 20) == 1 || (number % 20) == 2;
    }

    private static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }

        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) { // speed >= 61 && speed <= 80
            return 1;
        } else return 2;
    }

    private static boolean cigarParty(int numberOfCigars, boolean weekend) {
        if (numberOfCigars >= 40 && numberOfCigars <= 60) {
            return true;
        } else if (weekend && numberOfCigars >= 40) {
            return true;
        } else return false;
    }

    private static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + "равно" + number * i);
        }
    }
}
