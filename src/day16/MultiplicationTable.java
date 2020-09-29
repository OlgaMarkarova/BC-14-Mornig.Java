package day16;

public class MultiplicationTable {
    public static void main(String[] args) {
        creatMT(10);
    }

    private static void creatMT(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <=number; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
