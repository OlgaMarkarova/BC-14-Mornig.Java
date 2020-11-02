package day16;

import static day07.Logik01.split;

public class CW01_18 {
    public static void main(String[] args) {
        //Given three ints, a b c,
        // return true if one of them is 10 or more less than one of the others.

        System.out.println(lessBy10(1, 7, 11));// → true
        System.out.println(lessBy10(1, 7, 10));// → false
        System.out.println(lessBy10(11, 1, 7));// → true
        split();
        //У вас есть красный лотерейный билет, в котором показаны int a, b и c, каждое из которых равно 0, 1 или 2.
        // Если все они имеют значение 2, результатом будет 10.
        // В противном случае, если они все одинаковы, результатом будет 5.
        // В противном случае, если и b, и c отличны от a, результат будет 1.
        // В противном случае результат будет 0.
        System.out.println(redTicket(2, 2, 2));// → 10
        System.out.println(redTicket(2, 2, 1));// → 0
        System.out.println(redTicket(0, 0, 0));// → 5
        System.out.println(redTicket(1, 1, 1));// → 5
        System.out.println(redTicket(2, 1, 1));// → 1
        split();

        //Учитывая два целых int, каждое в диапазоне 10..99,
        // вернет tru, если есть цифра, которая появляется в обоих числах, например, 2 в 12 и 23.
        // (Примечание: деление, например, n / 10, дает левую цифру, а % "mod" n% 10 дает правильную цифру.)

        System.out.println(shareDigit(12, 23));// → true
        System.out.println(shareDigit(12, 43));// → false
        System.out.println(shareDigit(12, 44));// → false
        split();

        //Учитывая день недели, закодированный как 0=Воскресенье,
        // 1=Полдень, 2=Туэ, ...6=Сеть, и логическое указание, находимся ли мы в отпуске,
        // верните String формы "7:00", указывающую, когда должен зазвонить будильник.
        // В будние дни будильник должен быть "7:00", а в выходные - "10:00".
        // Если мы не в отпуске - в будние дни это должно быть "10:00", а в выходные - "off".

        System.out.println(alarmClock(1, false));// →"7:00"
        System.out.println(alarmClock(5, false));// →"7:00"
        System.out.println(alarmClock(0, false));// →"10:00"
        System.out.println(alarmClock(0, true));// →"of"
        split();
        //We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
        // Return true if the given non- negative number is special.
        // Use the % "mod" operator -- see Introduction to Mod
        //Мы скажем, что число является особенным, если оно кратно 11 или на единицу больше, чем кратное 11.
        //Верните true, если данное неотрицательное число является особенным.
        //Используйте оператор% "mod" -

        System.out.println(specialEleven(22)); //→ true
        System.out.println(specialEleven(23));// → true
        System.out.println(specialEleven(24));// → false
        split();
        //Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
        // So for example 38 and 39 return true,
        // but 40 returns false. See also: Introduction to Mod

        System.out.println(less20(18));// → true
        System.out.println(less20(19));// → true
        System.out.println(less20(20));// → false
        split();
        //Your cell phone rings. Return true if you should answer it.
        // Normally you answer, except in the morning you only answer if it is your mom calling.
        // In all cases, if you are asleep, you do not answer.

        System.out.println(answerCell(false, false, false));// → true
        System.out.println(answerCell(false, false, true));// → false
        System.out.println(answerCell(true, false, false));// → false
    }

    private static boolean answerCell(boolean morning, boolean mama, boolean asleep) {
        if (asleep) {
            return false;
        } else if (morning && !mama) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean shareDigit(int one, int two) {
        int a1 = one / 10;
        int a2 = one % 10;
        int b1 = two / 10;
        int b2 = two % 10;
        return a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2;
    }

    private static boolean less20(int a)
    {
        return a % 20 == 19 || a % 20 == 18;
    }

    private static boolean specialEleven(int a) {
       //return a%11==0||a%11==1;
        if (a % 11 == 0) {
            return true;
        } else if (a % 11 == 1) {
            return true;
        }else
        return false;
    }

    private static String alarmClock(int day, boolean vacation) {
        String alarm = "";
        if (vacation && (day <= 6 && day >= 0)) {
            alarm = "off";
        } else if (day == 6 || day == 0 || vacation) {
            alarm = "10:00";
        } else {
            alarm = "7:00";
        }
        return alarm;
    }


    private static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else return 0;

    }

    private static boolean lessBy10(int a, int b, int c) {
        int ab = Math.abs(a - b);//находит модуль
        int bc = Math.abs(b - c);
        int ca = Math.abs(c - a);

        if (ab >= 10 || bc >= 10 || ca >= 10) {
            return true;
        } else {
            return false;
        }

    }
}
