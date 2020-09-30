package day16;

public class HW {
    public static void main(String[] args) {
        //Разработайте шифровальную машину для нового клиента фирмы - Гая Юлия Цезаря.
        //Клиент придумал шифровальный алгоритм и хочет, что бы мы реализовали его в методе.
        //Пример выполнения метода:
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
        //"Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
        //"Фэиыя йи иьє ѐхлш пђжнлш чугрщцкфнлш дцосн, зг еютим ъгё."
        //Integer.toString(remainder) - переводит в String
    }

    private static void enigmaCaesar(String str) {
        /*for (int i = 1073; i < 1110; i++) {
            System.out.println(i);
            char output = (char) i;
            System.out.print(output);
        }*/
        for (int i = 0; i < str.length(); i++) {
            int input = str.codePointAt(i);
            if (input > 100) {
                input = input + 3;
            }
            char output = (char) input;
            System.out.print(output);
        }

    }
}

