package day27;

public class HWString {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
    }

    private static String doubleChar(String input) {
        String output = "";
        int number = 2;
        for (int i = 0; i < number; i++) {
            output+= input.substring(0,input.length()-1);
            /*String output = "";
            for (int i = number; i > 0; i--) {
                output = output + str.substring(0, i);*/

                //output += input.charAt(0);
            //output = input.charAt(i);
                    //input.charAt(i) + input.charAt(i);
            //System.out.println("Шаги и значения " + i);
        }
        return output;
    }
}
