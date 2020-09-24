package day9;

public class Exercises5 {
    public static void main(String[] args) {
        //happyPelmen();
        modulaThre();
        // myLine(100);
        //mySecondLine(1000);
        /* В девятом классе Вася ездил со своим и
        параллельным классом в Париж. Известно,
        что на двоих учителей нельзя брать в поездку больше 25 детей.
        Напишите проверочный метод
        paris(11, 15) -> false paris(11, 5) -> true
         */
       //paris(11,15);

    }

    private static boolean paris(int a, int b) {
        if (a+b<=25){
            return true;
        }else
            return false; //return a + b <= 25;
    }

    private static void mySecondLine(int digit) {
        for (int i = 1; i < digit; i *= 2) {//i*= - i
            System.out.println(i + " ");
        }
    }

    private static void myLine(int digit) {
        for (int i = 7; i <= digit; i += 7) {// i+=7 - i = i+7
            System.out.println(i + " ");

        }
    }

    private static void modulaThre() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(" " + i);

        }
    }

    private static void happyPelmen() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Мы поймали счастливый пельмень");
                break;
            }
            System.out.println("Шаг цикла" + i);
        }
    }
}
