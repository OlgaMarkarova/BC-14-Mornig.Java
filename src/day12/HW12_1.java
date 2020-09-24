package day12;

public class HW12_1 {
    public static void main(String[] args) {
        //contains(CharSequence s)  +
        //endsWith(String suffix)  +
        //equals(Object anObject)  +
        //startsWith(String prefix)  +
        //substring(int beginIndex)  +
        //toLowerCase()  +
        //toUpperCase()  +
        //trim()  ?

        stringMetod();
    }

    private static void stringMetod() {
        String str = "параметры";
        System.out.println(str.substring(4));
        System.out.println(str.substring(2, 5));
        //границы вывода или с какого символа и до конца выводить string.

        System.out.println(str.toLowerCase());
        //выводит с маленькой буквы.

        System.out.println(str.toUpperCase());
        System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));
        //выводит с большой буквы.

        if (str.endsWith("ы")) {
            System.out.println(str.substring(6));
            //последний символ string.
        }
        if (str.startsWith("п")) {
            System.out.println("пар");
            // первый символ string.
        }
        if (str.substring(0, 5).equals("парам"))
            System.out.println("соответствует");
        // показывает соответствие заданным параметрам, эквивалент.


        System.out.println(str.contains("ы"));
        // Проверяет правда или нет, есть ли такая буква.
        //System.out.println(str.trim());

    }


}
