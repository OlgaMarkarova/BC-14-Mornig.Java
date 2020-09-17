package day8;

public class HW8_2 {
    public static void main(String[] args) {
        /*Напишите программу действий кассира магазина,
        если у него пытаются купить алкоголь следующие 5 покупателей:
        10 лет, 17 лет, 18 лет, 20 лет и 30 лет.
         */
        int age = 30;
        System.out.println(alcoholIsAllowed(age));

        alcoholIsAllowed(age);
    }

    private static String alcoholIsAllowed(int age) {
        String output = "";
        switch (age) {
            case 10:
                output="алкоголь продавать запрещено";
                break;
            case 17:
                output = "разрешены только слабоалкогольные напитки";
                break;
            case 18:
            case 20:
            case 30:
                output = "разрешены крепкие алкогольные напитки";
                break;
            default:
                output = "ошибка системы";
                break;
        }


        return output;
    }
}
