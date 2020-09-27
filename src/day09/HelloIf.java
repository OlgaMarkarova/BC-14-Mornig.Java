package day09;

public class HelloIf {
    public static void main(String[] args) {
        //ifIntroductionOne();
        //ifIntroductionTwo();
        ifIntroductionThree();
        //ifIntroductionFor();


    }

    private static void ifIntroductionFor() {
        if (true){
            System.out.println("тогда все хорошо");
        }
    }

    private static void ifIntroductionThree() {
        int age = 15;
        if (age < 16) {// if {}-then
            System.out.println("Категорически запрещено продавать алкоголь");
        } else if (age >= 16 && age < 18) {
            System.out.println("Слабый алкоголь можно продавать");
        } else {
            System.out.println("Можно продавать алкоголь");
        }

    }

    private static void ifIntroductionTwo() {
    }

    private static void ifIntroductionOne() {
        boolean permition = true;
        boolean prohibitionDenyDe = true;

        if (!prohibitionDenyDe) {// permition == true ==true можно не писать, в permition уже заложено
            System.out.println("Можно поехать в лагерь");
        } else {

            System.out.println("Никто не поедет");
        }
    }


}
