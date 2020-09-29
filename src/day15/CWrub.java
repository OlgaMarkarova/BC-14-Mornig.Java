package day15;

public class CWrub {
    public static void main(String[] args) {
        //printSumInRub(1, 5);
        printSumInRub(1, 35);
    }

    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + " " + rightWordInRussian(i));
        }
    }

    private static String rightWordInRussian(int number) {
        String output = "";
        String input = String.valueOf(number);
        String lastSymbol = "" + input.charAt(input.length() - 1);
        int lastDigit = Integer.parseInt(lastSymbol);
        if (number > 10 && number < 15 || lastDigit >= 5 || lastDigit == 0) {
            output = "рублей";
        } else if (lastDigit == 1) {
            output = "рубль";
        } else {
            output = "рубля";
        }
        return output;
    }
}
