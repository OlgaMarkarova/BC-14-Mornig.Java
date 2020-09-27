package day9.hw;

public class HW9_3 {
    public static void main(String[] args) {
        //forTimesAlphabetOne();
        //forTimesAlphabetTwo();
        //forTimesAlphabetThree();
        //forTimesAlphabetFor();
        forTimesAlphabet();

    }

    private static void forTimesAlphabet() {
        int n = 4;
        for (int i = 65; i <= 90; i += n) {
            System.out.println("   ");
            for (int e = i; e <= i + (n-1); e++) {
                char temp = (char) e;
                System.out.print(temp +" ");
            }
        }
    }

    //private static void forTimesAlphabetFor() {
    // for (char c='A';c<='')
    // String temp="";
    //}

    private static String forTimesAlphabetThree() {
        String result = "";
        for (char c = 'A'; c <= 'Z'; c++) {
            result = result + "\n+c+c+c+c";
        }
        return result;
    }

    private static void forTimesAlphabetTwo() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("" + c + c + c + c);//пустые ковычки помогают сложение изменить на конкатенцию
        }
    }

    private static void forTimesAlphabetOne() {
        for (int i = 65; i <= 90; i++) {
            char temp = (char) i;
            System.out.println("" + temp + temp + temp + temp);
        }
    }


}
