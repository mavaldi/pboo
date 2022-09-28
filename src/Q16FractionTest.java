public class Q16FractionTest
{
    public static void main(String[] args)
    {
        // Create an object of class Q16Fraction for first fraction "f1" (This will call the constructor)
        Q16Fraction f1 = new Q16Fraction(1, 2);
        // Create an object of class Q16Fraction for second fraction "f2" (This will call the constructor)
        Q16Fraction f2 = new Q16Fraction(3, 7);

        // Print out the first and second fraction
        System.out.println("First fraction: " + f1.toString());
        System.out.println("Second fraction: " + f2.toString());

        // Print out the product of fraction f1 and f2
        System.out.println("product of f2 and f1 : " + f2.getProduct(f1));

        // Print out the sum of fraction f1 and f2
        System.out.println("sum of f2 and f1 : " + f2.getSum(f1));
    }
}
