package day27.homeworkOlga;

public class HW {
    public static void main(String[] args) {
        // Получив String и непустую Sring word, верните версию исходной String,
        // в которой все символы были заменены плюсами ("+"), за исключением появления String Word,
        // которая сохраняется без изменений.

        System.out.println(plusOut("12xy34", "xy"));// → "++xy++"
        System.out.println(plusOut("12xy34", "1"));// → "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy"));// → "++xy++xy+++xy"

    }

    private static String plusOut(String str, String word) {
        String output="";
        for (int i = 0; i < str.length(); i++) {

        }
        return output;
    }
}
