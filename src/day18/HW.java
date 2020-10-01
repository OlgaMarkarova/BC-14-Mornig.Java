package day18;

public class HW {
    public static void main(String[] args) {
        //Нам известно, что в час он кладёт примерно один квадратный метр плитки.
        //Его час стоит 27€ без НДС.
        //Стандартная плитка 30 на 20 сантиметров.
        //Сергей Иванович обратился к нам за помощью и вам надо написать для него программу.
        //Которая будет принимать размеры стены/пола, стоимость плитки и выдавать:
        //Количество требуемых плиток, как целых, так и тех которые надо будет резать.
        //Учтите, что плитку можно класть как вдоль, так и поперёк и только на месте мастер узнает,
        //как именно её надо класть.
        //Стоимость материала
        //Стоимость рабочего времени
        //Итоговую ориентировочную стоимость
        numberOfWholeTile(30, 20);
        numberOfOtherTile(30, 20);
        costOfTile();
        laborCost(27);
        estimatedCost();
        wallArea(0, 0);
        floorArea(0, 0);

    }

    private static void costOfTile() {             // стоимость плитки
    }

    private static void estimatedCost() {           // стоимость рабочего времени
    }

    private static void laborCost(int costAnHauer) {   // примерная стоимось
    }

    private static void wallArea(int length, int width) {     //площадь стены
        int areaW =(length+width)*2;
    }

    private static void floorArea(int length, int height) {    //площадь пола
        int areaF = (length + height) * 2;
    }

    private static void numberOfOtherTile(int a, int b) {       //кол-во резаной плитки
    }

    private static void numberOfWholeTile(int a, int b) {       //кол-во целой плитки
    }
}
