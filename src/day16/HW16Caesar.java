package day16;

public class HW16Caesar {
    public static void main(String[] args) {
        //Разработайте шифровальную машину для нового клиента фирмы - Гая Юлия Цезаря.
        //Клиент придумал шифровальный алгоритм и хочет, что бы мы реализовали его в методе.
        //Пример выполнения метода:
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
        //"Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
        //"Фэиыя йи иьє ѐхлш пђжнлш чугрщцкфнлш дцосн, зг еютим ъгё."
    }

    private static void enigmaCaesar(String str) {
        for (int i = 0; i < str.length(); i++) {
            int input = str.codePointAt(i);
            if (input > 100) {
                input += +3;
            }
            char output = (char) input;
            System.out.print(output);

            // private static String enigmaCaesar(String input) {
            //        String output = "";
            //        for (int i = 0; i < input.length(); i++) {
            //            output += getMeLetter(input.charAt(i));
            //        }
            //        return output;
            //    }
        }
    }
        private static char getMeLetter(char inputChar){
            char result = 0;
            String inputString = " .,абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
            String outpuString = " .,гдеёжзийклмнопрстуфхцчшщъыьэюяабв";
            //int index = inputString.codePointAt(inputChar);
            int index = inputString.indexOf(inputChar);
            result = outpuString.charAt(index);
            return result;
        }


    }


