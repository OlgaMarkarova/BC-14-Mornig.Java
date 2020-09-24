package day10;

public class HWLeapYear {
    public static void main(String[] args) {
        //Напишите программу, которая проверяет год на високосность. Кратный четырём.(с дополнениями)
        //год, номер которого кратен 400, — високосный;
        //остальные годы, номер которых кратен 100 — невисокосные (например, гoды 1700, 1800, 1900, 2100);
        //остальные годы, номер которых кратен 4, — високосные.
        System.out.println(leapYear(1900));
        System.out.println(leapYear(2000));
        System.out.println(leapYear(2020));
        System.out.println(leapYear(2019));
    }

    private static boolean leapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) /* ^==0 */ {
            return true;
        }
        return false;
        //(year % 400 == 0 && year % 100 != 0||year % 4 == 0)
    }
}
