package day05;

public class Salary {
    public static void main(String[] args) {
        salaryOldWay();
        System.out.println(salaryNewWay(1000, 1.3));

    }

    private static double salaryNewWay(double hours, double k) {
        double minimalEuroPerHour = 9.26; // минимаотная зп а Герм.
        double result = hours * k * minimalEuroPerHour;
        return result;
    }

    private static void salaryOldWay() {
        /* Даны часы в месяц и коэффициент к зп и миним зп, посчитайте зп за
        месяц  */
        double hourSidorov = 100.0;
        double kSidorov = 2.0;
        // петров
        double hourPetrov = 155.5;
        double kPetrov = 1.1;
        //Sidorov

        findMySalary(hourSidorov, kSidorov);

        //petrov

        findMySalary(hourPetrov, kPetrov);

        // vasechkin

        findMySalary(150, 1.5);
    }


    private static void findMySalary(double hours, double k) {
        double minimalEuroPerHour = 9.26; // минимаотная зп а Герм.
        double result = hours * k * minimalEuroPerHour;
        System.out.println("зп за месяц " + result + " при выработке в "
                + hours + " и коэф " + k);
    }
}
