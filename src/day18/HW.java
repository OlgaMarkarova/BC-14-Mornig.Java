package day18;

public class HW {
    public static void main(String[] args) {
        //1.узнать площадь стены или пола
        //2.узнать кол-во плитки на 1 кв.м в двух вариантах
        //3.узнать общее кол-во плитки
        //4.узнать стоимость работы
        //5. узнать примерную общую стоимость.
        double lenght = 7.5;
        double width = 5.5;
        double lenghtTitle = 30;
        double widthTitle = 20;
        double masterPrice = 27;
        System.out.println("Площадь стены " + wallArea(7.5, 5.5));
        countOfTitle(7.5, 5.5, 30, 20);
        System.out.println(workHour(27));
         materialCost();
    }

    private static double materialCost() {
        //int count = countOfTitle(7.5,5.5)
        return 0;
    }

    private static double workHour(double masterPrice) {
        double price = masterPrice * wallArea(7.5, 5.5);
        System.out.println("стоимость работы " + price);
        return price;
    }


    private static double countOfTitle(double lenght, double width, double lenghtTitle, double widthTitle) {
        double lenghtTitleInMeter = lenghtTitle / 100;
        double widthTitleInMeter = widthTitle / 100;
        int countInLenght = (int) Math.ceil(lenght / lenghtTitleInMeter);
        int countInWidth = (int) Math.ceil(width / widthTitleInMeter);
        int result = countInLenght * countInWidth;
        System.out.println("ширина плитки на стене " + countInLenght);
        System.out.println("высота плитки на стене " + countInWidth);
        System.out.println("кол-во плиток " + result);
        return result;
    }


    private static double wallArea(double lenght, double width) {
        double area = lenght * width;
        return area;
    }
}
