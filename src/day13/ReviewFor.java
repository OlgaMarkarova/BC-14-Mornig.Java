package day13;

public class ReviewFor {
    public static void main(String[] args) {
        //examplOne();
        //examplTwo();
        examplThree();
        examplFor();
    }

    private static void examplFor() { // !!!так не делают!!!
        int i = 0;
        for (; i < 10; ) {
            System.out.println(i);
            i++;
        }
    }

    private static void examplThree() {
        for (int i = 1; i < 100; i *= 2) { //i=i * 2
            System.out.println(i);

        }
    }

    private static void examplTwo() {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);

        }
    }

    private static void examplOne() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }
    }
}

