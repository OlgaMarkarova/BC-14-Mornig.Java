package day15;

public class LovelyLeapYear {
    public static void main(String[] args) {
        //Реализовать метод, печатающий все високосные годы в интервале от year1 до year2
        //Пример: printLeapYears(2000,2009) ->//2000
        //2004
        //2008
        printLeapYear(2000,2009);
        printLeapYear(1900,2009);

        //Реализовать метод,
        //считающий все високосные годы в интервале от year1 до year2 Пример: countLeapYears(2000,2009) -> 3
        countLeapYears(1900,2009);
    }

    private static void countLeapYears(int year1,int year2) {
        int count =0;
        for (int i = year1; i <=year2 ; i++) {
            if (chekLeapYear(i)){
                count++;
            }
        }
        System.out.println("Между годами " + year1 + " и "
                + year2 + " всего " + count + " високосных лет");
    }


    private static void printLeapYear(int year1, int year2) {
        for (int i = year1; i <=year2; i++) {
            if (chekLeapYear(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean chekLeapYear(int year) {
        return year%400==0||year%4==0^year%100==0;
    }

}
