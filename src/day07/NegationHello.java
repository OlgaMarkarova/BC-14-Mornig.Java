package day07;

public class NegationHello {


    public static void main(String[] args) {
        boolean redButton = false;
        System.out.println("Статус работы станка " + isActiveMachine(redButton));
        System.out.println("Статус работы станка " + isActiveMachine(true));
    }

    // Если красная кнопка нажата, то её статус TRUE
    //ЕСЛИ статус кнопки TRUE,
    // то статус метода isActiveMachine должен быть false

    private static boolean isActiveMachine(boolean stopSignal) {
        return !stopSignal;
    }
}


