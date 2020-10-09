package day23;

public class Converter {
    public static int convertBinaryToDecimal(String binaryNumber) {
        //    %10
        //    /10
        //    Math.pow()
        //    while 2
        int resultDecimal = 0;
        int power = 0;
        int binary = Integer.parseInt(binaryNumber);
        while (binary > 0) {
            int remainder = binary % 10;
            resultDecimal = (int) (resultDecimal + remainder * Math.pow(2, power));//!!!
            binary = binary / 10;
            power++;
        }
        return resultDecimal;
    }

    public static String convertDecimalToBinary(int numberDecimal) {
        String resultBinary = "";
        while (numberDecimal > 0) {
            int remainder;
            int systremKoofecient = 2;
            remainder = numberDecimal % systremKoofecient;
            resultBinary = remainder + resultBinary;//!!!
            numberDecimal = numberDecimal / systremKoofecient;
            //numberDecimal/=2; одинаково
        }
        return resultBinary;
    }
}
