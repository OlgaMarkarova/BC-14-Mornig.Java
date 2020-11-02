package day33;

import java.util.Arrays;

public class PasswordsArray {
    public static void main(String[] args) {
        String passExample = createPassword(10);
        System.out.println(passExample);
        String[] passArray=createPassword(10,5);
        System.out.println(Arrays.toString(passArray));
    }

    private static String[] createPassword(int number, int length) {
        String[]output=new String[number];
        for (int i = 0; i < number; i++) {
            output[i]=createPassword(length);
        }
        return output;
    }

    private static String createPassword(int size) {
        String output = "";
        //for (char c =)
        for (int i = 0; i < size; i++) {
            output =output+ (char) (Math.random() * (90 - 65) + 65);
        }
        return output;
    }
}
