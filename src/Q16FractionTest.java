public class Q16FractionTest
{
    public static void main(String[] args)
    {
        Q16Fraction f1 = new Q16Fraction(1, 2);
        Q16Fraction f2 = new Q16Fraction(3, 7);
        System.out.println("First fraction: " + f1.toString());
        System.out.println("Second fraction: " + f2.toString());

        System.out.println("product of f2 and f1 : " + f2.getProduct(f1));
        System.out.println("sum of f2 and f1 : " + f2.getSum(f1));
    }
}
