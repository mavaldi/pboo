package Soal1;

public class Q11Fraction
{
    public void fractionCalculator(int e1, int d1, int e2, int d2, char operation)
    {
        int eResult = 0;
        int dResult = 0;
        boolean result = true;
        switch (operation)
        {
            case '+' -> {
                if(d1 == d2)
                {
                    eResult = e1 + e2;
                    dResult = d1;
                }
                else
                {
                    eResult = e1 * d2 + e2 * d1;
                    dResult = d1 * d2;
                }
            }
            case '-' -> {
                if(d1 == d2)
                {
                    eResult = e1 - e2;
                    dResult = d1;
                }
                else
                {
                    eResult = e1 * d2 - e2 * d1;
                    dResult = d1 * d2;
                }
            }
            case '*' -> {
                eResult = e1 * e2;
                dResult = d1 * d2;
            }
            case '/' -> {
                eResult = e1 * d2;
                dResult = d1 * e2;
            }
            default -> {
                System.out.println("Your input operation is wrong, please choose (+, -, *, /)");
                result = false;
            }
        }
        if(result)
        {
            if(operation != '/')
                System.out.printf("Result of %d/%d %c %d/%d = %d/%d\n", e1, d1, operation, e2, d2, eResult, dResult);
            else
                System.out.printf("Result of %d/%d : %d/%d = %d/%d\n", e1, d1, e2, d2, eResult, dResult);
        }
    }
}
