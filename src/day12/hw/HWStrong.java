package day12.hw;

public class HWStrong {
    public static void main(String[] args) {
        System.out.println(citiWeather("Moscow", "Пятница")); //22
    }

    private static int getTempMonday(String cityName) {
        int output = 0;
        switch (cityName) {
            case "Berlin":
                output = 20;
                break;
            case "London":
                output = 17;
                break;
            case "Lisbon":
                output = 25;
                break;
            case "Paris":
                output = 23;
                break;
            case "Moscow":
                output = 19;
                break;
            case "Minsk":
                output = 18;
                break;
            case "Saratov":
                output = 15;
                break;
            default:
                output = -273;
                break;
        }
        return output;
    }

    private static int citiWeather(String city, String weekday) {
        int cityTempOnMonday = getTempMonday(city);
        int tempK = getMeK(weekday);
        return tempK + cityTempOnMonday;
    }

    private static int getMeK(String weekday) {
        int output = 0;
        switch (weekday) {
            case "Понедельник":
                output = 0;
                break;
            case "Вторник":
                output = 1;
                break;
            case "Среда":
                output = 2;
                break;
            case "Четверг":
                output = 3;
                break;
            case "Пятница":
                output = 4;
                break;
            case "Суббота":
                output = 5;
                break;
            case "Воскресенье":
                output = 6;
                break;
            default:
                output = -1;
                break;
        }
        return output;
    }
}



