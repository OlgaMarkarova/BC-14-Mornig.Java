package day09.hw;

public class HW9_5 {
    public static void main(String[] args) {
        //Параметр будний день true, если это будний день,
        //а параметр отпуск истинен, если мы в отпуске.
        //Мы спим, если сейчас не будний день или мы в отпуске.
        //Верните истину, если мы спим.
        System.out.println(sleepIn(false, false));// →true
        System.out.println(sleepIn(true, false));// →false
        System.out.println(sleepIn(false, true));// →true
    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday || vacation;
        //if (!weekday||vacation) {
        //return true;
        // } else return false;
    }
}
