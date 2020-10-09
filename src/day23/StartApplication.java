package day23;

public class StartApplication {
    public static void main(String[] args) {
/*      int hexValue1 = 0x100; // Шестнадцатеричная система счисления
        int binary = 0B1001_1001; // Двоичная система счисления
        int octal = 0757; // восьмеричная система счисления*/
        int decimalNumber = 99;
        String myBinaryNumber
                = Converter.convertDecimalToBinary(decimalNumber);
        System.out.println(
                "Результат работы конвертера: "
                        + decimalNumber
                        + " в двоичной системе: "
                        + myBinaryNumber);
       // split()
        System.out.println(Converter.convertDecimalToBinary(78));
        System.out.println(Converter.convertBinaryToDecimal("11111111"));
    }
}
