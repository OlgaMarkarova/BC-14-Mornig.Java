package day18;

public class CW02_10 {
    public static void main(String[] args) {
        //Школа и геометрия
        //Школа приняла на работу молодую учительницу геометрии. 
        //И первым делом она решила привести кабинет точных наук в порядок. В подвале школы были найдены:
        //точная копия спутника земли ПС-1. Диаметр сферы 58см.
        //жестяной куб со стороной 40см.
        //правильная четырёхугольная пирамида "Хеопса" со стороной основания 20см и боковыми рёбрами 30см и чёрный ящик 
        //с размерами 80см * 30см * 20см.
        //Всё было в достаточно запущенном состоянии и новая учительница решила всё покрасить в красный цвет.
        //Сколько денег на покраску нужно потратить если на один квадратный метр надо 560мл краски, 
        //а балончик с аэрозольной краской 400мл стоит 17€?

        //1.Finde die Öberflächen der Figuren
        //2.Addiere die Flächen
        //3.Entscheide dich für eine geeignete Einheit
        //4.Finde die benötigte Menge der Farbe
        //5.Finde die Anzahl der Farbdosen
        //6.Finde die Höhe der Kosten
        double flaeche1 = flaecheSphaere(58);
        double flaeche2 = flaecheWuerfel(40);
        double flaeche3 = flaechePyramide(30, 20);
        double flaeche4 = flacheQuader(80, 30, 20);
        double gesamtFlaeche = flaeche1 + flaeche2 + flaeche3 + flaeche4;
        double mengeFarbe = findeFarbenMenge(gesamtFlaeche, 560);
        int anzahlDosen = countDosen(mengeFarbe);
        double price = priceCount(anzahlDosen, 17.00);
        System.out.println("Gesamtkosten betragen :" + price);
    }

    private static int countDosen(double mengeFarbe) {
        System.out.println("Mögliche Menge der Dosen " + (int) Math.ceil(mengeFarbe / 400));
        return (int) Math.ceil(mengeFarbe / 400);
    }

    private static double priceCount(double mengeDosen, double price) {
        return mengeDosen * price;
    }

    private static double findeFarbenMenge(double f, int ml) {
        f = f / 10000;// aus cm² in m²
        return f * ml;
    }

    private static double flacheQuader(int a, int b, int c) {
        return 2 * (a * b + b * c + a * c);
    }

    private static double flaechePyramide(int ground, int side) {
        double a = ground;
        double b = side;
        return (b * Math.sqrt(a * a - ((b * b) / 4))) / 2;
    }

    private static double flaecheWuerfel(int side) {
        return 6 * side * side;
    }

    private static double flaecheSphaere(int d) {
        return Math.PI * d * d;
    }
}
