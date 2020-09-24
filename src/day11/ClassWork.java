package day11;

public class ClassWork { // вложенные циклы Nested Loops // печем пирожки, в духовку за раз можно только пять штук
    public static void main(String[] args) {

        //Учитывая неотрицательное число «num», вернуть true,
        // если num находится в пределах 2 от кратного 10.
        //Примечание: (a% b) - это остаток от деления a на b, поэтому (7% 5) равно 2.
        // См. Также : Введение в мод

        //System.out.println(nearTen(12));// → true
        //System.out.println(nearTen(17));// → false
        //System.out.println(nearTen(19));//¬ → true

        //Мы устраиваем вечеринку с большим количеством чая и конфет.
        // Возвращаем int результат вечеринки, закодированный как 0=bad, 1=good, или 2=great.
        // Вечеринка хороша (1), если и чай, и конфеты как минимум 5.
        // Однако, если чай или конфеты как минимум в два раза больше, чем другая, то вечеринка великолепна (2).
        // Однако, во всех случаях, если чай или конфета меньше 5, вечеринка всегда плохая (0).

        // System.out.println(teaParty(6, 8));//1
        //System.out.println(teaParty(3, 8));//
        //System.out.println(teaParty(20, 6));//2

        //Получив три инта, a b c, верните true,
        // если можно добавить два инта, чтобы получить третий.

        //System.out.println(twoAsOne(1, 2, 3)); //→true
        //System.out.println(twoAsOne(3, 1, 2));// →true
        //System.out.println(twoAsOne(3, 2, 2));// →false

        //Даны три int , a b c, возвращают true,
        // если две или более из них имеют одну и ту же последнюю цифру.
        //int неотрицательны. Примечание: оператор % "mod" вычисляет остаток, например, 17 % 10 равно 7.

        //System.out.println(lastDigit(23, 19, 13));// → true
        //System.out.println(lastDigit(23, 19, 12));// → false
        //System.out.println(lastDigit(23, 19, 3));// → true

        //Учитывая два значения int, возвращайте то значение, которое больше.
        // Однако если два значения имеют одинаковый остаток при делении на 5,
        // то возвращается меньшее значение. Однако во всех случаях,
        // если два значения одинаковы, возвращаем 0.
        // Примечание: оператор % "mod" вычисляет остаток, например, 7 % 5 равно 2.

        //System.out.println(maxMod5(2, 3));// → 3
       // System.out.println(maxMod5(6, 2)); //→ 6
        //System.out.println(maxMod5(3, 2));// → 3

        //У вас есть синий лотерейный билет, с вставками a, b и c. (11файл,10 задача)
        // Это делает три пары, которые мы называем ab, bc и ac. Рассмотрим сумму цифр в каждой паре.
        // Если любая пара сложится ровно в 10, то результат будет 10.
        // Иначе, если сумма ab ровно на 10 больше,
        // чем сумма bc или ac, то результат равен 5.
        // Иначе результат равен 0.

        System.out.println(blueTicket(9, 1, 0));// → 10
        System.out.println(blueTicket(9, 2, 0)); //→ 0
        System.out.println(blueTicket(6, 1, 4)); //→ 10


        //You и Date свидание пытаетесь получить столик в ресторане.
        // Параметр "you" - стильность вашей одежды,
        // в диапазоне 0...10, а "date" - стильность одежды вашей пары.
        // Результат получения таблицы кодируется как значение int с 0=нет, 1=может быть, 2=да.
        // Если кто-то из вас очень стильный, 8 или больше, то результат - 2 (да).
        // За исключением того, что если кто-то из вас имеет стиль 2 или меньше, то результат будет 0 (нет).
        // В противном случае результат - 1 (возможно).

        //System.out.println(dateFashion(5, 10)); //→ 2
        //System.out.println(dateFashion(5, 2)); //→ 0
        //System.out.println(dateFashion(5, 5)); //→ 1


    }

    private static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        } else if (ab - bc == 10 || ab - ac == 10) {
            return 5;
        } else {
            return 0;
        }
    }

    private static int dateFashion(int you, int date) {
            if (you <= 2 || date <= 2) {
                return 0;
            } else if (you >= 8 || date >= 8) {
                return 2;
            }
            return 1;
    }

        private static int maxMod5(int a, int b) {
            if (a == b) {
                return 0;
            } else if (a % 5 == 0 && b % 5 == 0) {
                return Math.min(a, b);
            } else {
                return Math.max(a, b);
            }
    }

    private static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
        //if (a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10) {
        //            return true;
    }

    private static boolean twoAsOne(int a, int b, int c) {

        return a + b == c || b + c == a || a + c == b;
    }


    private static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea / candy >= 2 || candy / tea >= 2) {
            return 2;
        }
        if (tea >= 5 && candy >= 5) {
            return 1;
        }
        return tea;
    }


    private static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;

        //if (num % 10 <= 2||num%10>=8) {
        //            return true;
        //        }
        //        return false;
        //    }
    }
}
