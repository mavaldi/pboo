public class Q11Fraction
{
    public static int fractionCalculator (int e1, int d1, int e2, int d2, char operation)
    {
        int es = 0;
        int ds = 0;
        int ep = 0;
        int dp = 0;

        if (operation == '+')
        {
            if(d1 == d2)
            {
                es = e1 + e2;
                ds = d1;
            }
            else
            {
                es = e1 * d2 + e2 * d1;
                ds = d1 * d2;
            }

            System.out.printf("%d/%d %c %d/%d = %d/%d\n", e1, d1, operation, e2, d2, es, ds);
        }
        else if (operation == '*')
        {
            ep = e1 * e2;
            dp = d1 * d2;

            System.out.printf("%d/%d %c %d/%d = %d/%d\n", e1, d1, operation, e2, d2, ep, dp);
        }
        return 0;
    }
    /* - For question number 1, where you have to calculate the sum or products of 2 given fraction that contain integer that called e1/d2 for 1st fraction and e2/d2 for 2nd fraction
       - In my method "fractionCalculator" i was using if and else statement to difference between sum and products, when operation character is "+" it means it was a sum and "*" for product
       - And in sum i am adding some if else statement to make the difference if the denominator same or different
       - For the result we have to use es/ds for sum result and ep/dp for product result
    */

    public static void main (String[] args)
    {
        System.out.println(fractionCalculator(1, 2, 1, 3, '+'));
        System.out.println(fractionCalculator(1, 3, 3, 4, '+'));
        System.out.println(fractionCalculator(1, 2, 2, 3, '*'));
        System.out.println(fractionCalculator(1, 4, 2, 3, '*'));
    }
}