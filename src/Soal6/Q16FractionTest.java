package Soal6;

public class Q16FractionTest
{
    public static void main(String[] args) {
        Q16Fraction f1 = new Q16Fraction(1, 2);
        Q16Fraction f2 = new Q16Fraction(3, 7);
        System.out.println("First fraction: " + f1.toString());
        System.out.println("Second fraction: " + f2.toString());

        System.out.println("f2 get product of f1 : " + f2.getProduct(f1));
        System.out.println("f2 get sum of f1 : " + f2.getSum(f1));
    }
}
