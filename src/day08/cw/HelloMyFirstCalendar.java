package day08.cw;

public class HelloMyFirstCalendar {
    public static void main(String[] args) {
        String myVeryLovelyMonth = "Май";
        getMeMonthNumber(myVeryLovelyMonth);
        System.out.println(getMeMonthNumber(myVeryLovelyMonth));

    }

    private static int getMeMonthNumber(String month) {
        int result = 0;

        switch (month){
            case "Январь":
                result = 1;
                break;
            case "Февраль":
                result =2;
                break;
            case "Март":
                result =3;
                break;
            case "Апрель":
                result=4;
                break;
            case "Май":
                result=5;
                break;
            case "Июнь":
                result=6;
                break;
            case "Июль":
                result=7;
                break;
            case "Август":
                result=8;
                break;
            case "Сентяьбрь":
                result=9;
                break;
            case "Октябрь":
                result=10;
                break;
            case "Наябрь":
                result=11;
                break;
            case "Декабрь":
                result=12;
                break;
            default:
                result=0;
                break;
        }
        return result;
    }
}
