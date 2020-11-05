package day04_modul02;

public class Fraction {
    private int chislitel;//числитель
    private int znamenatel;//делитель,знаменатель

    Fraction(int numerator) {
        this.chislitel = numerator;
        this.znamenatel = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.chislitel = numerator;
        this.znamenatel = denominator;
    }

    public void setChislitel(int chislitel) {
        this.chislitel = chislitel;
    }

    public void setZnamenatel(int znamenatel) {
        this.znamenatel = znamenatel;
    }

    public int getChislitel() {
        return chislitel;
    }

    public int getZnamenatel() {
        return znamenatel;
    }

   /* public static Fraction sum(Fraction a, Fraction b){
        //описать сложение.
        a.denominator*b.denominator
    }
*/


    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + chislitel +
                ", denominator=" + znamenatel +
                '}';
    }
}

class FractionTest {
    public static void main(String[] args) {
        Fraction fr1=new Fraction(10);
         System.out.println(fr1);
         Fraction fr2=new Fraction(3,5);
        System.out.println(fr2);
        System.out.println(fr2.getZnamenatel());
    }
}
