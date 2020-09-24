package day11;

public class SimpleHW {
    public static void main(String[] args) {
        findPrimeNumber(1, 20);
        //System.out.println(checkPrime(10)); // false
        //System.out.println(checkPrime(2)); // true
    }

    private static void findPrimeNumber(int a, int b) {
        for (int i = a; i < b; i++) {
            if(checkPrime(i)){
                System.out.println(i + " ");
            }
        }
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

