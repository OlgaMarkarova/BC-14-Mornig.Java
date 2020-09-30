package day17.hw;

public class HWWhile {
    public static void main(String[] args) {
        //Даны целые числа A и B, где B > 0. Вывести B раз число A.
        //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
        //outputNumbers(2, 5);
        outputNumbersOther(5, 17);
    }

    private static void outputNumbersOther(int a, int b) {
        /*int i = 5;
        do {
            System.out.println(i);
            i++;
        }while (i<=b);*/

        int i = 5;
        while (i <= b) {
            System.out.println(i);
            i++;
        }
        /*for (int i = a; i <=b ; i++) {
            System.out.println(i);*/

    }

    private static void outputNumbers(int a, int b) {

        /*int i = 0;
        do {
            System.out.println(a);
            i++;
        } while (i < b);*/

        int i = 0;
        while (i < b) {
            System.out.println(a);
            i++;
        }
        /*for (int i =0; i <b ; i++) {
                    System.out.println(a);
                }
                return 0;*/
    }
}
