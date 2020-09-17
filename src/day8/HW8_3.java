package day8;

public class HW8_3 {
    public static void main(String[] args) {
        int month = 9;
        season(month);
        System.out.println(season(month));
    }
    private static String season(int month) {
        String result = "";
        switch (month) {
            case 12:
            case 1:
            case 2:
                result = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                result = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                result = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                result = "Осень";
                break;
            default:
                result = "error30000000";
                break;
        }
        return result;
    }
}

