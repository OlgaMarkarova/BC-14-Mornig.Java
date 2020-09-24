package day03.homework3;

public class HW6 {
    public static void main(String[] args) {
        int customeYear = 15;
        bankAccount ( 1000, 7,  3.5);
    }

    private static void bankAccount (double money, int year, double interest) {
        double result = interest * year * money / 100 + money;
        System.out.println("Сумма в конце вклада " + result);
    }
}
