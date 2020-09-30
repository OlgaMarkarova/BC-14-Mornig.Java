package day17;

public class HWCesar {
    public static void main(String[] args) {
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
    }

    private static String enigmaCaesar(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output += getMeLetter(input.charAt(i));

        }
        return output;
    }

    private static char getMeLetter(char inputChar) {
        char result=0;
        String inputString = " .,абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String outpuString = " .,гдеёжзийклмнопрстуфхцчшщъыьэюяабв";
        //int index = inputString.codePointAt(inputChar);
        int index = inputString.indexOf(inputChar);
        result = outpuString.charAt(index);
        return result;
    }
    private static char getMeLetterSimple(char inputChar) {
        char output = 0;
        switch (inputChar) {
            case 'а':
                //output = 'а'+3;
                output = 'г';
                break;
            case 'б':
                //output = 'б'+3;
                output = 'д';
                break;
            default:
                output = inputChar;
        }
        return output;
    }
}
