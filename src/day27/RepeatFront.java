package day27;

import static day07.Logik01.split;

public class RepeatFront {
    public static void main(String[] args) {

        System.out.println(repeatFront("Chocolate", 4));// →"ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3));// →"ChoChC"
        System.out.println(repeatFront("Ice Cream", 2));// →"IcI"
        split();
        System.out.println(repeatFrontSecond("Chocolate", 4));// →"ChocChoChC"
        System.out.println(repeatFrontSecond("Chocolate", 3));// →"ChoChC"
        System.out.println(repeatFrontSecond("Ice Cream", 2));// →"IcI"
    }

    private static String repeatFront(String input, int number) {
        String output = "";
        int count = number;
        for (int i = 0; i < number; i++) {
            //System.out.println("test" + i+ output);
            output += input.substring(0, count--);
        }
        return output;
    }

    private static String repeatFrontThird(String input, int number) {
        String output = "";
        for (int i = 0; i < number; i++) {
            output += input.substring(0, number - i);
        }
        return output;
    }

    private static String repeatFrontSecond(String str, int number) {
        String output = "";
        for (int i = number; i > 0; i--) {
            output = output + str.substring(0, i);

        }
        return output;
    }
}
