package day09;

public class ItsMyLife {public static void main(String[] args) {
    //loop();
    //forIntroductionOne();
    forIntroductionTwo();

}

    private static void forIntroductionTwo() {
        for (int i = 1; i < 10; i *= 2) {
            System.out.println("Шаги" + i);
        }
    }

    private static void forIntroductionOne() {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a++;
        }
        for (int i = 0; i < 20; i++) {
            a++;
        }
        {
            int b = 5;
        }

        int i = 10;
        System.out.println(a);
        System.out.println(i);
    }

    private static void loop() {
        int workWeekDays = 5;
        int j = 0;
        // пока j меньше workWeekDays
        j = j + 1;
        // начало, условие, шаг
        for (int i = 0; i < workWeekDays; i++) {
            System.out.println("------------");
            System.out.println("Новый день");
            System.out.println("Встаю в шесть утра");
            System.out.println("На завод в восемь");
            System.out.println("Дома снова в 18:00");
            System.out.println("Обязательно смотрю два часа Netflix");
            System.out.println("Сигарета с соседом");
            System.out.println("День подходит к концу");
            System.out.println("Иду спать");
            System.out.println("-------------");
        }
    }
}
