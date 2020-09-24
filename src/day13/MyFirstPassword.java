package day13;

public class MyFirstPassword {
    public static void main(String[] args) {
        String myLittlePassword = "fgfhhjkhoikkljknkbmn";
        generatePassord(20);
        generatePassord(7);
        generatePassord(15);
        //Давайте напишем генератор паролей.
        // Методу передаётся длина пароля.
        // И метод генерирует пароль используя
        //латиницу, цифры и некоторые спецсимволы(на ваш выбор).
    }

    private static void generatePassord(int userInput) {
        String result = "";
        for (int i = 0; i < userInput; i++) {
            int min = 65;// цифровой код A.
            int max = 90;//код Z.
            char c = (char) ((Math.random() * (max - min) + 1) + min);
            result += c;
        }
        System.out.println(result.toLowerCase());
    }
}
