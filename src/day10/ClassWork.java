package day10;

public class ClassWork {
    public static void main(String[] args) {
        //issuueFor();
        //0 до 100, делятся на 6 без остатка
        findVeryGreatNumber(0, 100);
    }

    private static void findVeryGreatNumber(int a,int b) {
        int greatNumber=6;
        for (int i = a; i <b; i++) {
            if (i%greatNumber==0);{
                System.out.println(i+ " ");
            }

        }
    }

    private static void issuueFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Шаги и значения " + i * 2);
            //System.out.println("Попробовать считать данные");
            //System.out.println("Смени айпи");
        }
    }
}
