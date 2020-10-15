package day28;

public class HW27 {
    public static void main(String[] args) {
        // Получив String и непустую Sring word, верните версию исходной String,
        // в которой все символы были заменены плюсами ("+"), за исключением появления String Word,
        // которая сохраняется без изменений.

        System.out.println(plusOut("12xy34", "xy"));// → "++xy++"
        System.out.println(plusOut("12xy34", "1"));// → "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy"));// → "++xy++xy+++xy"

    }

    private static String plusOut(String str, String xy) {

        String result = "";
        String plus = "+";
        int count = 0;
        String input = str;
        for (int i = 0; i < str.length(); i++) {
            if (i == input.indexOf(xy) + count) {
                result += str.substring(i, i + xy.length());
                i += xy.length() - 1;
                count += input.indexOf(xy)+xy.length();
                input = input.substring(input.indexOf(xy)+xy.length());
            } else {
                result += plus;
            }
        }
        return result;
    }
       /* String output = "";
        String plus = "+";
        int size = secondStr.length();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == secondStr.charAt(0)) {
                //то тогда не меняем на плюсы, пока длина второго String не закончится
                for (int j = 0; j < size; j++) {
                    output = output + secondStr.charAt(j);
                }

            } else {
                output = output + plus;
            }
        }
        return output;*/
    }

