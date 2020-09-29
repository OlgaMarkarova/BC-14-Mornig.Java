package day16;

public class MagicLoop {
    public static void main(String[] args) {
        System.out.println(convertDecimalToBinary(78));

    }

    private static String convertDecimalToBinary(int decimal) {
        String output = "";
        int remainder;
        while (decimal > 0) {
            remainder = decimal % 2;
            output = remainder + output;     //Integer.toString(remainder) - переводит в String
            decimal = decimal / 2;
        }
        return output;
    }
}
