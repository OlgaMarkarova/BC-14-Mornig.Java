package day04_modul02;

public class Fraction {
    private int numerator;//числитель //numerator
    private int denominator;//делитель,знаменатель //denominator

    Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    public Fraction sum(Fraction fraction) {
        Fraction result = sum(fraction, this);
        this.denominator = result.denominator;
        this.numerator = result.numerator;
        return result;
    }

    public static Fraction sum(Fraction a, Fraction b) {
        // описать сложение;
        // выполнить сокращение дробей, если это возможно
        // находим нок знаменателей дробей
        // подставить полученное значение в знаменатель РЕЗУЛЬТАТА
        // Разделить нок на знаменатели данных дробей.
        // умножить числитель и знаменатель каждой дроби на дополнительный множитель

        int cDenominator = Math.nok(a.denominator, b.denominator);
        int cNumerator =
                a.numerator * (cDenominator / a.denominator) +
                        b.numerator * (cDenominator / b.denominator);

        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    static class Math {
        static int nok(int a, int b) {
            return a * b / nod(a, b);
        }

        static int nod(int a, int b) {
            if (b == 0) {
                return a;
            }
            return nod(b, a % b);
        }
    }
}

class FractionTest {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(10);
        System.out.println(fr1);
        Fraction fr2 = new Fraction(3, 5);
        System.out.println(fr2);
        System.out.println(fr2.getDenominator());

        Fraction a = new Fraction(3, 4);
        Fraction b = new Fraction(5, 7);
        Fraction c = Fraction.sum(a, b);
        System.out.println(c);

        System.out.println(a.equals(b));

        System.out.println("-------------------------");
        Fraction x = new Fraction(5, 8);
        Fraction y = new Fraction(7, 9);

        System.out.println(x.sum(y));

        String hm = "Василий";
    }
}

