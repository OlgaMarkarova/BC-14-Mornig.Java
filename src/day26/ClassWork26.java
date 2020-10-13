package day26;

public class ClassWork26 {
    //операторы перехода
    public static void main(String[] args) {
        searchFor();

    }

    private static void searchFor() {
        for (int i = 0; i < 20; i++) {
            if (i == 4) {
               // break;
                continue;
            }
            System.out.println("значеиние и:" + i);
        }
        System.out.println("цикл завершен");
    }
}
